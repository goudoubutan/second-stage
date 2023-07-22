package com.csqf.zx.service.impl;

import com.csqf.zx.entity.AddressEntity;
import com.csqf.zx.mapper.AddressMapper;
import com.csqf.zx.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/18 001820:04
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public List<AddressEntity> province() {
        return addressMapper.province();
    }

    @Override
    public List<AddressEntity> city(Integer provinceid) {
        return addressMapper.city(provinceid);
    }

    @Override
    public List<AddressEntity> area(Integer cityid) {
        return addressMapper.area(cityid);
    }

}
