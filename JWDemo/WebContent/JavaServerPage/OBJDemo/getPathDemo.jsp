<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>getPathDemo</title>
</head>
<body>
<%
      String path =this.getServletContext().getRealPath("/");
      String path1 = application.getRealPath("/");
      
 %>
 <h3>真是路径：<%= path %></h3>
 <h3>真是路径1：<%= path1 %></h3>
</body>
</html>