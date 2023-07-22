package com.csqf.zx.service;

import com.csqf.zx.entity.LikesEntity;
import com.csqf.zx.entity.ProductEntity;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/17 001720:10
 */
public interface LikesService {
    void likes(Integer pid);

    Integer selectLikes();

    List<ProductEntity> allLikes();

    void delLike(Integer pid);
}
