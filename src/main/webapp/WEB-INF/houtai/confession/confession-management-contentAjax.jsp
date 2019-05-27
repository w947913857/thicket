<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>回复页面</title>
<!--框架必需start-->
<script type="text/javascript" src="<%=path%>/libs/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/libs/js/framework.js"></script>
<link href="<%=path%>/libs/css/import_basic.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" type="text/css" id="skin" prePath="<%=path%>/" />
<link rel="stylesheet" type="text/css" id="customSkin" />
<!--框架必需end-->

<!-- 录音必需start -->
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" href="record/js/bootstrap.min.css">
<script type="text/javascript" src="record/js/bootstrap.min.js"></script>
<script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<script type="text/javascript">
	var base = '<%=path%>';
</script>
<!--录音必需end-->

<!--基本选项卡样式2start-->
<script type="text/javascript"
	src="<%=path%>/libs/js/nav/basicTabModern.js"></script>
<!--基本选项卡样式2end-->

<!-- 表单异步提交start -->
<script src="<%=path%>/libs/js/form/form.js" type="text/javascript"></script>
<!-- 表单异步提交end -->  

<!-- 表单验证start -->
<script src="<%=path%>/libs/js/form/validationRule.js"
	type="text/javascript"></script>
<script src="<%=path%>/libs/js/form/validation.js"
	type="text/javascript"></script>
<!-- 表单验证end -->

<!-- 播放器start -->
<script type="text/javascript">
//兼容性
function thisMovie(movieName) {
    if (navigator.appName.indexOf("Microsoft") != -1) {
        return window[movieName]
    }
    else {
        return document[movieName]
    }
}
//=============================================================================
function getTimes(pars)
{	
var times = pars;
document.getElementById("time").innerHTML = "输出当前时间信息："+times+" ";
}
</script>
<!-- 播放器stop -->
</head>
<body>
	<div class="box1" id="formContent" whiteBg="true">
		<table class="tableStyle" formMode="view" width="400" align="center">
			<tr height="200">
				<td>
					<div align="left">
						<c:if test="${type ==1}"><textarea disabled="true" style="height: 180px;width: 745px;">${content }</textarea></c:if>
						<c:if test="${type ==0}">
							<div id="chxx"></div>
						</c:if>
					</div>
				</td>
			</tr>
			<tr <c:if test="${returnflag !=2}"> height="300"</c:if><c:if test="${returnflag ==2}"> height="400"</c:if>>
				<td>
					<!-- 根据returnflag来判断，0是未回复，1是文字回复，2是语音回复 ，如果是语音回复就默认到语音回复页面-->
					<div class="basicTabModern"  tabTitle="解脱" style="margin-top: -50px;" <c:if test="${returnflag ==2}">selectedIdx="1"</c:if>>
						<div name="文字回复" style="width: 400px; height: 200px;">
						<form action="<%=path %>/free!saveFree.action" method="post" id="myFormId">
							<!-- 忏悔ID和解脱ID -->
							<input type="hidden" name="free.confessionid" value="${confessionid }"/>
							<input type="hidden" name="free.id" value="${freeid }"/>
							<c:choose>
								<c:when test="${returnflag ==0}">   
									<input type="hidden"  name="returnflagType" value="0"/>
									<textarea class="validate[required]" id="content" name="free.content" style="height: 200px;width: 615px;margin-left: 70px;margin-top: 5px;"></textarea><br/>
									<input style="margin-left: 240px;margin-top: 20px;" type="submit"   value="回复"/>
								</c:when>
								<c:when test="${returnflag ==1}">   
									<input type="hidden"  name="returnflagType" value="1"/>
									<textarea class="validate[required]" id="content" name="free.content" style="height: 200px;width: 615px;margin-left: 70px;margin-top: 5px;">${freeContent }</textarea><br/>
									<input style="margin-left: 240px;margin-top: 20px;" type="submit"   value="更新"/>
								</c:when>
								<c:otherwise> 
									<input type="hidden"  name="returnflagType" value="2"/>
									<textarea class="validate[required]" id="content" name="free.content" style="height: 200px;width: 615px;margin-left: 70px;margin-top: 5px;"></textarea><br/>
									<input style="margin-left: 240px;margin-top: 20px;" type="submit"   value="更新"/	>						
								</c:otherwise> 
							</c:choose>
						</form>
						</div>
						<div name="语音回复" style="width: 400px; height: 200px;">
							<c:if test="${returnflag ==2}">
								<div id="jtxx" style="text-align:left;"></div>
							</c:if>
							<div class="container" style="margin-top: 0px;margin-left: -30px;" align="left">
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
											<form id="uploadForm" name="uploadForm"
												action="<%=path%>/freeUpload?confessionid=${confessionid }<c:if test="${returnflag ==2}">&fileid=${freeid }&returnflag=2</c:if><c:if test="${returnflag ==1}">&fileid=${freeid }&returnflag=1</c:if><c:if test="${returnflag ==0}">&returnflag=0</c:if>">
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
				</td>
			</tr>
		</table>
	</div>
