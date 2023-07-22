package com.csqf.zx.controller;

import com.csqf.zx.entity.LikesEntity;
import com.csqf.zx.entity.ProductEntity;
import com.csqf.zx.result.ResponseResult;
import com.csqf.zx.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/17 001720:11
 */
@RestController
public class LikesController {

    @Autowired
    LikesService likesService;

    @RequestMapping("/likes")
    public ResponseResult likes(Integer pid){

        ResponseResult result = ResponseResult.SUCCESS();

        likesService.likes(pid);

        return result;
    }

    @RequestMapping("/selectLikes")
    public ResponseResult selectLikes(){

        ResponseResult result = ResponseResult.SUCCESS();

       Integer likes = likesService.selectLikes();
        result.setData(likes);
        return result;
    }

    @RequestMapping("/allLikes")
    public ResponseResult allLikes(){

        ResponseResult result = ResponseResult.SUCCESS();

        List<ProductEntity> likes = likesService.allLikes();
        result.setData(likes);
        return result;
    }

    @RequestMapping("/delLike")
    public ResponseResult delLike(Integer pid){

        ResponseResult result = ResponseResult.SUCCESS();

        likesService.delLike(pid);

        return result;
    }
}
