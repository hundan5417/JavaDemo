<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
</head>
<body style="background-image:url('../Images/welcome.jpg');background-repeat:repeat;background-size: 100%;">


<div style="margin-top: 200px;margin-left: 180px; font-size: 20px;">
<p style="margin-left: 50px; margin-top:400px;font-size: 30px;color:red;">欢迎<%=session.getAttribute("userid") %>的到来。</p>
<p style="margin-left: 50px; font-size: 30px;color:red;">如果你想退出，请点<a href="/PW/Login/logout.jsp">这儿</a></p>
<p style="margin-left: 50px; font-size: 30px;color:red;">也可以点击<a href="/PW/Login/OnlineUser.jsp">点我点我</a>查看在线人数和数量</p>

 </div>


    

</body>
</html>