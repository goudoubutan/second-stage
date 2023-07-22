package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类
 * @author makejava
 * @since 2023-07-17 20:07:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikesEntity implements Serializable {
    private static final long serialVersionUID = -84915860670928520L;
    
    private Integer lid;
    
    private Integer pid;
    
    private Double price;
    
    private Integer mid;
    
    private Integer color;
    
    private Integer size;
    
    private String psrc;

    private ProductEntity productEntity;
}

