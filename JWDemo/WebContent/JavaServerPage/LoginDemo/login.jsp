<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form name="LoginForm" method="post" action="login.jsp">
    <span>姓名</span><input name="userName" type="text" size="32" title="请输入姓名">
    <br>
    <span>密码</span><input name="passWord" type="password" size="32" title="请输入密码">
    <br>
    <input type="submit" name="submit1" value="登录" title="点击登录">
    <input type="reset" name="submit2" value="充值" title="点击重置">
</form>
</center>


</body>
</html>