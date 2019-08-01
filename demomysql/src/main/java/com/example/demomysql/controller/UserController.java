package com.example.demomysql.controller;

import com.example.demomysql.entity.User;
import com.example.demomysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "通过id查询用户")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Long",paramType = "path")
    @RequestMapping(value="getUser/{id}", method = RequestMethod.GET)
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

    @ApiOperation(value = "通过name查询用户")
    @ApiImplicitParam(name = "name",value = "用户name",required = true,dataType = "String",paramType = "path")
    @RequestMapping(value="getUserByName/{name}",method = RequestMethod.GET)
    public String GetUserByName(@PathVariable String name){
        //String name="abc";
        return userService.SelByName(name).toString();
    }

    @ApiOperation(value = "增加用户接口1")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户is",required = true,dataType = "int",paramType = "path"),
            @ApiImplicitParam(name = "name",value = "用户name",required = true,dataType = "String",paramType = "path"),
            @ApiImplicitParam(name = "passwd",value = "用户passwd",required = true,dataType = "String",paramType = "path"),
            @ApiImplicitParam(name = "realname",value = "用户ralname",required = true,dataType = "String",paramType = "path")
    })
    @RequestMapping(value="insert/{id}/{name}/{passwd}/{realname}", method = RequestMethod.POST)
    public boolean insert(@PathVariable int id ,@PathVariable String name,@PathVariable String passwd,@PathVariable String realname){
        User user = new User();
        user.setId(id);
        user.setUserName(name);
        user.setPassWord(passwd);
        user.setRealName(realname);
        return userService.insert(user);
    }

    @ApiOperation(value = "增加用户接口2")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户is",required = true,dataType = "int",paramType = "query"),
            @ApiImplicitParam(name = "name",value = "用户name",required = true,dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "passwd",value = "用户passwd",required = true,dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "realname",value = "用户ralname",required = true,dataType = "String",paramType = "query")
    })
    @RequestMapping(value="insert2", method = RequestMethod.POST)
    public boolean insert2(@RequestParam int id , @RequestParam String name, @RequestParam String passwd, @RequestParam String realname){
        User user = new User();
        user.setId(id);
        user.setUserName(name);
        user.setPassWord(passwd);
        user.setRealName(realname);
        return userService.insert(user);
    }

    @ApiOperation(value = "增加用户接口2")
    @RequestMapping(value="insertSelective",method = RequestMethod.GET)
    public boolean insertSelective(){
        User user = new User();
        user.setId(4);
        user.setUserName("ccc");
        user.setPassWord("ccc");
        user.setRealName("员工");
        return userService.insertSelective(user);
    }

    @ApiOperation(value = "更新用户")
    @RequestMapping(value="updateByPrimaryKeySelective",method = RequestMethod.GET)
    public boolean updateByPrimaryKeySelective(){
        User user = new User();
        user.setId(4);
        user.setUserName("fff");
        user.setPassWord("fff");
        return userService.updateByPrimaryKeySelective(user);
    }

    @ApiOperation(value = "通过id删除用户")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Long",paramType = "path")
    @RequestMapping(value="deleteByPrimaryKey/{id}",method = RequestMethod.GET)
    public boolean deleteByPrimaryKey(@PathVariable int id){
        return userService.deleteByPrimaryKey(id);
    }
}
