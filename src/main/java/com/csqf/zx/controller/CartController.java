package com.csqf.zx.controller;

import com.csqf.zx.entity.CartEntity;
import com.csqf.zx.result.ResponseResult;
import com.csqf.zx.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/18 00188:33
 */
@RestController
public class CartController {

    @Autowired
    CartService cartService;

    @RequestMapping("/addCart")
    public ResponseResult addCart(CartEntity cartEntity) {
        ResponseResult result = ResponseResult.SUCCESS();

        cartService.addCart(cartEntity);

        return result;
    }

    @RequestMapping("/selectCart")
    public ResponseResult selectCart() {
        ResponseResult result = ResponseResult.SUCCESS();

        Integer selectCart = cartService.selectCart();
        result.setData(selectCart);
        return result;
    }

    @RequestMapping("/allCartProducts")
    public ResponseResult allCartProducts() {
        ResponseResult result = ResponseResult.SUCCESS();

        List<CartEntity> cartEntities = cartService.allCartProducts();
        result.setData(cartEntities);
        return result;
    }

    @RequestMapping("/delCart")
    public ResponseResult deleteCart(Integer cid) {
        ResponseResult result = ResponseResult.SUCCESS();

        cartService.deleteCart(cid);
        return result;
    }

}
