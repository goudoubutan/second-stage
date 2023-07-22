package com.csqf.zx.vo;

import com.csqf.zx.entity.ProductEntity;
import lombok.Data;

/**
 * @Author xinforever
 * @Date 2023/7/15 001516:22
 */
@Data
public class ProductDetailVO {

    private String dreview;

    private Integer color;

    private Integer size;

    private ProductEntity productEntity;

}
