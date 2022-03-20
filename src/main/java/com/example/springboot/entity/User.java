package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName(value = "sys_user")
@ApiModel("用户类")
public class User {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("主键id")
    private Integer id;
    private String username;
    @JsonIgnore
    private String userpassword;
    private String nickname;
    private String email;
    private String phone;
    private String address;
    private String avatar;
}
