package com.csqf.zx.controller;

import com.csqf.zx.entity.UserEntity;
import com.csqf.zx.service.UserService;
import me.chanjar.weixin.common.bean.WxOAuth2UserInfo;
import me.chanjar.weixin.common.bean.oauth2.WxOAuth2AccessToken;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class WxController {
    //用于存储用户的登录状态
    Map<String, UserEntity> stateMap = new HashMap<>();

    @Autowired
    WxMpService wxMpService;
    @RequestMapping("getWxLoginUrl")
    public Map<String,String> getWxLoginUrl(){
        //回调路径
        String redirectUri ="https://730467ku71.goho.co/wxCallback";
        //授权的范围
        String scope = "snsapi_userinfo";
        //自定义状态码
        String state = UUID.randomUUID().toString();

        String url = wxMpService.getOAuth2Service().buildAuthorizationUrl(redirectUri,scope,state);
        //需要将url和state都进行返回
        Map<String,String> map = new HashMap<>();
        map.put("state",state);
        map.put("url",url);
        return map;
    }
    @Autowired
    UserService userService;

    //回调方法
    @GetMapping("wxCallback")
    public String wxCallback(
            @RequestParam("code") String code, //验证code
            @RequestParam("state") String state,//带上状态码
            HttpSession session) throws Exception{
        //根据微信提供的code获取accessToken
        WxOAuth2AccessToken wxOAuth2AccessToken;
        try {
            //使用code，去微信服务器换取accessToken
            wxOAuth2AccessToken = wxMpService.getOAuth2Service().getAccessToken(code);
        }catch (WxErrorException e) {
            //log.info("微信网页授权: {}", e);
            throw new Exception(e.getError().getErrorMsg());
        }
        //使用accessToken从微信服务器获取用户的信息
        //openId是微信用户在当前公众号中的唯一标识
        String openId = wxOAuth2AccessToken.getOpenId();
        //获取用户的信息
        WxOAuth2UserInfo userInfo = wxMpService.getOAuth2Service().getUserInfo(wxOAuth2AccessToken,openId);
        System.out.println("用户的信息:"+userInfo.getNickname());
        //业务代码

        UserEntity loginUser = userService.findByOpenId(openId);


//        if(loginUser==null){
//            //注册新的账号
//            loginUser = new UserEntity();
//            loginUser.setUsername(userInfo.getNickname());
//            loginUser.setOpenId(openId);
//            loginUser.setPassword("123456");
//            //保存账号
//            userService.save(loginUser);
//        }
//        //将用户的状态码作为key，用户的信息作为值进行报名
//        stateMap.put(state,loginUser);

        session.setAttribute("loginUser",loginUser);
        return "登录成功";
    };

    @GetMapping("checkLogin")
    public String checkLogin(String state, HttpSession session){
        //从stateMap中验证用户是否已经登录
        UserEntity userEntity = stateMap.get(state);
        if(userEntity!=null){
            //登录成功之后，将用户的信息存储在session中
            session.setAttribute("loginUser",userEntity);
            return "true";
        }
        return "false";
    }
}
