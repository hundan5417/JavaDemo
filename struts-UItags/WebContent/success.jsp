<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Details Page</title>
</head>
<body>
	User Name:
	<s:property value="userName" />
	<br /> gender:
	<s:property value="gender" />
	<br /> country:
	<s:property value="country" />
	<br /> about you:
	<s:property value="about" />
	<br /> community:
	<s:property value="community" />
	<br /> mailingList:
	<s:property value="mailingList" />
	<br />

</body>
</html>