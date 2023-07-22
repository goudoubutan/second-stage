package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类
 * @author makejava
 * @since 2023-07-19 19:37:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailEntity implements Serializable {
    private static final long serialVersionUID = -24691046531124093L;
    
    private Integer odid;
    
    private String oid;
    
    private String odname;
    
    private Double odmoney;
    
    private Integer odnum;

}

