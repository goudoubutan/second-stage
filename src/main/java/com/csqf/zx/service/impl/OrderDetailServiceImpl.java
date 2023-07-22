package com.csqf.zx.service.impl;

import com.csqf.zx.entity.OrderDetailEntity;
import com.csqf.zx.mapper.OrderDetailMapper;
import com.csqf.zx.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/19 001919:39
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    OrderDetailMapper orderDetailMapper;

    @Override
    public void saveOrderDetail(OrderDetailEntity orderDetailEntity) {
        orderDetailMapper.saveOrderDetail(orderDetailEntity);
    }

    @Override
    public List<OrderDetailEntity> getOrderDetail(String oid) {
        return orderDetailMapper.getOrderDetail(oid);
    }

}
