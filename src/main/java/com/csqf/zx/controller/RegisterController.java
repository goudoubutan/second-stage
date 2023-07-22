package com.csqf.zx.controller;

import com.csqf.zx.bcrypt.BCryptPasswordEncoder;
import com.csqf.zx.entity.UserEntity;
import com.csqf.zx.result.ResponseResult;
import com.csqf.zx.service.UserService;
import com.csqf.zx.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author xinforever
 * @Date 2023/7/13 001313:51
 */
@RestController
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public ResponseResult register(UserEntity userEntity, HttpSession session){

        ResponseResult<RegisterVO> result = ResponseResult.SUCCESS();

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        RegisterVO registerVO = new RegisterVO();

        registerVO.setUsername(userEntity.getUsername());
        registerVO.setPassword(encoder.encode(userEntity.getPassword()));
        registerVO.setPhone(userEntity.getPhone());
        registerVO.setEmail(userEntity.getEmail());
        // 注册用户默认为普通用户
        registerVO.setRid(3);
        registerVO.setMoney(10000.0);
         userService.register(registerVO);

        session.setAttribute("loginUser",registerVO);
         return result;
    }

}
