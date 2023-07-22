package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类
 * @author makejava
 * @since 2023-07-14 09:58:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeEntity implements Serializable {
    private static final long serialVersionUID = -33778144483773030L;
    
    private Integer tid;
    private String tname;
    private String tsrc;
    private String tnum;

}

