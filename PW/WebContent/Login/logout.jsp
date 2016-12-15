<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image:url('../Images/logout.jpg');background-repeat:repeat;background-size: 100%;">
<%
     response.setHeader("refresh", "4,login.jsp");
     session.invalidate();

%>
<dir>
<p style="margin-left: 50px; margin-top:400px;font-size: 30px;color:yellow;">你已成功注销本系统，稍后调回登录界面！</p>
<p style="margin-left: 50px; font-size: 30px;color:yellow;">如果没有跳转，请点击<a href="/PW/Login/andy.jsp">这儿</a>手动跳转。</p>
</dir>

</body>
</html>