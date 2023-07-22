package com.csqf.zx.service.impl;

import com.csqf.zx.entity.LikesEntity;
import com.csqf.zx.entity.ProductEntity;
import com.csqf.zx.mapper.LikesMapper;
import com.csqf.zx.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/17 001720:10
 */
@Service
public class LikesServiceImpl implements LikesService {

    @Autowired
    LikesMapper likesMapper;

    @Override
    public void likes(Integer pid) {
        likesMapper.likes(pid);
    }

    @Override
    public Integer selectLikes() {
        return likesMapper.selectLikes();
    }

    @Override
    public List<ProductEntity> allLikes() {
        return likesMapper.allLikes();
    }

    @Override
    public void delLike(Integer pid) {
        likesMapper.delLike(pid);
    }
}
