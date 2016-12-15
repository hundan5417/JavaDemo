<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
        Cookie c1 = new Cookie("country","cn");
        response.addCookie(c1);
%>

</head>
<body >
<p>1</p>${cookie.country.name}
<p>1</p>${cookie.country.value}
<p>1</p>${1.2E4 + 1.4}
<p>1</p>${10.5f;}


</body>
</html>