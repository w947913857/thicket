<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>test</title>
</head>
<script type="text/javascript" src="js/jquery.js"></script>
<script src="js/jquery.validate.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jquery.metadata.js"></script>
<script type="text/javascript" src="js/messages_cn.js"></script>

<script type="text/javascript">
$().ready(function() {
	 $("#signupForm").validate({
	        rules: {
	   				firstname: "required",
	   				email: {
	    			required: true,
	    			email: true
	   				},
	   				password: {
	    			required: true,
	    			minlength: 5
	   				},
	  				confirm_password: {
	    			required: true,
	    			minlength: 5,
	    			equalTo: "#password"
	   				}
	  		},
	        messages: {
	   				firstname: "请输入姓名",
	  				email: {
	   				required: "请输入Email地址",
	    			email: "请输入正确的email地址"
	   				},
	  				password: {
	    			required: "请输入密码",
	   				minlength: "密码不能小于{0}个字 符"
	   				},
	   				confirm_password: {
	    			required: "请输入确认密码",
	    			minlength: "确认密码不能小于5个字符",
	    			equalTo: "两次输入密码不一致不一致"
	   				}
	  		}
	    });
	});
</script>


<body>
   <form id="signupForm" method="get" action="">
    <p>
        <label for="firstname">Firstname</label>
        <input id="firstname" name="firstname" />
    </p>
 <p>
  <label for="email">E-Mail</label>
  <input id="email" name="email" />
 </p>
 <p>
  <label for="password">Password</label>
  <input id="password" name="password" type="password" />
 </p>
 <p>
  <label for="confirm_password">确认密码</label>
  <input id="confirm_password" name="confirm_password" type="password" />
 </p>
    <p>
        <input class="submit" type="submit" value="Submit"/>
    </p>
</form>
</body>


</html>