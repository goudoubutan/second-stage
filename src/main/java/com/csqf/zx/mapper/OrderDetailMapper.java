package com.csqf.zx.mapper;

import com.csqf.zx.entity.OrderDetailEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/19 001919:39
 */
public interface OrderDetailMapper {
    void saveOrderDetail(@Param("orderDetailEntity") OrderDetailEntity orderDetailEntity);

    List<OrderDetailEntity> getOrderDetail(String oid);

}
