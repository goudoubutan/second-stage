package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *实体类
 * @author makejava
 * @since 2023-07-14 17:54:48
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity implements Serializable {
    private static final long serialVersionUID = 650938441803480736L;
    
    private Integer pid;
    
    private Integer mid;
    
    private String pname;
    
    private Double pprice;
    
    private String pinfo;
    /**
     * 0:下架；1:上架
     */
    private String pstatus;
    
    private String psrc;
    
    private String pstar;

    private Double oprice;
}

