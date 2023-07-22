package com.csqf.zx.service;

import com.csqf.zx.entity.AddressEntity;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/18 001820:04
 */
public interface AddressService {

    List<AddressEntity> province();

    List<AddressEntity> city(Integer provinceid);

    List<AddressEntity> area(Integer cityid);

}
