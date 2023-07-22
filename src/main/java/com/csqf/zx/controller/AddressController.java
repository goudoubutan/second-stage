package com.csqf.zx.controller;

import com.csqf.zx.entity.AddressEntity;
import com.csqf.zx.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author xinforever
 * @Date 2023/7/18 001820:04
 */
@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping(value = "/provinces",method = RequestMethod.GET)
    public List<AddressEntity> provinces(){

        return addressService.province();
    }

    @RequestMapping(value = "/city",method = RequestMethod.GET)
    public List<AddressEntity> city(Integer provinceid){

        return addressService.city(provinceid);
    }

    @RequestMapping(value = "/area",method = RequestMethod.GET)
    public List<AddressEntity> area(Integer cityid){

        return addressService.area(cityid);
    }

}
