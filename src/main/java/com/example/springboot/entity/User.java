package com.example.springboot.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String userPassword;
    private String nickName;
    private String email;
    private String address;
}
