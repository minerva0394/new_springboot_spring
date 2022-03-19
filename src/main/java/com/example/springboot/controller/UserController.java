package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {

    @Autowired
    private UserMapper userMapper;

    // 测试java后端代码上传
    @GetMapping("/")
    public List<User> index() {
        User user = new User();

        return userMapper.finaAll();
    }
}
