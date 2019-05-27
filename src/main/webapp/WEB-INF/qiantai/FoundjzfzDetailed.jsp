<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>丛林闲居</title>
    <link rel="stylesheet" href="style/cy.css">
    <link rel="stylesheet" href="style/style.css">
    <script src="js/laydate.js"></script>
    <link rel="stylesheet" href="style/laydate.css">
    <link rel="stylesheet" href="js/molv/laydate.css">
    <style rel="stylesheet">  
.pagination {font-family: Tahoma;font-size: 12px;height: 22px;margin: 5px 10px;text-align: right;}  
.pagination a,.page-cur,.page-start,.page-end,.page-disabled,.page-skip {  
height:22px;line-height:22px;margin:0 3px 0 0;text-align:center;vertical-align:middle;white-space:nowrap;}  
.pagination input {border-width: 1px;}  
.page-start, .pagination a, .page-end, .page-disabled {border: 1px solid #CCCCCC;padding: 0 5px;}  
.pagination a {text-decoration: none;}  
.page-cur {background-color: #FFEDE1;border: 1px solid #FD6D01;color: #FD6D01;font-weight: 700;padding: 0 5px;}  
.page-disabled {color: #CCCCCC;}  
.page-skip {color: #666666;padding: 0 3px;}  
</style> 
</head>   
<body>
<div>
<script type="text/javascript">
//获取地址栏
function GetRequest() {
      var url = location.search; //获取url中"?"符后的字串
      var theRequest = new Object();
      if (url.indexOf("?") != -1) {
       var str = url.substr(1);
        strs = str.split("&");
        for(var i = 0; i < strs.length; i ++) {
        	 theRequest[strs[i].split("=")[0]]=(strs[i].split("=")[1]);
        	 }
         } 
       return theRequest;
}
function Alllogin(){
	var Request = new Object();
	Request = GetRequest();  
	var returnUrl;
	returnUrl = Request['helpinfo.id']; 
	window.location.href = "login.jsp?returnurl=/FoundjzfzDetailed.jsp&helpinfo.id="+returnUrl; 
}  
function loginOut(){
	var Request = new Object();
	Request = GetRequest();  
	var returnUrl;
	returnUrl = Request['helpinfo.id'];  
	window.location.href = "<%=path%>/reguser!loginOut.action?returnurl=/FoundjzfzDetailed.jsp&helpinfoid="+returnUrl;
}
 </script>
    <!--首页TOP-->
    <div class="yc-txdd1">
        <jsp:include  page="head.jsp" />   
        <!--首页banner-->
        
        <!--首页轮播图-->


        <!--用车-填写订单-->
        <div class="yc-txdd">
            <div class="yc-mbx">
                <p>当前位置：<a href="index.jsp" class="ll">丛林闲居网</a> > <a href="FoundIndex.jsp" class="ll">基金会</a> > <a href="#"
                                                                                               class="xz">我要求助</a></p>
            </div>
            <input type="hidden" id="uid" value="${sessionUser.id }"/>
            <div><img src="images/jjh_03.jpg"></div>
            <div class="jjh-index">
                <div class="jjh-index-left">
                        <div class="jjh-p2">
                            <p class="jjh-p21">救助/扶助公示详细</p>
                        </div>
                        <div class="jjh-table">
                            <div class="fzymt-one">
                                    <div class="fyt-top"><p></p><i>个人基本信息</i><span></span></div>
                                    <div class="jzfz-top">
                                        <table>
                                            <tr>
                                                <td>申请人姓名：<i id="name"></i></td>
                                                <td>年龄：<i id="age"></i></td>
                                                <td>性别：<i id="sex"></i></td>
                                                <td>身份证号：<i id="idcard"></i></td>
                                            </tr>
                                            <tr>
                                                <td>联系电话：<i id="phonenum"></i></td>
                                                <td colspan="2">联系邮箱：<i id="email"></i></td>
                                                <td>住址或单位：<i id="address"></i></td>
                                            </tr>
                                            <tr>
                                                <td>是否享受低保：<i id="basicliving"></i></td>
                                                <td colspan="2">家庭年收入：<i id="income"></i></td>
                                                <td>拟申请救助金额：<i id="applymoney"></i></td>
                                            </tr>
                                            <tr>
                                                <td colspan="4" class="zykn"><span>主要困难概述：</span><i id="applycontent"></i></td>
                                            </tr>
                                        </table>
                                    </div>
                                    <div id="vouch" style="display: none">
                                <div class="fyt-top"><p></p><i>担保人信息</i><span></span></div>
                                <div class="jzfz-top">
                                    <table>
                                        <tr>
                                            <td>担保人姓名：<i id="vouchname"></i></td>
                                            <td>身份证号：<i id="vouchidcard"></i></td>
                                            <td>单位固定电话：<i id="vouchphonenum"></i></td>
                                        </tr>
                                        <tr>
                                            <td>个人联系电话：<i id="vouchmobile"></i></td>
                                            <td>住址：<i id="vouchaddress"></i></td>
                                            <td>工作单位：<i id="vouchcompany"></i></td> 
                                        </tr>
                                    </table>
                                </div>
                                </div>
                                <div class="wypl">
                                    <div class="wypl-top">
                                        <p class="wy"><span class="left">我要评论</span><span class="right">已有<i id="count"></i>条评论</span></p>
                                        <div class="wypltop-con"> 
                                            <div class="left"><c:if test="${sessionUser==null}">请<a href="javascript:void(0)" onclick="Alllogin()">登录</a>先</c:if><c:if test="${sessionUser!=null}">${sessionUser.username}</c:if></div>
                                            <div class="right"><p class="text"><img src="images/jzfz_10.jpg"><textarea id="commentContent" placeholder="请输入评论"></textarea></p><p><span></span><c:if test="${sessionUser !=null}"><span><input type="submit" value="发布" onclick="saveComment()"></span></c:if><c:if test="${sessionUser ==null}"><span><input type="submit" value="登录" onclick="Alllogin()"></span></c:if></p></div>
                                        </div>
                                    </div>
                                    <div class="wypl-con">
                                        <p class="zxpl">最新评论 <span onclick="result()"><img src="images/jzfz_23.jpg">刷新</span></p>
                                        <div class="zxpl-con one-back" id="helpcommentJson">
                                            
                                        </div>
                                        <div  id="fenye">
                                        	<div id="pageNav" align="center"></div>   
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div>
                </div>
                <div class="jjh-index-right">
                    <a href="FoundRescue.jsp"><div>
                        <img src="images/brower_03.jpg" class="enheng">
                        <p>我要求助</p>
                        <img src="images/brower_07.jpg" >
                    </div></a>
                    <a href="DonationLove.jsp"><div>
                        <img src="images/brower_11.jpg" class="enheng">
                        <p>我要查询</p>
                        <img src="images/brower_07.jpg">
                    </div></a>
                    <a href="FoundDonations.jsp"><div>
                        <img src="images/brower_15.jpg" class="enheng" style="margin-top: 15px;">
                        <p>我要捐款</p>
                        <img src="images/brower_07.jpg">
                    </div></a>
                    <a href="UserPquery.jsp"><div>
                        <img src="images/brower_19.jpg" class="enheng" style="margin-top: 23px;">
                        <p>求助进度</p>
                        <img src="images/brower_07.jpg">
                    </div></a>
                    <a href="FoundJzfzlist.jsp"><div>
                        <img src="images/brower_23.jpg" style="margin-top: 16px;">
                        <p>公示列表</p>
                    </div></a>
                </div>



            </div>


        </div>
        <%@ include  file="bottom.jsp"%>
    </div>
    <div class="tcc none">
        <div class="cgxd1">
            <div class="cgxd-main">
                <p class="xdcg"><img src="images/xdcg.png"> <img src="images/14_01.png" class="close"></p>

                <p class="ddbh">订单编号：<i>WO20121015141125</i> [请牢记您的订单编号]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;订单总价：<i>9800元</i>
                    （该订单属于线下支付类型）</p>

                <p class="fhdd">您可以：<a href="#" class="fh">返回我的订单</a><a href="#" class="jx">继续预定用车</a>（如有疑问请联系丛林闲居客服QQ:88888888）
                </p>

                <p class="wxts"><i>*温馨提示：</i>IE6.0及更低版本浏览器用户请检查您的浏览器是否支持128位密钥长度，如果不支持，请升级您的浏览器（<span>查看如何检查和升级方案</span>）
                </p>
            </div>
        </div>
    </div>
    <div class="tcc1 none">
        <div class="cgxd2">
            <div class="cgxd-main">
                <p class="yzsj">
                    验证手机
                </p>

                <div>
                    <p class="sjh"><input type="text" placeholder="手机号"></p>

                    <p class="tpyxm"><input type="text" placeholder="图片验证码"><img src="images/yzm_03.png"></p>

                    <p class="tpyxm"><input type="text" placeholder="手机验证码"><a href="#">获取验证码</a></p>

                    <p><i><a href="#">收不到验证码？重新再发一次</a> </i></p>

                    <p><input type="submit" value="确&nbsp;&nbsp;定"></p>

                    <p class="dlc"><i><a href="#">使用本站帐号登录</a></i></p>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="js/jquery.min.js"></script>
<script src="../../js"></script>
<script type="text/javascript">
    !function () {
        laydate.skin('molv');//切换皮肤，请查看skins下面皮肤库
        laydate({elem: '#demo3'});//绑定元素
    }();
</script>
<script language="javascript">
var helpid = <%=request.getParameter("helpinfo.id")%> ;
getHelp(); 
getCount(helpid);
var count;
function result(){
	getCount(helpid);
}
//救助/求助详情
function getHelp(){
	//救助
	var name = document.getElementById("name");
	var age = document.getElementById("age");
	var sex = document.getElementById("sex");
	var idcard = document.getElementById("idcard");
	var phonenum = document.getElementById("phonenum");
	var email = document.getElementById("email");
	var address = document.getElementById("address");
	var basicliving = document.getElementById("basicliving");
	var income = document.getElementById("income");
	var applymoney = document.getElementById("applymoney");
	var applycontent = document.getElementById("applycontent");
	$.ajax({  
        type : "post",  
         url : "<%=path%>/helpinfo!selHelpinfoOfId.action",  
         data: {"helpinfo.id":helpid},
         dataType: "json",
         async : false,   
         success : function(results){  
        	 name.innerHTML = results.help.name;
        	 age.innerHTML = results.help.age;
        	 sex.innerHTML = results.help.sex==1?"男":"女"; 
        	 idcard.innerHTML = results.help.idcard;
        	 phonenum.innerHTML = results.help.phonenum;
        	 email.innerHTML = results.help.email;
        	 address.innerHTML = results.help.address;
        	 basicliving.innerHTML = results.help.basicliving==1?"是":"否";
        	 income.innerHTML = results.help.income;
        	 applymoney.innerHTML = results.help.applymoney;
        	 applycontent.innerHTML = results.help.applycontent.length>0?results.help.applycontent:"<em style='color:red;'>无困难概述</em>"; 
        	 //如果是求助，还需要以下字段
        	 var type =results.help.applytype; 
        	 if(type==true){  
            	 document.getElementById("vouch").style.display="block"; 
            	 var vouchname = document.getElementById("vouchname");
            	 var vouchidcard = document.getElementById("vouchidcard");
            	 var vouchphonenum = document.getElementById("vouchphonenum");
            	 var vouchmobile = document.getElementById("vouchmobile");
            	 var vouchaddress = document.getElementById("vouchaddress");
            	 var vouchcompany = document.getElementById("vouchcompany");
            	 vouchname.innerHTML = results.help.vouchname;
            	 vouchidcard.innerHTML = results.help.vouchidcard;
            	 vouchphonenum.innerHTML = results.help.vouchphonenum;
            	 vouchmobile.innerHTML = results.help.vouchmobile;
            	 vouchaddress.innerHTML = results.help.vouchaddress;
            	 vouchcompany.innerHTML = results.help.vouchcompany; 
            	 }
         }   
    });
}
//获得评论总数
function getCount(helpid){
	$.ajax({  
        type : "post",  
         url : "<%=path%>/helpcomment!selHelpcommentOfhid.action",  
         data: {"helpid":helpid}, 
         dataType: "json",
         async : false,   
         success : function(results){  
        	 count = results.count;
        	 document.getElementById("count").innerHTML = count; 
        	 if(count>5){  
            	 testPage(1);
            	 }else{
            		 document.getElementById("pageNav").innerHTML = "";   
            		 InitTable(1); 
                	 }
          }
	});
}
function testPage(curPage){ 
    supage('pageNav','testPage','',curPage,count,5);    
    InitTable(curPage);
} 
function InitTable(curPage){
	var helpcommentJson = document.getElementById("helpcommentJson");
	helpcommentJson.innerHTML ="";
	var show = "";
	$.ajax({  
        type : "post",   
         url : "<%=path%>/helpcomment!selHelpcommentPage.action",  
         data: {"helpid":helpid,"index":curPage},
         dataType: "json",
         async : false,   
         success : function(results){  
             if(results.helpcommentJsons.length>0){
                 for(var i=0;i<results.helpcommentJsons.length;i++){
                     var username = results.helpcommentJsons[i].username;
                     var content = results.helpcommentJsons[i].content; 
                     var time = results.helpcommentJsons[i].time;
                     show +="<div class='left'></div> <div class='right'><p class='tis'><span>"+username+"</span></p><p class='xxqw'>"+content+"</p><p class='dsg'><span class='left1'>"+time+"</span></p></div>";
                     }
                 helpcommentJson.innerHTML = show;
         	}else{
             	}
        } 
    });
}
function supage(divId, funName, params, curPage, total, pageSize){  
    var output = '<div class="pagination" style="margin-top:0px;margin-left:-60px;width:320px;">';    
    var pageSize = parseInt(pageSize)>0 ? parseInt(pageSize) : 10;  
    if(parseInt(total) == 0 || parseInt(total) == 'NaN') return;  
    var totalPage = Math.ceil(total/pageSize);  
    var curPage = parseInt(curPage)>0 ? parseInt(curPage) : 1;  
      
    //从参数对象中解析出来各个参数   
    var param_str = '';  
    if(typeof params == 'object'){  
        for(o in params){  
            if(typeof params[o] == 'string'){  
               param_str += '\'' + params[o] + '\',';  
            }  
            else{  
               param_str += params[o] + ',';  
            }  
        }  
        //alert(111);  
    }  
    //设置起始页码  
    if (totalPage > 10) {  
        if ((curPage - 5) > 0 && curPage < totalPage - 5) {  
            var start = curPage - 5;  
            var end = curPage + 5;  
        }  
        else if (curPage >= (totalPage - 5)) {  
            var start = totalPage - 10;  
            var end = totalPage;  
        }  
        else {  
            var start = 1;  
            var end = 10;  
        }  
    }  
    else {  
        var start = 1;  
        var end = totalPage;  
    }  
      
    //首页控制  
    if(curPage>1){  
        output += '<a href="javascript:'+funName+'(' + param_str + '1);" title="第一页" class="page-first">«</a>';  
    }  
    else  
    {  
        output += '<span class="page-disabled">«</span> ';  
    }  
    //上一页菜单控制  
    if(curPage>1){  
        output += '<a href="javascript:'+funName+'(' + param_str + (curPage-1)+');" title="上一页" class="page-previous">‹</a>';  
    }  
    else{  
        output += '<span class="page-disabled">‹</span>';  
    }  
      
    //页码展示  
    for (i = start; i <= end; i++) {  
        if (i == curPage) {  
            output += '<a href="javascript:;" class="page-cur">' + curPage + '</a>';  
        }  
        else {  
            output += '<a href="javascript:'+funName+'(' + param_str + i + ');">' + i + '</a>';  
        }  
    }  
    //下一页菜单控制  
    if(totalPage>1 && curPage<totalPage){  
        output += '<a title="下一页" href="javascript:'+funName+'('+param_str + (curPage+1)+');" class="page-next">›</a>';  
    }  
    else{  
        output += '<span class="page-disabled">›</span>';  
    }  
    //最后页控制  
    if(curPage<totalPage){  
        output += '<a title="最后页" href="javascript:'+funName+'('+param_str + totalPage+');" class="page-end">»</a>';  
    }  
    else{  
        output += '<span class="page-disabled">»</span>';  
    }  
      
    output += '</div>';  
    //渲染到dom中  
    document.getElementById(divId).innerHTML = output;  
};   
function saveComment(){
	var commentContent = document.getElementById("commentContent").value; 
	if(commentContent.length==0||commentContent==""){
		alert("请输入评论内容");
		}else if(commentContent.length<5){ 
			alert("评论内容不得少于五个字");
		}else if(commentContent.trim()==""){   
			alert("评论内容不能为空哦");  
		}else{
			$.ajax({  
		        type : "post",   
		         url : "<%=path%>/helpcomment!saveHelpcomment.action",   
		         data: {"helpcomment.helpid":helpid,"helpcomment.uid":$('#uid').val(),"helpcomment.content":commentContent},
		         dataType: "json",
		         async : false,   
		         success : function(results){  
			         if(results.isSave=="true"||results.isSave==true){
			        	 document.getElementById("commentContent").value="";
			        	 alert("评论成功"); 
			        	 getCount(helpid);
				         }else{
						alert("评论失败，请重试");
					  }
		        } 
		    });
			}
}
</script>
</body>
</html>