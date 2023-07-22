package com.csqf.zx.service.impl;

import com.csqf.zx.entity.ProductEntity;
import com.csqf.zx.mapper.ProductMapper;
import com.csqf.zx.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/14 001418:47
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductEntity> product() {
        return productMapper.allProducts();
    }

}
