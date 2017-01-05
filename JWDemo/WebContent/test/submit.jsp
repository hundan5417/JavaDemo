<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提交</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/servlet/testServlet" method="post" >
<table border="1" cellspacing="0" align="center" valign="center">
<tr>
<td>姓名</td>
<td>班级</td>
<td>课程</td>
<td>分数</td>
</tr>
<tr>
<td>
<input type="text" name="name" style="height: 100%;width: 100%;border: none;">
</td>
<td>
<input type="text" name="classes" style="height: 100%;width: 100%;border: none;">
</td>
<td>
<input type="text" name="course" style="height: 100%;width: 100%;border: none;">
</td>
<td>
<input type="text" name="score" style="height: 100%;width: 100%;border: none;">
</td>
</tr>
</table>
<input type="submit" value="保存">
</form>
</body>
</html>