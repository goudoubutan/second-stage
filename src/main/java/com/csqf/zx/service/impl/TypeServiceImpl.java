package com.csqf.zx.service.impl;

import com.csqf.zx.entity.TypeEntity;
import com.csqf.zx.mapper.TypeMapper;
import com.csqf.zx.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/14 001410:02
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
     TypeMapper typeMapper;

    @Override
    public List<TypeEntity> allTypes() {
        return typeMapper.allTypes();
    }
}
