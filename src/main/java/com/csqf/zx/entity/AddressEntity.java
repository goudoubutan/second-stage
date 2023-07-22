package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity {

    private Integer provinceid;
    private Integer cityid;
    private Integer areaid;
    private String provinceName;
    private String cityName;
    private String areaName;

}
