<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB2312">
<title>Insert title here</title>
</head>
<body>
<h2>�������û���Ϣ</h2>
<br>
<Form method="post" action="<%=request.getContextPath()%>/servlet/MyLoginServletDemo" >
<Label>�û�����</Label><Input type="text" name="username"><br>
<Label>���룺</Label><Input type="password" name="password"><br>
        
 
     <input type="submit" value="�ύ">
      <input type="reset" value="����">
</Form>
</body>
</html>