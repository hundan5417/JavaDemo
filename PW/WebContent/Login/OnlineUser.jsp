<%@page import="org.eclipse.jdt.internal.compiler.ast.AllocationExpression"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OnlineUser</title>
</head>
<body style="background-image:url('../Images/Blackfrost_Anivia_Splash.jpg');background-repeat:repeat;background-size: 100%;">
<div style="font-size: 30px;color:yellow;">
<p>用户在线人数:</p>
<% Set all = (Set)this.getServletContext().getAttribute("online"); %>
<%= all.size()%>
<p>用户在线列表:</p>
<%
   
   Iterator iter = all.iterator();
   while(iter.hasNext()){
%>
<%= iter.next() %>
<br/>
<%} %>
</div>

</body>
</html>