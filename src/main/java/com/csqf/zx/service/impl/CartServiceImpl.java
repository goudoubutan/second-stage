package com.csqf.zx.service.impl;

import com.csqf.zx.entity.CartEntity;
import com.csqf.zx.mapper.CartMapper;
import com.csqf.zx.service.CartService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/18 00188:38
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartMapper cartMapper;

    @Override
    public void addCart( CartEntity cartEntity) {
        cartMapper.addCart(cartEntity);
    }

    @Override
    public Integer selectCart() {
        return cartMapper.selectCart();
    }

    @Override
    public List<CartEntity> allCartProducts() {
        return cartMapper.allCartProducts();
    }

    @Override
    public void deleteCart(Integer cid) {
        cartMapper.deleteCart(cid);
    }

    @Override
    public CartEntity findByCid(Integer cid) {
        return cartMapper.findByCid(cid);
    }
    @Override
    public List<CartEntity> selectCid() {
        return cartMapper.selectCid();
    }
}
