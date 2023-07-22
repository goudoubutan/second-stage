package com.csqf.zx.service;

import com.csqf.zx.entity.CartEntity;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/18 00188:38
 */
public interface CartService {
    void addCart(CartEntity cartEntity);

    Integer selectCart();

    List<CartEntity> allCartProducts();

    void deleteCart(Integer cid);

    CartEntity findByCid(Integer cid);
    List<CartEntity> selectCid();
}
