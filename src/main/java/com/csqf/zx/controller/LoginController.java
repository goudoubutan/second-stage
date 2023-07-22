package com.csqf.zx.controller;

import com.csqf.zx.bcrypt.BCryptPasswordEncoder;
import com.csqf.zx.entity.UserEntity;
import com.csqf.zx.result.ResponseResult;
import com.csqf.zx.service.UserService;
import com.csqf.zx.utils.SmsUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * @Author xinforever
 * @Date 2023/7/12 001216:47
 */
@RestController
public class LoginController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //设置访问路径为 “/” 跳转到指定页面
        registry.addViewController("/").setViewName("forward:/pages/login.html");
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/LoginByPhone")
    public String LoginByPhone(String phone,String code,HttpSession session){
        UserEntity user = userService.queryUserByPhone(phone);
        if(user == null){
            // 未注册,跳转到注册页面
            return "-1";
        }else if(!session.getAttribute("PhoneCode").equals(code)){
            // 验证码错误
            return "0";
        }else {
            // 登录成功
            session.setAttribute("loginUser", user);
            return "1";
        }
    }

    @RequestMapping("sendCode")
    public void sendCode(String phone, HttpSession session){

        String code = buildSms(6);
        System.out.println(code);

        try {
            SmsUtils.sendMsg(phone,code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.setAttribute("PhoneCode",code);
    }

    @RequestMapping("/getLoginUser")
    public ResponseResult getLoginUser(HttpSession session){

        ResponseResult<UserEntity> result = ResponseResult.SUCCESS();
        UserEntity sessionLoginUser = (UserEntity) session.getAttribute("loginUser");
        result.setData(sessionLoginUser);

        return result;
    }

    private String buildSms(int length) {

        StringBuilder s = new StringBuilder();
        Random random = new Random();
        for(int i = 1 ; i <= length ; i++){
            s.append(random.nextInt(10));
        }
        return s.toString();
    }

}
