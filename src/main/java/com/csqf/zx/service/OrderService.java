package com.csqf.zx.service;

import com.csqf.zx.entity.OrdersEntity;

import java.util.Date;
import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/19 001915:14
 */
public interface OrderService {
    void generateOrder(String omoney, String oid, Date createdtime,Date canceltime);


    List<OrdersEntity> getOrders();

    void delOrder(String oid);

    OrdersEntity getOrder(String oid);

    void updStatus(String oid);

    void checkCancelOrder();

    List<OrdersEntity> findUnpay();

    void saveOrderStatus(String oid);
}
