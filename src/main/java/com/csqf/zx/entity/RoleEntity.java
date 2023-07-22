package com.csqf.zx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *实体类
 * @author makejava
 * @since 2023-07-12 17:02:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity implements Serializable {
    private static final long serialVersionUID = 388613239404405856L;
    
    private Integer rid;
    
    private String rolename;

}

