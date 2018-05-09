package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

    @RequestMapping("/Login")
    public String LogingdoGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        request.setCharacterEncoding("UTF-8");
        String usernaem = request.getParameter("usernaem");
        String password = request.getParameter("password");
        User user = userService.login(usernaem, password);
        if (user != null){
            request.getSession().setAttribute("user",user);
                    return "admin/CKeditor";
        }else {     return "error";        }
    }
    protected void LogindoPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LogingdoGet(request, response);
    }
    //页面注册页面跳转
    @RequestMapping("/RegisterPag")
    public String GoToRegister(){
        return "RegisterUser";
    }
    //注册页面的激活方法调用
    @RequestMapping("/Register")
    public String RegisterdoGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        request.setCharacterEncoding("UTF-8");
        String useremail = request.getParameter("Useremail");
        String password = request.getParameter("password");
        //注释调用的邮件
        User user = userService.login(useremail, password);
        if (user != null){
            request.getSession().setAttribute("user",user);
            return "admin/CKeditor";
        }else {     return "error";        }
    }
    protected void RegisterdoPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RegisterdoGet(request, response);
    }

}
