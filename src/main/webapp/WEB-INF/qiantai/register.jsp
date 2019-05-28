<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>丛林闲居-注册</title>
    <link rel="stylesheet" href="<%=path %>/static/style/cy.css">
    <link rel="stylesheet" href="<%=path %>/static/style/style.css">
    <!-- 表单验证start -->
    <script src="<%=path %>/static/js/jquery.js"></script>
    <script src="<%=path %>/static/js/jquery.validate.js"></script>
    <script src="<%=path%>/static/js/jquery.metadata.js"></script>
    <!-- 表单验证stop -->
</head>
<body>
<!--登录页TOP-->
<div class="index-top1">
    <div class="left">
        <span class="one"><a href=""><img src="<%=path %>/static/images/logo1.png" height="64px"
                                          width="158px"></a></span>
    </div>
    <div class="right1">
        <div class="three1">
            <span><img src="<%=path %>/static/images/index_03.png"></span>
            <ul>
                <li class="rx">客户服务热线:</li>
                <li class="phone">400-688-6798</li>
            </ul>
        </div>
    </div>
</div>
<div class="reg">
    <div class="reg-main">
        <p class="top"><img src="<%=path %>/static/images/09.png">注册新用户 <i>已有帐号？去<a href="/login">登录</a> > </i></p>
        <form action="<%=path %>/reguser!saveReguser.action" id="reguserForm">
            <table>
                <tr>
                    <td class="with">手机号</td>
                    <td colspan="2"><input type="text" id="mobile" name="mobile" size="32" maxlength="11"
                                           placeholder="请输入11位手机号码" onblur="checkMobile()"><i>*作为登录名</i></td>
                    <td class="status" style="color: red" id="td1"></td>
                </tr>
                <tr>
                    <td class="with">邮箱</td>
                    <td colspan="2">
                        <input name="email" id="email" type="text" size="70" placeholder="请输入邮箱地址"
                               class="required email"><i>*</i>
                    </td>
                    <td class="status" style="color: red"></td>
                </tr>
                <tr>
                    <td class="with">密码</td>
                    <td colspan="2">
                        <input type="password" size="70" placeholder="请输入原始密码" name="password" id="password"
                               class="{required:true,minlength:6}" maxlength="16"><i>*</i>
                    </td>
                    <td class="status" style="color: red"></td>

                </tr>
                <tr>
                    <td class="with">确认密码</td>
                    <td colspan="2">
                        <input type="password" size="70" name="repassword" placeholder="请再次输入原始密码"
                               class="{required:true,minlength:6,equalTo:'#password'}" maxlength="16"><i>*</i>
                    </td>
                    <td class="status" style="color: red"></td>
                </tr>
                <tr>
                    <td></td>
                    <td colspan="2">
                        <input type="button" value="马上注册" class="mszc" onclick="subForm()">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
<div id="show" class="tcc12 none" style="display: none;">
    <div class="tx-ydm">
        <p class="tx-sm"><span class="one"><img src="<%=path %>/static/images/tx.png">提示</span><span class="two"><img
                src="<%=path %>/static/images/14_01.png" class="close"></span></p><br/><br/><br/>
        <p align="center">恭喜你，注册成功</p><br/><br/><br/>
        <p align="center">点击<a href="/login">登录</a>进入登录页面</p>
    </div>
</div>
<div id="show2" class="tcc12" style="display: none;">
    <div class="tx-ydm" style="margin-top:250px;">
        <p class="tx-sm"><span class="one"><img src="<%=path %>/static/images/tx.png">提示</span><span class="two"><img
                src="<%=path %>/static/images/14_01.png" class="close"></span></p><br/><br/><br/>
        <p align="center">哦。。。发生了点小意外，不好意思</p><br/><br/><br/>
        <p align="center">点击<a href="/register">注册</a>刷新页面</p>
    </div>
</div>
<footer>
    <ul>
        <li>江西省丛林闲居投资有限公司，工业和信息化部网站备案许可证编号：赣ICP备15010915号</li>
        <li>Copyright © 2015 <a href="#">丛林闲居</a> 版权所有 3wcl.com | 客服中心：400-688-6798</li>
    </ul>
    <p><a href="#"><img src="<%=path %>/static/images/index_48.jpg"></a><a href="#"><img
            src="<%=path %>/static/images/index_50.jpg"></a><a href="#"><img
            src="<%=path %>/static/images/index_52.jpg"></a> <a href="#"><img
            src="<%=path %>/static/images/index_54.jpg"></a><a href="#"><img
            src="<%=path %>/static/images/index_56.jpg"></a> <a href="#"><img
            src="<%=path %>/static/images/index_58.jpg"></a></p>
