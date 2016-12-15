<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Login</title>
<style type="text/css">
.inp {
	border: 0.5px solid black;
	padding: 5px 10px;
	width: 270px;
	height: 20px;
	font: 14px normal Arial;
	color: #333333;
}
</style>


</head>
<body style="background-image: url('../Images/login.jpg'); background-repeat:repeat;background-size: 100%;">
<div>
	<form action="<%= request.getContextPath() %>/servlet/LoginCheck" method="post">
		<div style="margin-top: 200px; margin-left: 180px;">
			<span style="font-size: 20px;">用户名：</span><img alt=""
				src="../Images/username.png" width="20px;" height="20px;"> <input
				class="inp" type="text" name="userName" title="请输入用户名" size="32" style="background:rgba(0, 0, 0, 0); "/><br />
			<span style="font-size: 20px;">密&nbsp;码：</span><img alt=""
				src="../Images/password.png" width="20px;" height="20px;"> 
		<input class="inp" type="password" name="passWord" title="请输入密码" size="32" style="background:rgba(0, 0, 0, 0); "/><br />

			<input type="submit" name="sub1" value="登录" title="点击登录"
				style="margin-left: 160px; margin-top: 20px;background-color:rgba(0, 0, 0, 0);width: 60px;height: 30px; " /> 
			<input type="reset" name="sub2" value="清除" title="点击清除" 
			    style="margin-left: 40px;background-color:rgba(0, 0, 0, 0);width: 60px;height: 30px;" />
		</div>
	</form>
	</div>
	<%-- <%
    String userName = request.getParameter("userName");
    String pword = request.getParameter("passWord");
    if(null != userName && null != pword){
    	if("andy".equals(userName) &&  "123456".equals(pword)){
        	  response.setHeader("refresh", "4,welcome.jsp");
        	  session.setAttribute("id", userName);
            %>
	<p style="margin-left: 180px; font-size: 30px;color:white;">登录成功，稍后自动跳转到欢迎页</p>
	<p style="margin-left: 180px; font-size: 30px;color:white;"">
		如果没有跳转，请点击<a href="welcome.jsp">这儿</a>
	</p>

	<%
    }else{
    	   %>
	<p style="margin-left: 180px;font-size: 30px;color:white;"">
		用户名或密码错误，点击<a href="login.jsp">这儿</a>请重新登录
	</p>
	<%
    	 }
    }
       %>
 --%>


</body>
</html>