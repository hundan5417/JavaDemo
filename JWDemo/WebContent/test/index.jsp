<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生成绩表</title>
</head>
<body style="width: 600px;">
<center><p>学生成绩表</p></center>
<a href="/JWDemo/test/submit.jsp"><input type="button" value="add " id="b1"></a>
<input type="button" value="update" style="margin-left: 80px;" id="b2">
<input type="button" value="remove" style="margin-left: 80px;" id="b3">
<input type="button" value="select" style="margin-left: 80px;" id="b4">
<hr/>
<table style="width: 600px;">
<tr>
<td>姓名</td>
<td>班级</td>
<td>课程</td>
<td>分数</td>
</tr>

<% 
List lst = (List)session.getAttribute("list");
if (lst.get(0) != null){
%>
<%= lst.toString() %>
<%} %>

</table>
</body>
</html>