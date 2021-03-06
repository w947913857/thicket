<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    request.setAttribute("path", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.10 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>丛林闲居网</title>
    <link rel="stylesheet" href="${path}/static/style/cy.css">
    <link rel="stylesheet" href="${path}/static/style/style.css">
    <script src="${path}/static/js/laydate.js"></script>
    <link rel="stylesheet" href="${path}/static/style/laydate.css">
    <link rel="stylesheet" href="${path}/static/js/skins/molv/laydate.css">
    <script src="${path}/static/js/jquery.min.js"></script>
    <script type='text/javascript' src='${path}/static/js/citylist.js'></script>
    <script type='text/javascript' src='${path}/static/js/querycity.js'></script>
    <link href='${path}/static/style/cityquery.css' rel="stylesheet" type="text/css"/>
</head>

<body>
<!--首页TOP-->

<!--首页banner-->
<jsp:include page="/WEB-INF/qiantai/head.jsp"/>
<script type="text/javascript">
    function Alllogin() {
        window.location.href = "/login";
    }

    function loginOut() {
        window.location.href = "<%=path%>/reguser!loginOut.action?returnurl=/clxjmain!Homepage.action";
    }
</script>
<!--首页轮播图-->
<div class="index-lbt">
    <div id="scrollPics">
        <ul class="slider">
            <li><img src="${path}/static/roll/home/lbt1.png" class="lower" width="100%" height="380px"/></li>
            <li><img src="${path}/static/roll/home/lbt2.png" width="100%" height="380px"/></li>
            <li><img src="${path}/static/roll/home/lbt3.png" width="100%" height="380px"/></li>
            <li><img src="${path}/static/roll/home/lbt4.png" width="100%" height="380px"/></li>
            <li><img src="${path}/static/roll/home/lbt5.png" width="100%" height="380px"/></li>
        </ul>
        <ul class="num">
            <li class="on"></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>

    </div>
    <div class="nested">
        <div class="nTab">
            <div class="TabTitle">
                <ul id="myTab">
                    <li class="active normal"><p class="selected1"></p>丛林</li>
                    <li class=" normal"><p class="selected0"></p>闲居</li>

                </ul>
            </div>
            <div class="TabContent">
                <div class="myTab_Content">
                    <div class="lbttj">
                        <div class="tj-top">
                            <span class="gnxjac">国内丛林</span><span>国际丛林</span>
                        </div>
                        <div class="tj-bottom tj-bottom2">
                            <div class="xj">
                                <!-- 国内丛林 -->
                                <form action="<%=path %>/clxjmain!selClOfPage.action" method="post"
                                      onsubmit="getCity('11',yyqx)">
                                    <table>
                                        <tr>
                                            <td>目的地</td>
                                            <td class="sec"><input type="text" placeholder="请输入城市名" id="yyqx"
                                                                   data-wholename=""></td>
                                            <input type="hidden" name="clxjmain.belong_city" id="city11"/>
                                            <input type="hidden" name="clxjmain.type1" value="true"/>
                                            <input type="hidden" name="clxjmain.type2" value="true"/>
                                        </tr>
                                        <tr>
                                            <td>入住</td>
                                            <td><p><input name="startTime" class="laydate-icon ts" id="demo5"
                                                          value="2019-1-11"></p>

                                                <p>退房：<input name="endTime" class="laydate-icon" id="demo6"
                                                             value="2019-8-21"></p></td>
                                        </tr>
                                        <tr>
                                            <td>关键词</td>
                                            <td class="sec"><input type="text" name="clxjmain.name"
                                                                   placeholder="请输入地标/商圈/景点" id="gnclkey"></td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td class="ses sec"><input type="submit" value="搜索"></td>
                                        </tr>
                                    </table>
                                </form>
                            </div>
                            <div class="xj none">
                                <!-- 国外丛林 -->
                                <form action="<%=path %>/clxjmain!selClOfPage.action" method="post"
                                      onsubmit="getCity('01',jackson)">
                                    <table>
                                        <tr>
                                            <td>目的地</td>
                                            <td class="sec"><input type="text" placeholder="请输入城市名" id="jackson"
                                                                   data-wholename=""></td>
                                            <input type="hidden" name="clxjmain.belong_city" id="city01"/>
                                            <input type="hidden" name="clxjmain.type1" value="false"/>
                                            <input type="hidden" name="clxjmain.type2" value="true"/>
                                        </tr>
                                        <tr>
                                            <td>入住</td>
                                            <td><p><input name="startTime" class="laydate-icon ts" id="demo7"
                                                          value="2019-1-1"></p>

                                                <p>退房：<input name="endTime" class="laydate-icon" id="demo8"
                                                             value="2019-8-12"></p></td>
                                        </tr>
                                        <tr>
                                            <td>关键词</td>
                                            <td class="sec"><input type="text" name="clxjmain.name"
                                                                   placeholder="请输入地标/商圈/景点" id="gjclkey"></td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td class="ses sec"><input type="submit" value="搜索"></td>
                                        </tr>
                                    </table>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="myTab_Content none">
                    <div class="lbttj">
                        <div class="tj-top">
                            <span class="gnxjac">国内闲居</span><span>国际闲居</span>
                        </div>
                        <div class="tj-bottom tj-bottom1">
                            <div class="xj">
                                <!-- 国内闲居 -->
                                <form action="<%=path %>/clxjmain!selXjOfPage.action" method="post"
                                      onsubmit="getCity('10',zmx)">
                                    <table>
                                        <tr>
                                            <td>目的地</td>
                                            <td class="sec ">
                                                <input type="text" placeholder="请输入城市名" id="zmx" data-wholename="">
                                                <input type="hidden" name="clxjmain.belong_city" id="city10"/>
                                                <input type="hidden" name="clxjmain.type1" value="true"/>
                                                <input type="hidden" name="clxjmain.type2" value="false"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>入住</td>
                                            <td><p><input name="startTime" class="laydate-icon ts" id="demo1"
                                                          value="2019-1-2"></p>

                                                <p>退房：<input name="endTime" class="laydate-icon" id="demo2"
                                                             value="2019-4-12"></p></td>
                                        </tr>
                                        <tr>
                                            <td>关键词</td>
                                            <td class="sec"><input type="text" name="clxjmain.name"
                                                                   placeholder="请输入地标/商圈/景点" id="gnxjkey"></td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td class="ses sec"><input type="submit" value="搜索"> <!-- <a
                                                href="#"><img src="images/06.png">所有闲居</a> --></td>
                                        </tr>
                                    </table>
                                </form>
                            </div>
                            <div class="xj none">
                                <!-- 国外闲居 -->
                                <form action="<%=path %>/clxjmain!selXjOfPage.action" method="post"
                                      onsubmit="getCity('00',fromcity)">
                                    <table>
                                        <tr>
                                            <td>目的地</td>
                                            <td class="sec"><input type="text" placeholder="请输入城市名" id='fromcity'
                                                                   data-wholename=""></td>
                                            <input type="hidden" name="clxjmain.belong_city" id="city00"/>
                                            <input type="hidden" name="clxjmain.type1" value="false"/>
                                            <input type="hidden" name="clxjmain.type2" value="false"/>
                                        </tr>
                                        <tr>
                                            <td>入住</td>
                                            <td><p><input name="startTime" class="laydate-icon ts" id="demo3"
                                                          value="2019-2-12"></p>

                                                <p>退房：<input name="endTime" name="startTime" class="laydate-icon"
                                                             id="demo4" value="2019-9-12"></p></td>
                                        </tr>
                                        <tr>
                                            <td>关键词</td>
                                            <td class="sec"><input name="clxjmain.name" type="text"
                                                                   placeholder="请输入地标/商圈/景点" id="gjxjkey"></td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td class="ses sec"><input type="submit" value="搜索"><!-- <a
                                                href="#"><img src="images/06.png">所有闲居</a></td>-->
                                        </tr>
                                    </table>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="index-content">
    <div id="a1" class="index-recommended">
        <p class="rmtj">热门推荐<i>明月松间照，清泉石上流</i></p>

        <div class="taq1">
            <div>
                <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${topid1}"><img width="466" height="320"
                                                                                           src="${clxjBackurl }${top1 }"></a>
            </div>
            <span></span><span class="mfcy"><a
                href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${topid1}">${topname1 }</a> </span>
        </div>
        <div class="taq1 spec">
            <div>
                <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${topid2}"> <img width="467" height="320"
                                                                                            src="${clxjBackurl }${top2 }"></a>
            </div>
            <span></span><span class="mfcy"><a
                href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${topid2}">${topname2 }</a> </span>
        </div>
        <div class="taq2 spec">
            <div>
                <div>
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${topid3}"><img width="224" height="141"
                                                                                               src="${clxjBackurl }${top3 }"></a>
                    <span></span><span class="mfcy"><a
                        href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${topid3}">${topname3 }</a> </span>
                </div>
                <div class="spec2">
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${topid4}"><img width="224" height="141"
                                                                                               src="${clxjBackurl }${top4 }"></a>
                    <span></span><span class="mfcy"><a
                        href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${topid4}">${topname4 }</a> </span>
                </div>
            </div>
        </div>
    </div>
    <div id="a2" class="index-domestic">
        <div class="rmtj">
            <div class="rmtj1">国内<i>明月松间照，清泉石上流</i></div>
            <div class="rmtj2"><span class="forest">丛林</span><span>闲居</span></div><!--
            <div class="rmtj3"><a href="javascript:void(0)">更多国内游></a> </div>
        --></div>
        <div class="im-main">
            <div class="one">
                <div class="one-left">
                    <p class="rm">热门目的地</p>
                    <ul class="city">
                        <c:forEach items="${domesticHotCitys}" var="domestic">
                            <li><a href="javascript:void(0)"
                                   onclick="goOther(1,1,'${domestic.all }')">${domestic.chinese }</a></li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="one-con">
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id1}"><img width="467"
                                                                                                  height="320"
                                                                                                  src="${clxjBackurl }${type111 }"></a>
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id1}"><span>${type11name1 }</span></a>
                </div>
                <div class="one-right">
                    <div class="or-one">
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id2}"> <img width="223"
                                                                                                           height="142"
                                                                                                           src="${clxjBackurl }${type112 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id2}"><span>${type11name2 }</span></a>
                        </div>
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id3}"><img width="223"
                                                                                                          height="141"
                                                                                                          src="${clxjBackurl }${type113 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id3}"><span>${type11name3 }</span></a>
                        </div>
                    </div>
                    <div class="or-two">
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id4}"><img width="224"
                                                                                                          height="142"
                                                                                                          src="${clxjBackurl }${type114 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id4}"><span>${type11name4 }</span></a>
                        </div>
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id5}"><img width="224"
                                                                                                          height="141"
                                                                                                          src="${clxjBackurl }${type115 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type11id5}"><span>${type11name5 }</span></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="one none">
                <div class="one-left">
                    <p class="rm">热门目的地</p>
                    <ul class="city">
                        <c:forEach items="${domesticHotCitys}" var="domestic2">
                            <li><a href="javascript:void(0)"
                                   onclick="goOther(1,0,'${domestic2.all }')">${domestic2.chinese }</a></li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="one-con">
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id1}"><img width="467"
                                                                                                  height="320"
                                                                                                  src="${clxjBackurl }${type101 }"></a>
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id1}"><span>${type10name1 }</span></a>
                </div>
                <div class="one-right">
                    <div class="or-one">
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id2}"><img width="223"
                                                                                                          height="142"
                                                                                                          src="${clxjBackurl }${type102 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id2}"><span>${type10name2 }</span></a>
                        </div>
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id3}"><img width="223"
                                                                                                          height="141"
                                                                                                          src="${clxjBackurl }${type103 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id3}"><span>${type10name3 }</span></a>
                        </div>
                    </div>
                    <div class="or-two">
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id4}"><img width="224"
                                                                                                          height="142"
                                                                                                          src="${clxjBackurl }${type104 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id4}">
                                <span>${type10name4 }</span></a>
                        </div>
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id5}"><img width="224"
                                                                                                          height="141"
                                                                                                          src="${clxjBackurl }${type105 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type10id5}"><span>${type10name5 }</span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="a3" class="index-abroad">
        <div class="rmtj">
            <div class="rmtj1">境外<i>明月松间照，清泉石上流</i></div>
            <div class="rmtj2"><span class="forest1">丛林</span><span>闲居</span></div><!--
            <div class="rmtj3"><a href="javascript:void(0)">更多国内游></a> </div>
        --></div>
        <div class="ia-main">
            <div class="one">
                <div class="one-left">
                    <p class="rm">热门目的地</p>
                    <ul class="city">
                        <c:forEach items="${abroadHotCitys}" var="abroad">
                            <li><a href="javascript:void(0)"
                                   onclick="goOther(0,1,'${abroad.all }')">${abroad.chinese }</a></li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="one-con">
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id1}"><img width="465"
                                                                                                  height="320"
                                                                                                  src="${clxjBackurl }${type011 }"></a>
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id1}"><span>${type01name1 }</span></a>
                </div>
                <div class="one-right">
                    <div class="or-one">
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id2}"><img width="223"
                                                                                                          height="142"
                                                                                                          src="${clxjBackurl }${type012 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id2}"><span>${type01name2 }</span></a>
                        </div>
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id3}"> <img width="225"
                                                                                                           height="141"
                                                                                                           src="${clxjBackurl }${type013 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id3}"><span>${type01name3 }</span></a>
                        </div>
                    </div>
                    <div class="or-two">
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id4}"> <img width="224"
                                                                                                           height="142"
                                                                                                           src="${clxjBackurl }${type014 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id4}"><span>${type01name4 }</span></a>
                        </div>
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id5}"> <img width="224"
                                                                                                           height="141"
                                                                                                           src="${clxjBackurl }${type015 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type01id5}"><span>${type01name5 }</span></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="one none">
                <div class="one-left">
                    <p class="rm">热门目的地</p>
                    <ul class="city">
                        <c:forEach items="${abroadHotCitys}" var="abroad2">
                            <li><a href="javascript:void(0)"
                                   onclick="goOther(0,0,'${abroad2.all }')">${abroad2.chinese }</a></li>
                        </c:forEach>
                    </ul>
                </div>
                <div class="one-con">
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id1}"><img width="465"
                                                                                                  height="320"
                                                                                                  src="${clxjBackurl }${type001 }"></a>
                    <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id1}">
                        <span>${type00name1 }</span></a>
                </div>
                <div class="one-right">
                    <div class="or-one">
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id2}"><img width="223"
                                                                                                          height="142"
                                                                                                          src="${clxjBackurl }${type002 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id2}"><span>${type00name2 }</span></a>
                        </div>
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id3}"><img width="225"
                                                                                                          height="141"
                                                                                                          src="${clxjBackurl }${type003 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id3}"><span>${type00name3 }</span></a>
                        </div>
                    </div>
                    <div class="or-two">
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id4}"><img width="224"
                                                                                                          height="142"
                                                                                                          src="${clxjBackurl }${type004 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id4}"><span>${type00name4 }</span></a>
                        </div>
                        <div>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id5}"> <img width="224"
                                                                                                           height="141"
                                                                                                           src="${clxjBackurl }${type005 }"></a>
                            <a href="<%=path%>/clxjmain!selClxjOfId.action?clxjmain.id=${type00id5}"><span>${type00name5 }</span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div id="a4" class="index-charity">
        <div class="rmtj">
            <div class="rmtj1">慈善<i>明月松间照，清泉石上流</i></div><!--
            <div class="rmtj3"><a href="javascript:void(0)">更多景点></a> </div>
        --></div>
        <div class="ic-left">
            <div class="il-one">
                <p class="title">爱心捐赠</p>
                <p><input type="text" placeholder="请输入捐款人姓名"></p>
                <p><input type="text" placeholder="请输入捐款金额"></p>
                <p><a href="${path}/FoundDonations.jsp"><input type="submit" value="在线捐赠"></a></p>
            </div>
            <form action="${path}/DonationLove.jsp" method="post">
                <div class="il-two">
                    <p class="title">善款查询</p>
                    <p><input type="text" name="donationname" placeholder="要查找人姓名"></p>
                    <p><input type="text" name="donationtime" class="laydate-icon" id="demo9"
                              style="margin-left:0px;width:185px;"></p>
                    <p><input type="submit" value="在线查询"></p>
                </div>
            </form>
        </div>
        <div class="ic-con">
            <p class="ckax"><img src="${path}/images/07.png">实时查看基金会总爱心金额</p>
            <p class="money">${moneyCountStr }</p>
            <p><img src="${path}/images/jk_03.jpg"></p>
            <p class="xz"><span class="one"><a href="${path}/qiantai/PLpublicity.jsp">捐款支出细则</a> </span><span
                    class="two"><a href="${path}/qiantai/FoundIndex.jsp">基金会简介</a> </span></p>
        </div>
        <div class="ic-right">
            <p>捐款方式 / pattern</p>
            <ul>
                <li>单位名称： 江西济缘慈善基金会（筹）</li>
                <li>地 址： 江西省南昌高新开发区高新一路海外大厦北楼4层</li>
                <li>捐款热线： 400-688-6798</li>
                <li>邮箱地址：1415917674@qq.com</li>
                <li>银行户名：江西丛林闲居投资有限公司</li>
                <li>银行账号： 3605-0153-0150-0950-1617</li>
                <li>开 户 行： 建行南昌洪都支行</li>
            </ul>
        </div>
    </div>
