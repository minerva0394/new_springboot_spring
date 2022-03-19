package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    @JsonIgnore
    private String userPassword;
    private String nickName;
    private String email;
    private String phone;
    private String address;
}
