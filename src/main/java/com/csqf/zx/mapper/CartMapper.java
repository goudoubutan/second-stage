package com.csqf.zx.mapper;

import com.csqf.zx.entity.CartEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/18 00188:38
 */
public interface CartMapper {
    void addCart(@Param("cartEntity")CartEntity cartEntity);

    Integer selectCart();

    List<CartEntity> allCartProducts();

    void deleteCart(Integer cid);

    CartEntity findByCid(Integer cid);

    List<CartEntity> selectCid();
}
