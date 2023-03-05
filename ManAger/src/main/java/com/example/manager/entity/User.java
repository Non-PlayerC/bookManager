package com.example.manager.entity;

import lombok.Data;

@Data
//替代 get set 函数
public class User {
    private Integer id;
    private String name;
    private String username;
    private String address;
    private Integer age;
    private String sex;
    private Integer phone;

}
