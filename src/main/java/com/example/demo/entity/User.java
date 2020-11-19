package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户对象")
public class User {
    private int id;
    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "年龄")
    private int age;
}
