package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类
 * @author makejava
 * @since 2023-07-12 16:53:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -96091365279351005L;
    
    private Integer id;
    
    private String username;
    
    private String password;
    
    private String phone;
    
    private String email;
    
    private Integer rid;

    private String openId;

    private Double money;
}

