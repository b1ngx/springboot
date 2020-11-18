package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User queryById(@PathVariable("id") int id){
        return userMapper.queryById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<User> queryAll(){
        return userMapper.queryAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    int add(User user){
        return userMapper.add(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    int update(User user){
        return userMapper.updateById(user);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    int delete(int id){
        return userMapper.delById(id);
    }
}
