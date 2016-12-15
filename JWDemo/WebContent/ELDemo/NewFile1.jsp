<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<% 
 pageContext.setAttribute("color-dk", "red");
%>

</head>
<body >
<table border="1" cellpadding="0">
<tr>
<td>逻辑运算</td>
<td>el表达式</td>
<td>result</td>
</tr>
<tr>
<td>与</td>
<td>${'${'} ture and true}</td>
<td>${ture and true}</td>
</tr>
<tr>
<td>与</td>
<td>${'${'} ture && true}</td>
<td>${ture && true}</td>
</tr>


<tr>
<td>或</td>
<td>${'${'} ture or false}</td>
<td>${ture or false}</td>
</tr>
<tr>
<td>或</td>
<td>${'${'} ture || false}</td>
<td>${ture || false}</td>
</tr>


<tr>
<td>非</td>
<td>${'${'} not true}</td>
<td>${not true}</td>
</tr>
<tr>
<td>非</td>
<td>${'${'} !false}</td>
<td>${!false}</td>
</tr>




</table>
<hr/>
	
${!(afjlasf)?5:88} <!--布尔值默认是false -->
<hr/>
<p style="color: ${pageScope['color-dk']}">adasjlkfaljkdfs</p>



</body>
</html>