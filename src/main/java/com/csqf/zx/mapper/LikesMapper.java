package com.csqf.zx.mapper;

import com.csqf.zx.entity.ProductEntity;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/17 001720:11
 */
public interface LikesMapper {
    void likes(Integer pid);

    Integer selectLikes();

    List<ProductEntity> allLikes();

    void delLike(Integer pid);
}
