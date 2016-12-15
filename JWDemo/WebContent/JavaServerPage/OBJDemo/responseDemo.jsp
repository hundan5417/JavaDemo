<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>responseDemo</title>
</head>
<body>
<%! int x = 10; %>
<%
response.setHeader("refresh", "1");
%>
<h1 style="text-align: center;font-size: 80px;">距离爆炸还有<%= x-- %>秒</h1>
<%
  if(x==0){
	 response.setHeader("refresh", "1;url=https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=%E9%BB%91%E6%B4%9E&rsv_pq=e73caafb0000898e&rsv_t=da0bLG20OPJdG1DlJkyeNox07DdH8VDkqGmZfnxhu8IW%2FEJ7Yfoz7LKiNX4&rqlang=cn&rsv_enter=1&rsv_sug3=12&rsv_sug1=7&rsv_sug7=100");
  }
%>
</body>
</html>