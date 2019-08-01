package com.example.demomysql.service;


import com.example.demomysql.entity.User;
import com.example.demomysql.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public User SelByName(String name){
        return userMapper.SelByName(name);
    }

    public boolean insert(User user){

        return userMapper.insert(user);
    }
    public boolean insertSelective(User user){

        return userMapper.insertSelective(user);
    }

    public boolean updateByPrimaryKeySelective(User user){

        return userMapper.updateByPrimaryKeySelective(user);
    }

    public boolean deleteByPrimaryKey(int id){

        return userMapper.deleteByPrimaryKey(id);
    }

}

