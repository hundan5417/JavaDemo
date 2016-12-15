

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
  <%@ page import="com.java.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSLDemo1</title>
</head>
<body>
<c:out value="hi"></c:out>
<c:set var="name" value="andy"></c:set><br/>
     ${'${'}name}:${name}
<c:set var="name2">Andy</c:set><br/>
  ${'${'}name2}:${name2}
  <hr/>
  
</body>
</html>