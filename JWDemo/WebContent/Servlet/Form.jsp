<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>Insert title here</title>
</head>
<body>
<h2>请输入用户信息</h2>
<br>
<Form method="post" action="<%=request.getContextPath()%>/servlet/MyLoginServletDemo" >
<Label>用户名：</Label><Input type="text" name="username"><br>
<Label>密码：</Label><Input type="password" name="password"><br>
        
 
     <input type="submit" value="提交">
      <input type="reset" value="重置">
</Form>
</body>
</html>