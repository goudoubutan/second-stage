package com.csqf.zx.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author xinforever
 * @Date 2023/7/13 001313:57
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterVO {

    private String username;

    private String password;

    private String phone;

    private String email;

    private Integer rid;

    private Double money;

}
