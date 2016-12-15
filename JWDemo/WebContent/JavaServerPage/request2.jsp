<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request2</title>
</head>
<body>
   
        <%
        String uString =(String) request.getAttribute("name");
        %>
        <h1>姓名2：</h1>
        <%= uString %>
       <jsp:forward page="request3.jsp"></jsp:forward>

</body>
</html>