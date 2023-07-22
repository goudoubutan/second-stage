package com.csqf.zx.service;

import com.csqf.zx.entity.UserEntity;
import com.csqf.zx.vo.RegisterVO;

/**
 * @Author xinforever
 * @Date 2023/7/12 001216:47
 */
public interface UserService {
    UserEntity queryUserByPhone(String phone);

    UserEntity findByOpenId(String openId);

    void register(RegisterVO registerVO);
}
