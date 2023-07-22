package com.csqf.zx.mapper;

import com.csqf.zx.entity.AddressEntity;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/18 001820:05
 */
public interface AddressMapper {

    List<AddressEntity> province();

    List<AddressEntity> city(Integer provinceid);

    List<AddressEntity> area(Integer cityid);

}
