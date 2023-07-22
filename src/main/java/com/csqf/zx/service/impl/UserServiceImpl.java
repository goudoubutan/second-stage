package com.csqf.zx.service.impl;

import com.csqf.zx.entity.UserEntity;
import com.csqf.zx.mapper.UserMapper;
import com.csqf.zx.service.UserService;
import com.csqf.zx.vo.RegisterVO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xinforever
 * @Date 2023/7/12 001216:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserEntity queryUserByPhone(String phone) {
        return userMapper.queryUserByPhone(phone);
    }

    @Override
    public UserEntity findByOpenId(String openId) {
        return userMapper.findByOpenId(openId);
    }


    @Override
    public void register(RegisterVO registerVO) {
        userMapper.register(registerVO);
    }
}
