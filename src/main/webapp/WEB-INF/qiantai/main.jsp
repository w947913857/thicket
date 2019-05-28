<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    request.setAttribute("path", path);
%>
<html>
<link rel="stylesheet" href="<%=path%>/static/css/style.css" type="text/css"/>
<frameset cols="200,*" border="2">
    <frame scrolling="no" frameborder="0" src="/left" noresize="noresize"/>
    <frame frameborder="0" src="/right" name="frmright">
</frameset>
<noframes></noframes>
</html>