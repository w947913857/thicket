<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>联系我们</title>
    <link rel="stylesheet" href="style/cy.css">
    <link rel="stylesheet" href="style/style.css">
</head>
<body>
<!--首页banner-->
 <jsp:include  page="head.jsp" />   
         <script type="text/javascript">
function Alllogin(){
	window.location.href = "login.jsp?returnurl=/ContactUs.jsp";
} 
function loginOut(){
	window.location.href = "<%=path%>/reguser!loginOut.action?returnurl=/ContactUs.jsp";
}
 </script>
<div class="contact">
	<p style="line-height: 35px;">当前位置：<a href="index.jsp" style="color:#2064c8;">丛林闲居网</a>&nbsp;>&nbsp;联系我们</p>
    <br/>
    <p><img src="images/lxwm_03.jpg"></p>
    <br/>
    <div style="width:80%; float:left ;margin-bottom: 150px;"> 
    <h1 class="cc"><img src="images/a7.jpg" style="padding-top:1px; float:left">&nbsp;&nbsp;公司简介</h1>
    <br/> 
    <p class="ccc">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;江西丛林闲居投资有限公司成立于2015年，其着力打造的丛林闲居品牌是集：寺院建设投资、心理压力疏导、丛林素斋推介、济缘慈善基金为一体，面向全球华人，以互联网为载体的非盈利性公益平台。
丛林在佛教中指禅宗寺院，闲居为寺院外的民居。公司拟在全国31个省打造2000所非旅游景区（非旅游景点）且山水和自然风光优美的汉传佛教寺院和闲居加盟。在17个国家（美国、加拿大、澳大利亚、新西兰、日本、韩国、菲律宾、印度、巴基斯坦、阿富汗、孟加拉、不丹、尼布尔、泰国、缅甸、老挝、柬埔寨）及台湾、香港两地区共邀请100所佛教寺院和1000户闲居加盟。
同时，公司推出“丛林素斋”全国连锁品牌，为去过丛林和闲居的朋友在线下提供感受素食文化、交流和互动的环境。
    公司热忱欢迎丛林、闲居及有志于素食文化的同仁加盟，共创禅宗思想服务社会的新路。</p>
    <p style=" height:30px;"></p> 
    <h1><img src="images/a7.jpg" style="padding-top:1px; float:left">&nbsp;&nbsp;联系方式</h1><br/> 
    <p class="ccc">我们的成长，你们一班热心朋友的关注与支持。希望您多能给我提意见，让我做的更好！</p><br/>
    <p class="lian">请您通过 以下方式联系我们</p>
    <p style=" height:20px;"></p>
    <div class="div"><img src="images/lxwm_07.jpg" style="float:left"><span style="float:left; padding-top:10px;">&nbsp;&nbsp;400-688-6798</span></div>
    <div class="div"><img src="images/lxwm_03.gif" style="float:left"><span style="float:left; padding-top:10px;">&nbsp;&nbsp;clxj2016@163.com</span></div><div class="div"><img src="images/lxwm_13.gif" style="float:left"><span style="float:left; padding-top:10px;">&nbsp;&nbsp;0791-88193562</span></div>
    <div class="div"><img src="images/lxwm_15.jpg" style="float:left"><span style="float:left; padding-top:10px;">&nbsp;&nbsp;早上9:00-下午6:00（周一至周六）</span></div>
    <div class="div"><img src="images/lxwm_19.jpg" style="float:left"><span >&nbsp;&nbsp;江西省南昌高新区高新二路华恒公寓一栋六层（客服中心：<br/>&nbsp;&nbsp;江西省南昌高新开发区高新一路海外大厦北楼4层）</span></div>
    <p style="clear:both; height:30px;"></p>  
    <p style="border-bottom:1px solid #CCC;"></p>
    <br/>
    <div class="div1"><span style="color:#09F"><img src="images/lxwm_14.jpg">&nbsp;&nbsp;办公时间以外的业务联系：</span><br/>Eva:18979142983</div>
    <div class="div1"><span style="color:#09F"><img src="images/lxwm_14.jpg">&nbsp;&nbsp;商务合作：</span><br/>Daomn:18979142983</div>
    <div class="div1"><span style="color:#09F"><img src="images/lxwm_14.jpg">&nbsp;&nbsp;建议或意见：</span><br/>Marco:18291032289</div>
    <p style="clear:both;"></p>
    <p style="border-bottom:1px solid #CCC;"></p> 
    </div>
  <div style="width:18%; float:left; text-align:center">
      <div class="lxwm-right">
          <div class="kfzy">
                <div><img src="images/qq_03.jpg" onclick="Message(1)"><p>客服专员</p></div>
                <div><img src="images/qq_03.jpg" onclick="Message(2)"><p>客服专员</p></div>
                <div><img src="images/qq_03.jpg" onclick="Message(3)"><p>客服专员</p></div>
                <div><img src="images/qq_03.jpg" onclick="Message(4)"><p>客服专员</p></div>
          </div><!--
          <a href="register.jsp"> <div class="mfzc">
                <p>免费注册</p>
  
          </div></a>
      --></div>
  </div>
</div>
<script src="<%=path %>/js/jquery.js"></script>
<script src="<%=path %>/static/js"></script>
<script type="text/javascript">
function Message(type){
	var qq;
	switch(type){
		case 1:
			qq = "2834816286";
			break; 
		case 2: 
			qq = "2119655589";
			break;
		case 3:
			qq = "3140511489";
			break;
		case 4:
			qq = "3156435115"; 
			break;
	}
	window.location.href="tencent://message/?uin="+qq+"&Site=&Menu=yes";}  
</script> 
 <%@ include  file="bottom.jsp"%>
</div>
</body>
</html>