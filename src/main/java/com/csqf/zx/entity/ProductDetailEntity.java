package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类
 * @author makejava
 * @since 2023-07-15 16:06:16
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailEntity implements Serializable {
    private static final long serialVersionUID = 544956306622718313L;
    
    private Integer did;
    
    private Integer pid;
    
    private String dreview;
    
    private Integer color;
    
    private Integer size;

    private ProductEntity productEntity;

}

