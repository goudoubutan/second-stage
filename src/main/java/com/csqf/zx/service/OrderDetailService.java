package com.csqf.zx.service;

import com.csqf.zx.entity.OrderDetailEntity;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/19 001919:39
 */
public interface OrderDetailService {
    void saveOrderDetail(OrderDetailEntity orderDetailEntity);

    List<OrderDetailEntity> getOrderDetail(String oid);

}
