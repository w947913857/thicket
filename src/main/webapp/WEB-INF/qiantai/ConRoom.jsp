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

<!-- 录音必需start -->
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" href="<%=path %>/record/js/bootstrap.min.css">
<script type="text/javascript" src="<%=path %>/record/js/bootstrap.min.js"></script>
<script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<script type="text/javascript">
	var base = "<%=path%>";
</script>
<!--录音必需end-->

    <script type="text/javascript" src="<%=path %>/js/jquery.min.js"></script>
    <link rel="stylesheet" href="<%=path %>/style/cy.css">
    <link rel="stylesheet" href="<%=path %>/style/style.css">
    
</head>
<body style="background-color: #f6f6f6;">

<!--首页TOP-->
<div class="yc-txdd1">
     
    <!--首页banner-->
     <jsp:include  page="head.jsp" />   
<script type="text/javascript">
function Alllogin(){
	window.location.href = "login.jsp?returnurl=/ConRoom.jsp";
} 
function loginOut(){
	window.location.href = "<%=path%>/reguser!loginOut.action?returnurl=/ConRoom.jsp";
}
</script>
    <!--忏悔-忏悔室-->
    <div class="yc-txdd">
        <div class="ch-chs">
            <div class="ch-main">
                <div class="ch-title">
                    <p class="wzms">文字描述</p>
                    <p class="yums">语音描述</p>
                </div>
                <div class="ch-nr">
                    <div class="ch-one"> 
                   		 <div align="center"> 
                   		 	<form action="<%=path %>/confession!addConfession.action" method="post" id="confessionForm">
                   				 <textarea id="content" name="confession.content"  onfocus="if(value=='请在此处输入忏悔'){value=''}"  onblur="if (value ==''){value='请在此处输入忏悔'}" style="width: 700px;height: 300px; margin-left: -50px;">请在此处输入忏悔</textarea><br/><br/>
                       		 	 <input id="subCon" type=button value="提交忏悔" class="tjch" onclick="addConfession()">
                       		 </form>
                        </div>
                    </div>
                    <div class="ch-one none">  
                    <div id="pwd2" style="margin-top: -20px;text-align: center;"></div>
                        <div class="container" style="margin-top: 0px;margin-left: -220px;" align="left">
								<div class="row">
									<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="height: 100px;">
										<!-- =============================================================================================================== -->
										<!-- =========================================录音部分从这里开始，页面仅仅需要一下部分======================================= -->
										<!-- =============================================================================================================== -->
										<script type="text/javascript"
											src="<%=path%>/record/js/swfobject.js"></script>
										<script type="text/javascript"
											src="<%=path%>/record/js/recorder.js"></script>
										<script type="text/javascript"
											src="<%=path%>/record/js/main.js"></script>
										<link rel="stylesheet" href="<%=path%>/record/style.css">
										<div class="qcontainer" id="myRecordDiv">
											<div id="recorder-audio" class="control_panel idle">
												<button class="record_button"
													onclick="FWRecorder.record('audio', 'audio.wav');"
													title="Record">
													<img src="<%=path%>/record/images/record.png" alt="开始录音">
												</button>
												<button class="stop_recording_button"
													onclick="FWRecorder.stopRecording('audio');"
													title="Stop Recording">
													<img src="<%=path%>/record/images/stop.png" alt="停止录音">
												</button>
												<button class="play_button"
													onclick="FWRecorder.playBack('audio');" title="Play">
													<img src="<%=path%>/record/images/play.png" alt="播放">
												</button>
												<button class="pause_playing_button"
													onclick="FWRecorder.pausePlayBack('audio');"
													title="Pause Playing">
													<img src="<%=path%>/record/images/pause.png" alt="暂停">
												</button>
												<button class="stop_playing_button"
													onclick="FWRecorder.stopPlayBack();" title="Stop Playing">
													<img src="<%=path%>/record/images/stop.png" alt="停止">
												</button>
												<div class="level"></div>
											</div>

											<div class="details">
												<button class="show_level"
													onclick="FWRecorder.observeLevel();">显示声波</button>
												<button class="hide_level"
													onclick="FWRecorder.stopObservingLevel();"
													style="display: none;">隐藏声波</button>
												<button class="show_settings"
													onclick="microphonePermission()">麦克风权限</button>
												<span id="save_button" style="display: inline-block;">
													<object data="<%=path%>/record/recorder.swf"
														name="recorderApp" id="recorderApp"
														type="application/x-shockwave-flash" height="24"
														width="24">
														<param
															value="upload_image=<%=path%>/record/images/upload.png"
															name="flashvars">
													</object>
												</span>
												<div id="status">最后的录音事件：ready</div>
												<div>
													录音时长：<span id="duration"></span>
												</div>
												<div>
													上传状态：<span id="upload_status"></span>
												</div>
												<input value="" id="qrecordId" type="hidden">
											</div>

											<!-- 这个form的action写上传路径 -->
											<form id="uploadForm" name="uploadForm" action="<%=path%>/confessiondupload">
												<input name="authenticity_token" value="xxxxx" type="hidden">
												<input name="upload_file[parent_id]" value="1" type="hidden">
												<input name="format" value="json" type="hidden">
											</form>
										</div>
										<!-- =============================================================================================================== -->
										<!-- =========================================录音部分到这里结束========================================================= -->
										<!-- =============================================================================================================== -->
									</div>
								</div>
							</div>
                    </div>
                </div>
                <!--<div class="ch-bt"><p>您是第 <i>157</i> 个忏悔者</p></div>--> 
            </div>
        </div>
    </div>

    <!--忏悔-进入页-->

     <%@ include  file="bottom.jsp"%>
</div>
<div class="tcc none" id="okok">
    <div class="cgxd3">
        <div class="cgxd-main">
            <p class="xdcg"><img src="images/chw.png"></p>
            <p class="ddbh"><em id="pwd"></em></p>  
            <p class="fhdd"><a href="ConEntryPage.jsp" class="fh">返回忏悔首页</a>（牢记上10位数字码，方便您阅读解脱文）</p>
        </div>
    </div>
</div>
<script type="text/javascript">
	function addConfession(){ 
		//判断表单的客户端验证是否通过.
		var content = document.getElementById("content").value;
		var valid = false;
		if(content=="请在此处输入忏悔"){
			valid = false;
		}else if(content.trim()==""){   
			valid = false;
		}else{  
			valid=true;
		}
		if (valid) {
			$.post("<%=path %>/confession!addConfession.action",
				  {"confession.content":content},
				  function(result){
					  if(result == null){
						  $("#pwd").html(result.message);
						  return false;
					  }
					  if(result.status=="true"||result.status==true){
					  	  $("#pwd").html(result.message);
					  	  var button = document.getElementById("subCon");
					  		button.disabled=true; 
					  		var okok = document.getElementById("okok");
					  		okok.style.display = "block"; 
					  }
					  
				  },"json");
		}else{
			alert("您好，忏悔不能为空哦");
			document.getElementById("content").value="请在此处输入忏悔";   
		}
	}
	//跳到忏悔主页面 
	function goPage(){
		window.location.href ="<%=path%>/ConEntryPage.jsp"; 
		}
</script>
<script src="../../js"></script>
</body>
</html>