// \lkj20180323
var canGetCookie = 1;//是否支持存储Cookie 0 不支持 1 支持
var ajaxmockjax = 1;//是否启用虚拟Ajax的请求响 0 不启用  1 启用

var CodeVal = 0;
Code();
function Code() {
    if(canGetCookie == 1){
        createCode("AdminCode");
        var AdminCode = getCookieValue("AdminCode");
        showCheck(AdminCode);
    }else{
        showCheck(createCode(""));
    }
}

function showCheck(a) {
    CodeVal = a;
    var c = document.getElementById("myCanvas");
    var ctx = c.getContext("2d");
    ctx.clearRect(0, 0, 1000, 1000);
    ctx.font = "80px 'Hiragino Sans GB'";
    ctx.fillStyle = "#E8DFE8";
    ctx.fillText(a, 0, 100);
}
$(document).keypress(function (e) {
    // 回车键事件
    if (e.which == 13) {
        $('input[type="button"]').click();
    }
});
var open = 0;
function logingaction () {
    //非空验证
    $('input[type="button"]').click(function () {
        var username = $('.username').val();
        var pwd = $('.passwordNumder').val();
        var code = $('.ValidateNum').val();
        if (username == '') {
            alert('请输入您的账号');
            return false;
        } else if (pwd == '') {

            alert('请输入密码');
            return false;
        } else if (code == '' || code.length != 4) {
            alert('输入验证码');
            return false;

        } else {


            //登陆
            var JsonData = { username: username, pwd: pwd, code: code };
            //此处做为ajax内部判断
            var url = "";
            if(JsonData.code.toUpperCase() == CodeVal.toUpperCase()){
                JsonData = {username:username,pwd:pwd};
                url = "user/Login.do";
            }else{
                url = "Ajax/LoginFalse";
            }

            $.ajax({
                type: "post",
                url: url,
                data: JsonData,
                dataType: 'json',
                async: 'false',
                beforeSend: function () { $("#submit").attr({ disabled: "disabled" }); },
                success: function (xmlhttp){alert(xmlhttp.readyState +"   "+ xmlhttp.status);}
            });
        }
        return false;
    })
}


