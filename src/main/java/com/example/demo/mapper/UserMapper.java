package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User queryById(@Param("id") int id);

    @Select("select * from user limit 1000")
    List<User> queryAll();

    @Insert({"insert into user(name,age) values(#{name},#{age})"})
    int add(User user);

    @Delete("delete from user where id = ${id}")
    int delById(int id);

    @Update("update user set name=${name}, age=#{age} where id=#{id}")
    int updateById(User user);
}
