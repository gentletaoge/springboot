package com.example.demoshiro.dao;

import com.example.demoshiro.entity.User;
//import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    String getPassword(String name);
    String getRole(String name);

}
