package com.csqf.zx.service.impl;

import com.csqf.zx.entity.OrdersEntity;
import com.csqf.zx.mapper.OrderMapper;
import com.csqf.zx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/19 001915:14
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public void generateOrder(String omoney, String oid, Date createdtime,Date canceltime) {
        orderMapper.generateOrder(omoney,oid,createdtime,canceltime);
    }

    @Override
    public List<OrdersEntity> getOrders() {
        return orderMapper.getOrders();
    }

    @Override
    public void delOrder(String oid) {
        orderMapper.delOrder(oid);
    }

    @Override
    public OrdersEntity getOrder(String oid) {
        return orderMapper.getOrder(oid);
    }

    @Override
    public void updStatus(String oid) {
        orderMapper.updStatus(oid);
    }

    @Override
    public void checkCancelOrder() {
        orderMapper.checkCancelOrder();
    }

    @Override
    public List<OrdersEntity> findUnpay() {
        return orderMapper.findUnpay();
    }

    @Override
    public void saveOrderStatus(String oid) {
        orderMapper.saveOrderStatus(oid);
    }

}
