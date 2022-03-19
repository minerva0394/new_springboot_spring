package com.example.springboot.mapper;

import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from sys_user")
    List<User> findAll();

    @Insert("INSERT INTO sys_user(userName,userPassword,nickName,email,phone,address) VALUES " +
            "(#{userName},#{userPassword},#{nickName},#{email},#{phone},#{address})")
    int insert(User user);

    int update(User user);

    int deleteById(@Param("id") Integer id);
}
