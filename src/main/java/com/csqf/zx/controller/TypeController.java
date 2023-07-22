package com.csqf.zx.controller;

import com.csqf.zx.entity.TypeEntity;
import com.csqf.zx.result.ResponseResult;
import com.csqf.zx.service.TypeService;
import com.csqf.zx.vo.TypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/14 00149:57
 */
@RestController
public class TypeController {

    @Autowired
    TypeService typeService;

    @RequestMapping("/allTypes")
    public ResponseResult allTypes(){
        ResponseResult<List<TypeEntity>> result =  ResponseResult.SUCCESS();

        List<TypeEntity> typeList = typeService.allTypes();
        result.setData(typeList);

        return result;
    }

}
