<%--
  Created by IntelliJ IDEA.
  User: chentao
  Date: 2018/5/9
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <link rel='stylesheet' id='bootstrap-css-css'  href='../../../CSS/login.css' type='text/css' media='all' />
    <style type="text/css">
        body .login_fields{
            padding: 10px 0px;
        }
    </style>
</head>

<body>
<div class='login'>
    <!--<img class="MyLogo" src="loginSpecial/images/logo01.png" alt="   LOGO">-->
    <div class='login_title' style="height: 30px">
        <span>用户注册</span>
    </div>
    <div class='login_fields' >
        <form action="Register.do" onsubmit="return validate_form(this)" method="post">
            <div class='login_fields__user'>
                <div class='icon'>
                    <img alt="" src='loginSpecial/img/user_icon_copy.png'>
                </div>
                <input name="Useremail" placeholder='注册邮箱' class="username" maxlength="16" class="username" type='text' autocomplete="off" value="" style="padding-left: 0px;"/>
                <div class='validation'>
                    <img alt="" src='loginSpecial/img/tick.png'>
                </div>
            </div>
            <div class='login_fields__password'>
                <div class='icon'>
                    <img alt="" src='loginSpecial/img/lock_icon_copy.png'>
                </div>
                <input name="password" class="passwordNumder" placeholder='密码' maxlength="16" type='password' autocomplete="off" value=""  style="padding-left: 0px;">
                <div class='validation'>
                    <img alt="" src='loginSpecial/img/tick.png'>
                </div>
            </div>
            <div class='login_fields__password'>
                <div class='icon'>
                    <img alt="" src='loginSpecial/img/lock_icon_copy.png'>
                </div>
                <input name="verifyPassword" class="passwordNumder" placeholder='重复密码' maxlength="16" type='password' autocomplete="off" value=""  style="padding-left: 0px;">
                <div class='validation'>
                    <img alt="" src='loginSpecial/img/tick.png'>
                </div>
            </div>
            <div class='login_fields__password'>
                <div class='icon'>
                    <img alt="" src='loginSpecial/img/key.png'>
                </div>
                <input name="codeStr" placeholder='验证码' maxlength="4"  class="ValidateNum" type='text' name="ValidateNum" autocomplete="off" style="padding-left: 0px;">
                <div class='validation' style="opacity: 1; right: -5px;top: -3px;">
                    <canvas class="J_codeimg" id="myCanvas" onclick="createCode('')" data-yourvalue="">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
                </div>
            </div>
            <div class='login_fields__submit'>
                <input type='submit'  value='注册'>
            </div>
        </form>
    </div>
</div>
</body>

<script type="text/javascript">
    window.onload=function(){
        createCode("")
    };
    //非空验证 、 code验证 、 重复密码验证
    function validate_form(thisfrom) {
        with (thisfrom)
        {
            if (validate_required(Useremail,"Useremail must be filled out!")==false)
            {Useremail.focus();return false}
            if (validate_required(password,"password must be filled out!")==false)
            {password.focus();return false}
            if (validate_required(verifyPassword,"password must be filled out!")==false)
            {password.focus();return false}
            if (validate_required(codeStr,"code must be filled out!")==false)
            {codeStr.focus();return false}
            if(codeStr.value.toUpperCase() != document.getElementById("myCanvas").title.toUpperCase()){
                alert("Please enter the correct");
                codeStr.focus();return false
            }
            if(password.value.toUpperCase() != verifyPassword.value.toUpperCase() ){
                alert("Please enter the passwrod");
                codeStr.focus();return false
            }
        }
    }
    function validate_required(field,alerttxt)
    {
        with (field)
        {
            if (value==null||value=="")
            {alert(alerttxt);return false}
            else {return true}
        }
    }
    //生成验证码
    function createCode(e) {
        var code='';
        var codeLength = 4;
        var selectChar = ['0','1','2','3','4','5','6','7','8','9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
        for (var i = 0; i < codeLength; i++) {
        var charIndex = Math.floor(Math.random() * 57);
        code += selectChar[charIndex];
    }
    showCheck(code);
    }
    function showCheck(a) {
        var c = document.getElementById("myCanvas");
        document.getElementById("myCanvas").title = a;
        var ctx = c.getContext("2d");
        ctx.clearRect(0, 0, 1000, 1000);
        ctx.font = "80px 'Hiragino Sans GB'";
        ctx.fillStyle = "#E8DFE8";
        ctx.fillText(a, 0, 100);
    }
</script>
</html>
