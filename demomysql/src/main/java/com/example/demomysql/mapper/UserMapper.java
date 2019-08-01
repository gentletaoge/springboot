package com.example.demomysql.mapper;

import com.example.demomysql.entity.User;
//import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

    User Sel(int id);
    User SelByName(String name);
    boolean insert(User user);
    boolean insertSelective(User user);
    boolean updateByPrimaryKeySelective(User user);
    boolean deleteByPrimaryKey(int id);
}