</div>
<div id="nav">
    <ul>
        <li class="c"><a id="a11" href="#a1">推荐</a></li>
        <li><a id="a22" href="#a2">国内</a></li>
        <li><a id="a33" href="#a3">境外</a></li>
        <li><a id="a44" href="#a4">慈善</a></li>
    </ul>
</div>


<%--<%@ include  file="/qiantai/bottom.jsp"%>--%>
<script src="${path}/static/js"></script>
<script src="${path}/js/scorll.js"></script>
<script type="text/javascript">
    /*
        function(){
            laydate.skin('molv');//切换皮肤，请查看skins下面皮肤库
            laydate({elem: '#demo1'});//绑定元素
            laydate({elem: '#demo2'});//绑定元素
            laydate({elem: '#demo3'});//绑定元素
            laydate({elem: '#demo4'});//绑定元素
            laydate({elem: '#demo5'});//绑定元素
            laydate({elem: '#demo6'});//绑定元素
            laydate({elem: '#demo7'});//绑定元素
            laydate({elem: '#demo8'});//绑定元素
            laydate({elem: '#demo9'});//绑定元素
        }();*/
    //新方法，从数据库获得每种类型的城市的id
    var labelFromcity = new Array();
    labelFromcity['热门城市'] = new Array();
    labelFromcity ['A-F'] = new Array();
    labelFromcity ['G-J'] = new Array();
    labelFromcity ['K-N'] = new Array();
    labelFromcity ['O-W'] = new Array();
    labelFromcity ['X-Z'] = new Array();
    var interlabelFromcity = new Array();
    interlabelFromcity ['国际城市'] = new Array();
    var hotList = new Array(14, 15, 16, 17, 18, 19);
    $.ajax({
        type: "post",
        url: "<%=path %>/city!selCityType.action",
        data: {},
        dataType: "json",
        async: false,
        success: function (results) {
            for (var i = 0; i < results.citytypes.rm.length; i++) {
                labelFromcity['热门城市'][i] = results.citytypes.rm[i];
            }
            for (var i = 0; i < results.citytypes.a_f.length; i++) {
                labelFromcity[['A-F']][i] = results.citytypes.a_f[i];
            }
            for (var i = 0; i < results.citytypes.g_j.length; i++) {
                labelFromcity[['G-J']][i] = results.citytypes.g_j[i];
            }
            for (var i = 0; i < results.citytypes.k_n.length; i++) {
                labelFromcity[['K-N']][i] = results.citytypes.k_n[i];
            }
            for (var i = 0; i < results.citytypes.o_w.length; i++) {
                labelFromcity[['O-W']][i] = results.citytypes.o_w[i];
            }
            for (var i = 0; i < results.citytypes.x_z.length; i++) {
                labelFromcity[['X-Z']][i] = results.citytypes.x_z[i];
            }
            for (var i = 0; i < results.citytypes.gjcs.length; i++) {
                interlabelFromcity ['国际城市'][i] = results.citytypes.gjcs[i];
            }
        }
    });
    var citysFlight = new Array();
    //新方法，加载页面的时候把所有的城市的数据加载出来
    $.ajax({
        type: "post",
        url: "<%=path %>/city!initializeCity.action",
        data: {},
        dataType: "json",
        async: false,
        success: function (results) {
            for (var i = 0; i < results.citys.length; i++) {
                citysFlight[results.citys[i].id] = new Array('', results.citys[i].chinese, results.citys[i].pinyin, results.citys[i].abbreviations);
            }
        }
    });
    //国内闲居
    $('#zmx').querycity({'data': citysFlight, 'tabs': labelFromcity, 'hotList': hotList});
    //国际闲居
    $('#fromcity').querycity({'data': citysFlight, 'tabs': interlabelFromcity, 'hotList': hotList});
    //国内丛林
    $('#yyqx').querycity({'data': citysFlight, 'tabs': labelFromcity, 'hotList': hotList});
    //国际丛林
    $('#jackson').querycity({'data': citysFlight, 'tabs': interlabelFromcity, 'hotList': hotList});
    //以前的方法，js写死城市数据
    //labelFromcity['热门城市'] = new Array();
    //labelFromcity ['A-F'] = new Array(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,32,33,34,35,36,37,38,39);
    //labelFromcity ['G-J'] = new Array(40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85);
    //labelFromcity ['K-N'] = new Array(86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124);
    //labelFromcity ['O-W'] = new Array(125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184);
    //labelFromcity ['X-Z'] = new Array(185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231);

    //var interlabelFromcity = new Array();
    //interlabelFromcity ['国际城市'] = new Array(1001,1002,1003,1004,1005,1006,1007,1008,1009);
    //var hotList = new Array(14,15,16,17,18,19);

    $(document).ready(function () {

    });

    //des     目的地
    //sttime  入住时间
    //entime  退房时间
    //keyword 关键词
    function xj(des, sttime, entime, keyword) {
        alert(des + sttime + entime + keyword);
    }

    //将城市转换为拼音+城市名字
    function getCity(type, id) {
        var citypy;
        var cityzw;
        switch (id) {
            case zmx:
                citypy = $('#zmx').attr('data-wholename');
                cityzw = $('#zmx').val();
                break;
            case fromcity:
                citypy = $('#fromcity').attr('data-wholename');
                cityzw = $('#fromcity').val();
                break;
            case yyqx:
                citypy = $('#yyqx').attr('data-wholename');
                cityzw = $('#yyqx').val();
                break;
            case jackson:
                citypy = $('#jackson').attr('data-wholename');
                cityzw = $('#jackson').val();
                break;
        }
        var city = document.getElementById("city" + type);
        city.value = citypy + "|" + cityzw;
    }

    function goOther(type11, type2, city1) {
        var city = city1;
        city = encodeURI(city);
        city = encodeURI(city);//注意要两次
        var type1 = false;
        if (type11 == 1) {
            type1 = true;
        } else {
            type1 = false;
        }
        if (type2 == 1) {
            window.location.href = "<%=path%>/clxjmain!selClOfPage.action?clxjmain.type2=true&clxjmain.type1=" + type1 + "&city=" + city;
        } else {
            window.location.href = "<%=path%>/clxjmain!selXjOfPage.action?clxjmain.type2=false&clxjmain.type1=" + type1 + "&city=" + city;
        }
    }
</script>
</body>
</html>