<!DOCTYPE html>
<html>
<head>
<!-- 编码 -->
<meta charset="UTF-8" />

<!-- ie -->
<meta http-equiv="X-UA-Compatible" content="IE=edge;chrome=1" />

<!-- for mobile -->
<meta name="viewport"
	content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">

<!-- for search-->
<meta name="keywords" content="uikoo9.com" />
<meta name="description" content="uikoo9.com" />
<meta name="author" contect="qiaowenbin" />
<meta name="robots" contect="all" />

<!-- title -->
<title>录音实例</title>

<!-- favicon.ico -->
<link href="${base}/record/favicon.ico" type="image/x-icon"
	rel="bookmark" />
<link href="${base}/record/favicon.ico" type="image/x-icon" rel="icon" />
<link href="${base}/record/favicon.ico" type="image/x-icon"
	rel="shortcut icon" />

<!-- fill -->
<style type="text/css">
html, body {
	height: 100%;
}

#wrap {
	min-height: 100%;
	height: auto !important;
	height: 100%;
	margin: 0 auto -60px;
}

#push, #footer {
	height: 60px;
}

#footer {
	background-color: #f5f5f5;
	text-align: center;
}

@media ( max-width : 767px) {
	#footer {
		margin-left: -20px;
		padding-left: 20px;
	}
}
</style>

<!-- base -->
<script type="text/javascript">
	var base = '${base}';
</script>

<!-- jquery -->
<!--框架必需start-->
<script type="text/javascript" src="${base}/libs/js/jquery.js"></script>
<script type="text/javascript" src="record/js/jquery.min.js"></script>
<script type="text/javascript" src="${base}/libs/js/framework.js"></script>
<link href="${base}/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" id="skin" prePath="${base}/"/>
<link rel="stylesheet" type="text/css" id="customSkin"/>
<!--框架必需end--> 




<!-- bootstrap -->
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" href="record/js/bootstrap.min.css">
<script type="text/javascript" src="record/js/bootstrap.min.js"></script>
<!--[if lt IE 9]>
	<script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<!-- =============================================================================================================== -->
				<!-- =========================================录音部分从这里开始，页面仅仅需要一下部分======================================= -->
				<!-- =============================================================================================================== -->
				<script type="text/javascript" src="${base}/record/js/swfobject.js"></script>
				<script type="text/javascript" src="${base}/record/js/recorder.js"></script>
				<script type="text/javascript" src="${base}/record/js/main.js"></script>
				<link rel="stylesheet" href="${base}/record/style.css">
				<div class="qcontainer" id="myRecordDiv">
					<div id="recorder-audio" class="control_panel idle">
						<button class="record_button"
							onclick="FWRecorder.record('audio', 'audio.wav');" title="Record">
							<img src="${base}/record/images/record.png" alt="开始录音">
						</button>
						<button class="stop_recording_button"
							onclick="FWRecorder.stopRecording('audio');"
							title="Stop Recording">
							<img src="${base}/record/images/stop.png" alt="停止录音">
						</button>
						<button class="play_button"
							onclick="FWRecorder.playBack('audio');" title="Play">
							<img src="${base}/record/images/play.png" alt="播放">
						</button>
						<button class="pause_playing_button"
							onclick="FWRecorder.pausePlayBack('audio');"
							title="Pause Playing">
							<img src="${base}/record/images/pause.png" alt="暂停">
						</button>
						<button class="stop_playing_button"
							onclick="FWRecorder.stopPlayBack();" title="Stop Playing">
							<img src="${base}/record/images/stop.png" alt="停止">
						</button>
						<div class="level"></div>
					</div>

					<div class="details">
						<button class="show_level" onclick="FWRecorder.observeLevel();">显示声波</button>
						<button class="hide_level"
							onclick="FWRecorder.stopObservingLevel();" style="display: none;">隐藏声波</button>
						<button class="show_settings" onclick="microphonePermission()">麦克风权限</button>
						<span id="save_button" style="display: inline-block;"> <object
								data="${base}/record/recorder.swf" name="recorderApp"
								id="recorderApp" type="application/x-shockwave-flash"
								height="24" width="24">
								<param value="upload_image=${base}/record/images/upload.png"
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
					<form id="uploadForm" name="uploadForm" action="${base}/freeUpload" method="post">
						<input type="hidden" name="title" id="title" value="11"/>
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
</body>
</html>