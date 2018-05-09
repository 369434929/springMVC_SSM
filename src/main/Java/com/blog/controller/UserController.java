package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.UserService;
import com.blog.util.QQemail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
    public String RegisterdoGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, MessagingException {
        request.setCharacterEncoding("UTF-8");
        String useremail = request.getParameter("Useremail");
        String password = request.getParameter("password");
        String struuid=UUID.randomUUID().toString().replaceAll("-", "");
        StringBuffer strBuffer=new StringBuffer();
        strBuffer.append("<a href=\\\"http://localhost:8080/mailtest/emailcheck.action?op=activate&id=\"");
        strBuffer.append(struuid);
        strBuffer.append("&password=");
        strBuffer.append(password);
        strBuffer.append("&useremail=");
        strBuffer.append(useremail);
        strBuffer.append("\">http://localhost:8080/mailtest/emailcheck.action?op=activate&id=");
        strBuffer.append(struuid);
        strBuffer.append("&password=");
        strBuffer.append(password);
        strBuffer.append("&useremail=");
        strBuffer.append(useremail);
        strBuffer.append("</a>"+"<br/>如果以上链接无法点击，请把上面网页地址复制到浏览器地址栏中打开<br/><br/><br/>LOFTER，专注兴趣，分享创作<br/>"+new Date()+ "</div></div>" );
        //调用邮箱的逻辑
        QQemail mail = new QQemail("1358129947@qq.com","rzzfoeiwzeqvjdcc");
        Map<String,String> map= new HashMap<String,String>();
        map.put("mail.smtp.host", "smtp.qq.com");
        map.put("mail.smtp.auth", "true");
        map.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        map.put("mail.smtp.port", "465");
        map.put("mail.smtp.socketFactory.port", "465");
        mail.setPros(map);
        mail.initMessage();
        mail.setRecipients(useremail);
        String str=strBuffer.toString();
        mail.setSubject(strBuffer.toString());
        mail.setDate(new Date());
        mail.setFrom("MY");

        System.out.println(mail.sendMessage());
        //注释调用的邮件
        System.out.println("123");
        return "  ";
    }
    protected void RegisterdoPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, MessagingException {
        RegisterdoGet(request, response);
    }

}
