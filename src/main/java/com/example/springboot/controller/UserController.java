package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    // 新增&修改
    @PostMapping
    public Integer save(@RequestBody User user){
        return userService.save(user);
    }

    // 查询所有
    @GetMapping("/findAll")
    public List<User> index() {
        User user = new User();

        return userMapper.findAll();
    }

    // 删除
    @DeleteMapping("/delete/{id}")
    public Integer delete(@PathVariable Integer id){
        return userMapper.deleteById(id);
    }

}
