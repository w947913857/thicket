<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>丛林闲居-App下载</title>
    <link rel="stylesheet" href="style/cy.css">
    <link rel="stylesheet" href="style/style.css">
</head>
<body>
<!--首页TOP-->
<div class="index-top2">
    <div class="left"> 
        <span class="one"><a href="                   "><img width="131" height="52" src="images/logo2.png"></a></span>
        <span class="two"><img src="images/index_q.png"></span>  

        <div class="three">
            <span><img src="images/index_03.png"></span>
            <ul>
                <li class="rx">客户服务热线:</li>
                <li class="phone">400-688-6798</li>
            </ul>
        </div>
    </div>
    <div class="right">
        <ul>
            <li><a href="                   ">首页</a>|</li>
            <li><a href="<%=path %>/clxjmain!selClOfPage.action?clxjmain.type2=true">丛林</a>|</li>
            <li><a href="<%=path %>/clxjmain!selXjOfPage.action?clxjmain.type2=false">闲居</a>|</li>
            <li><a href="ConEntryPage.jsp">忏悔</a>|</li>   
            <li><a href="FoundIndex.jsp">基金会</a>|</li>
            <li><a href="joincl.jsp">加盟</a>|</li>
            <li><a href="ContactUs.jsp">联系我们</a></li>
        </ul>
    </div>
</div>

<!--首页轮播图-->
<div class="index-lbt">
    <div class="index-lbt1">
    <div id="scrollPics">
        <ul class="slider">
            <li><img src="http://117.169.17.224:8080/clxjBack/roll/download/lbt1.png" class="lower" height="497px" width="100%"/>
            </li>
            <li><img src="http://117.169.17.224:8080/clxjBack/roll/download/lbt2.png" height="497px" width="100%"/></li>
            <li><img src="http://117.169.17.224:8080/clxjBack/roll/download/lbt3.png" height="497px" width="100%"/></li>
            <li><img src="http://117.169.17.224:8080/clxjBack/roll/download/lbt4.png" height="497px" width="100%"/></li>
            <li><img src="http://117.169.17.224:8080/clxjBack/roll/download/lbt5.png" height="497px" width="100%"/></li>
        </ul>
        <ul class="num"> 
            <li class="on"></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
    </div>
</div>
<div class="appxz"> 
	<!--以后要根据客户的地址来换，现在只是写死了-->
   <a href="http://117.169.17.224:8080/clxjBack/apk/orderclxj.apk">  
   		<div class="dfkhd hours">
   			<p></p>
        	<span>订房客户端下载 </span>
    	</div> 
    </a>   
    <a href="http://117.169.17.224:8080/clxjBack/apk/clxj.apk"> 
    <div class="dfkhd car"> 
        <p> </p>
        <span>丛林/闲居管理者下载 </span>
    </div>   
    </a>
    <a href="http://117.169.17.224:8080/clxjBack/apk/car.apk">  
    <div class="dfkhd taxi">
        <p> </p> 
        <span>司机用车APP下载</span>
    </div> 
    </a> 
    <div class="xxyx">
        <p class="titt">三款APP的各大优势</p>
        <p>快速高效地发布与浏览信息：智能手机携带方便操作简单的特点，使得用户摆脱了PC端时空上的限制和繁琐的操作，实现掌上操作，便捷高效。
            所有企业可随时随地可发布最新产品信息，建立企业产品大全，企业目录，在线解答客户疑问。而客户可以随时随地搜寻产品信息，查阅商家资料,展会信息等。
            便捷的功能设计，满足企业宣传推广和客户搜寻产品的不同需求，极具人性化。</p>
        <p>在线互动交流功能：以客户需求为中心的设计体验，通过设立“知道”模式互动知识平台，特邀行业专家提供在线咨询与技术指导，帮助企业解决制造与加工技术难题，
            专家在线探讨行业发展，为企业决策提供智力支持。</p>
    </div>
</div>

 <%@ include  file="bottom.jsp"%> 
<script src="js/jquery.min.js"></script>
<script src="../../js"></script>

</body>
</html>