<%--
  Created by IntelliJ IDEA.
  User: chentao
  Date: 2018/5/4
  Time: 8:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel='stylesheet' id='bootstrap-css-css'  href='CSS/login.css' type='text/css' media='all' />


</head>
<body>

<div class='login'>

    <!--<img class="MyLogo" src="loginSpecial/images/logo01.png" alt="   LOGO">-->
    <div class='login_title'>
        <span>管理员登录</span>
    </div>
    <div class='login_fields'>
        <div class='login_fields__user'>
            <div class='icon'>

                <img alt="" src='loginSpecial/img/user_icon_copy.png'>
            </div>
            <input name="login" placeholder='用户名' maxlength="16" class="username" type='text' autocomplete="off" value="admin"/>
            <div class='validation'>
                <img alt="" src='loginSpecial/img/tick.png'>
            </div>
        </div>
        <div class='login_fields__password'>
            <div class='icon'>
                <img alt="" src='loginSpecial/img/lock_icon_copy.png'>
            </div>
            <input name="pwd" class="passwordNumder" placeholder='密码' maxlength="16" type='text' autocomplete="off">
            <div class='validation'>
                <img alt="" src='loginSpecial/img/tick.png'>
            </div>
        </div>
        <div class='login_fields__password'>
            <div class='icon'>
                <img alt="" src='loginSpecial/img/key.png'>
            </div>
            <input name="code" placeholder='验证码' maxlength="4"  class="ValidateNum" type='text' name="ValidateNum" autocomplete="off">
            <div class='validation' style="opacity: 1; right: -5px;top: -3px;">
                <canvas class="J_codeimg" id="myCanvas" onclick="Code();">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
            </div>
        </div>
        <div class='login_fields__submit'>
            <input type='button' onclick="logingaction()" value='登录'>
        </div>
    </div>
</div>
<script src="https://cdn.staticfile.org/jquery/3.1.1/jquery.min.js"></script>
<script src="JS/Treatment.js" type="text/javascript"></script>
<script src="JS/controlLogin.js" type="text/javascript"></script>
</body>
</html>
