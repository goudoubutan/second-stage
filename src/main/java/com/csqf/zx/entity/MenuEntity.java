package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author xinforever
 * @Date 2023/7/13 001320:26
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuEntity implements Serializable {
    private static final long serialVersionUID = 717910366375749485L;

    private Integer mid;

    private String mname;


}