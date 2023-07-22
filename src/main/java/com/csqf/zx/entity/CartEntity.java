package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类
 * @author makejava
 * @since 2023-07-18 08:36:39
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartEntity implements Serializable {
    private static final long serialVersionUID = 622071982495728456L;
    
    private Integer cid;
    
    private Integer pid;
    
    private String pname;
    
    private Double pprice;
    
    private String psrc;
    
    private Integer cnum;
    
    private Double ctotal;

    private Integer cstatus;
}

