package com.csqf.zx.service.impl;

import com.csqf.zx.entity.ProductDetailEntity;
import com.csqf.zx.mapper.DetailMapper;
import com.csqf.zx.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author xinforever
 * @Date 2023/7/15 001516:19
 */
@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    DetailMapper detailMapper;

    @Override
    public ProductDetailEntity productDetail(Integer pid) {
        return detailMapper.productDetail(pid);
    }
}
