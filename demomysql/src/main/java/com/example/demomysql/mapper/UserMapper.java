package com.example.demomysql.mapper;


import com.example.demomysql.entity.User;
//import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

    User Sel(int id);
}
