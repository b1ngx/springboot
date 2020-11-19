package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping
    @ApiOperation(value = "用户列表")
    List<User> queryAll(){
        return userMapper.queryAll();
    }

    @GetMapping("/{id}")
    User queryById(@PathVariable("id") int id){
        return userMapper.queryById(id);
    }

    @PostMapping
    int add(User user){
        return userMapper.add(user);
    }

    @PutMapping
    int update(User user){
        return userMapper.updateById(user);
    }

    @DeleteMapping
    int delete(int id){
        return userMapper.deleteById(id);
    }
}
