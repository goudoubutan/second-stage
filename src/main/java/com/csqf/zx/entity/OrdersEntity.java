package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体类
 * @author makejava
 * @since 2023-07-19 15:12:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersEntity implements Serializable {
    private static final long serialVersionUID = -11434728083033610L;
    
    private String oid;
    
    private Integer id;
    
    private Double omoney;
    
    private Integer ostatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdtime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date canceltime;

}

