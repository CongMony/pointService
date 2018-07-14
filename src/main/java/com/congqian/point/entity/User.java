package com.congqian.point.entity;

import lombok.Data;

/**
 * @program: point
 * @description: 用户信息
 * @author: Cong.Qian
 * @create: 2018-07-15 00:12
 **/
@Data
public class User {
    private String id;

    private String name;

    private String password;

    private String department;

    private Double score;
}
