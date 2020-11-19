package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping
    @ApiOperation(value = "用户列表", notes = "这里是 notes")
    List<User> queryAll(){
        return userMapper.queryAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "用户信息")
    User queryById(@PathVariable("id") int id){
        return userMapper.queryById(id);
    }

    @PostMapping
    @ApiOperation(value = "新增用户")
    int add(User user){
        return userMapper.add(user);
    }

    @PutMapping
    @ApiOperation(value = "修改用户")
    int update(User user){
        return userMapper.updateById(user);
    }

    @DeleteMapping
    @ApiOperation(value = "删除用户")
    int delete(int id){
        return userMapper.deleteById(id);
    }
}
