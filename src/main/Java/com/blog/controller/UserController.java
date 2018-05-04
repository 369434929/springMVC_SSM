package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;
//添加方法
    @RequestMapping("/add")
    public void add(User user){
        userService.add(user);
    }
//ajax 异步返回
    @RequestMapping("/getById")
    @ResponseBody
    public User getById(String id){
        return userService.getById(id);
    }
//返回页面返回的是页面名字！
    @RequestMapping("/indexUI")
    public String indexUI(){
        return "index";
    }
}