</footer>
<script type="text/javascript">
    var checks = 0; //一个全局变量，用来最终判断表单是否可以提交
    var wait = 120;//倒计时获取验证码时间
    var checks = false;
    $(document).ready(function () {
        $("#reguserForm").validate({
            errorPlacement: function (error, element) {
                if (element.is(":radio"))
                    error.appendTo(element.parent().next().next());
                else if (element.is(":checkbox"))
                    error.appendTo(element.next());
                else
                    error.appendTo(element.parent().next());
            }
        });
        jQuery.extend(jQuery.validator.messages, {
            required: "&nbsp;&nbsp;该字段不能为空",
            email: "&nbsp;&nbsp;请输入正确格式的电子邮件",
            minlength: jQuery.validator.format("&nbsp;&nbsp;请输入一个长度最少是 {0} 的字符串"),
            equalTo: "&nbsp;&nbsp;两次输入密码不一致"
        });
        $(".close").click(function () {
            $(".tcc").css("display", "none");
            window.location.href = "<%=path%>/register.jsp";
        });
    });

    //检验手机号码是否已经被注册
    function checkMobile() {
        var mobile = document.getElementById("mobile").value;
        var td1 = document.getElementById("td1");
        if (mobile == "") {
            td1.innerHTML = "&nbsp;&nbsp;手机号不能为空";
        } else if (!/^1[3|4|5|7|8]\d{9}$/.test(mobile)) {
            td1.innerHTML = "&nbsp;&nbsp;请正确填写您的手机号码";
        } else {
            $.ajax({
                url: "checkMobile",
                data: {
                    "username":
                    mobile
                }, sync: false,
                success: function (result) {
                    td1.innerHTML = result.msg;
                    if (result.msg == "") {
                        checks = true;
                    } else {
                        checks = false;
                    }

                }
            }, "json");
        }
    }

    //倒计时按钮
    function time(o) {
        if (wait == 0) {
            o.removeAttribute("disabled");
            o.innerHTML = "免费获取验证码";
            wait = 120;
        } else {
            o.setAttribute("disabled", true);
            o.innerHTML = "重新发送(" + wait + ")";
            wait--;
            setTimeout(function () {
                    time(o)
                },
                1000)
        }
    }

    //检验验证码是否正确
    function checkYZM() {
        var mobile = document.getElementById("mobile").value;
        var mobileYZM = document.getElementById("mobileYZM").value;
        var check = /^\d{6}$/.test(mobileYZM);
        var td2 = document.getElementById("td2");
        if (mobileYZM == "") {
            td2.innerHTML = "&nbsp;&nbsp;验证码不能为空";
        } else if (!check) {
            td2.innerHTML = "&nbsp;&nbsp;请正确输入6位纯数字验证码";
        } else {
            $.post("<%=path %>/reguser!checkYZM.action",
                {"mobileYZM": mobileYZM, "reguser.username": mobile},
                function (result) {
                    td2.innerHTML = result.msg;
                }, "json");
        }
    }

    //提交表单
    function subForm() {
        checkMobile();
        alert(checks);
        if (checks) {
            var valid = $("#reguserForm").valid();
            if (valid) {
                var mobile = document.getElementById("mobile").value;
                var email = document.getElementById("email").value;
                var pwd = document.getElementById("password").value;
                $.ajax({
                    url: "/insRegister",
                    data: {"mobile": mobile, "email": email, "pwd": pwd},
                    sync: false,
                    success: function (result) {
                        if (result == null) {
                            registerNo();
                        }
                        if (result.status == "true" || result.status == true) {
                            registerOk();
                        } else {
                            registerNo();
                        }
                    }
                }, "json");
            }
        }
    }

    //注册成功
    function registerOk() {
        var show = document.getElementById("show");
        show.style.display = "block";
    }

    function registerNo() {
        var show2 = document.getElementById("show2");
        show2.style.display = "block";
    }
</script>
</body>
</html>