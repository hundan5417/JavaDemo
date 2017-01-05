<%@page import="com.java.javaweb.listener.LoginUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session Bound</title>
</head>
<body>
<p>绑定session</p>
<%
   LoginUser user = new LoginUser("10086");
   session.setAttribute("id", user);
%>
</body>
</html>