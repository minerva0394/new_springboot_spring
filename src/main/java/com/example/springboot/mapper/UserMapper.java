package com.example.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Select("select * from sys_user")
//    List<User> findAll();
//
//    @Insert("INSERT INTO sys_user(username,userpassword,nickname,email,phone,address) VALUES " +
//            "(#{username},#{userpassword},#{nickname},#{email},#{phone},#{address})")
////    int insert(User user);
//
//    int update(User user);
//
//    int deleteById(@Param("id") Integer id);

//    @Select("select * from sys_user where username like concat('%',#{username},'%')"+
//            "limit #{pageNum}, #{pageSize}")
//    List<User> selectPage(Integer pageNum, Integer pageSize, String username);
//
//    @Select("SELECT COUNT(*) FROM sys_user where username like concat('%',#{username},'%')")
//    Integer findTotal(String username);
}