<script type="text/javascript">
function initComplete() {
	//表单提交
	$('#myFormId').submit(
			function() {
				var returnflag = ${returnflag};//判断之前是否已经有解脱
				var text = "确认提交文字解脱吗？";
				if(returnflag==1){
					text = "之前已经有文字解脱了哦，确认修改文字解脱吗？";
				}
				if(returnflag==2){
					text = "之前已经有语音解脱了哦，确认修改为文字解脱吗？";
				}
				//判断表单的客户端验证是否通过
				var valid = $('#myFormId').validationEngine({
					returnIsValid : true
				});
				if (valid) {
						top.Dialog.confirm(text,function(){
							$('#myFormId').ajaxSubmit(
									{
										//表单提交成功后的回调
										success : function(responseText,
												statusText, xhr, $form) {
											top.Dialog.alert(
													responseText.message,
													function() {
														closeWin();
													})
										}
									});
					});
					}
				//阻止表单默认提交事件  
				return false;
			});
	playSound1();
	playSound2();
	}

	//重置
	function closeWin() {
		//刷新数据
		top.frmright.refresh(true);
		//关闭窗口
		top.Dialog.close();
	}

	function playSound1()
	{
		
	  var borswer = window.navigator.userAgent.toLowerCase();
	  if ( borswer.indexOf( "ie" ) >= 0 )
	  {
	    //IE内核浏览器
	    var strEmbed = '<embed src="${clxjconfessionUrl }${content }" style="margin-left:130px;" width="480" height="100" autostart="false"> </embed>';
	    //if ($("#ssss").find("embed").length <= 0)
	    //{
	      $("#chxx").append(strEmbed);
	    //}
	    //var embed = document.embedPlay;
	    //浏览器不支持 audion，则使用 embed 播放
	    //embed.volume = 100;
	    //embed.play();
	  } else
	  {
	    //非IE内核浏览器
	    var strAudio = "<audio id='audioPlay' src='${clxjconfessionUrl }${content }' controls='controls'></audio>";
	    //if ( $("#ssss").find("audio").length <= 0 ){
	    $("#chxx").append(strAudio);
	     //}
	    //var audio = document.getElementById("audioPlay");
	    //浏览器支持 audion
	    //audio.play();
	  }
	}

	function playSound2()
	{
		
	  var borswer = window.navigator.userAgent.toLowerCase();
	  if ( borswer.indexOf( "ie" ) >= 0 )
	  {
	    //IE内核浏览器
	    var strEmbed = '<embed src="<%=path %>${freeContent }" style="margin-left:130px;" width="480" height="100" autostart="false"></embed>';
	    //if ($("#ssss").find("embed").length <= 0)
	    //{
	      $("#jtxx").append(strEmbed);
	    //}
	    //var embed = document.embedPlay;
	    //浏览器不支持 audion，则使用 embed 播放
	    //embed.volume = 100;
	    //embed.play();
	  } else
	  {
	    //非IE内核浏览器
	    var strAudio = "<audio id='audioPlay' src='<%=path %>${freeContent }' controls='controls'></audio>";
	    //if ( $("#ssss").find("audio").length <= 0 ){
	    $("#jtxx").append(strAudio);
	     //}
	    //var audio = document.getElementById("audioPlay");
	    //浏览器支持 audion
	    //audio.play();
	  }
	}
	
</script>
</body>
</html>