package com.csqf.zx.mapper;

import com.csqf.zx.entity.UserEntity;
import com.csqf.zx.vo.RegisterVO;
import org.apache.ibatis.annotations.Param;

/**
 * @Author xinforever
 * @Date 2023/7/12 001217:09
 */
public interface UserMapper {
    UserEntity queryUserByPhone(String phone);

    UserEntity findByOpenId(String openId);

    void register(@Param("registerVO") RegisterVO registerVO);
}
