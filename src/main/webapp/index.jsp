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
        <form action="user/Login.do" onsubmit="return validate_form(this)" method="post">
        <div class='login_fields__user'>
            <div class='icon'>
                <img alt="" src='loginSpecial/img/user_icon_copy.png'>
            </div>
            <input name="usernaem" placeholder='用户名' maxlength="16" class="username" type='text' autocomplete="off" value="2"/>
            <div class='validation'>
                <img alt="" src='loginSpecial/img/tick.png'>
            </div>
        </div>
        <div class='login_fields__password'>
            <div class='icon'>
                <img alt="" src='loginSpecial/img/lock_icon_copy.png'>
            </div>
            <input name="password" placeholder='密码' maxlength="16" type='text' autocomplete="off" value="2">
            <div class='validation'>
                <img alt="" src='loginSpecial/img/tick.png'>
            </div>
        </div>
        <div class='login_fields__password'>
            <div class='icon'>
                <img alt="" src='loginSpecial/img/key.png'>
            </div>
            <input name="codeStr" placeholder='验证码' maxlength="4"  class="ValidateNum" type='text' name="ValidateNum" autocomplete="off">
            <div class='validation' style="opacity: 1; right: -5px;top: -3px;">
                <canvas class="J_codeimg" id="myCanvas" onclick="createCode('')" data-yourvalue="">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
            </div>
        </div>
        <div class='login_fields__submit'>
            <input type='submit'  value='登录'>
        </div>
         <div class='disclaimer'>
              <p><a href="user/RegisterPag.do">还没有账号注册?点我注册.</a> </p>
          </div>
        </form>
    </div>
</div>
<script src="https://cdn.staticfile.org/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">

    window.onload=function(){
        createCode("")
    };
    function validate_form(thisfrom) {
        with (thisfrom)
        {
            if (validate_required(usernaem,"usernaem must be filled out!")==false)
            {usernaem.focus();return false}
            if (validate_required(password,"password must be filled out!")==false)
            {password.focus();return false}
            if (validate_required(codeStr,"code must be filled out!")==false)
            {codeStr.focus();return false}
            if(codeStr.value.toUpperCase() != document.getElementById("myCanvas").title.toUpperCase()){
                alert("Please enter the correct");
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
</body>
</html>
