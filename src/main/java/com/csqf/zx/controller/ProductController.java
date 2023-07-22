package com.csqf.zx.controller;

import com.csqf.zx.entity.ProductDetailEntity;
import com.csqf.zx.entity.ProductEntity;
import com.csqf.zx.result.ResponseResult;
import com.csqf.zx.service.DetailService;
import com.csqf.zx.service.ProductService;
import com.csqf.zx.vo.ProductDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/14 001417:53
 */
@RestController
public class ProductController {
    @Autowired
     ProductService productService;

    @Autowired
    DetailService detailService;

    @RequestMapping("/product")
    public ResponseResult product(){
        ResponseResult result = ResponseResult.SUCCESS();

        List<ProductEntity> products = productService.product();
        result.setData(products);
        return result;
    }

    @RequestMapping("/productDetail")
    public ResponseResult productDetail(Integer pid){
//        Integer pid = Integer.valueOf(pid);
        ResponseResult result = ResponseResult.SUCCESS();
        ProductDetailEntity productEntity = detailService.productDetail(pid);

        ProductDetailVO productDetailVO = new ProductDetailVO();
        productDetailVO.setProductEntity(productEntity.getProductEntity());
        productDetailVO.setDreview(productEntity.getDreview());
        productDetailVO.setColor(productEntity.getColor());
        productDetailVO.setSize(productEntity.getSize());

        result.setData(productDetailVO);
        return result;
    }

}
