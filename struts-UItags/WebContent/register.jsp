<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resister Page</title>
</head>
<body>
	<s:form action="Register" method="post">
		<s:textfield name="userName" label="User Name"></s:textfield>
		<s:password name="passWord" label="Password"></s:password>
		<s:radio name="gender" label="Gender" list="{'Male','Female'}"></s:radio>
		<s:select name="country" label="Select a country" list="countryList"
			listKey="countryId" listValue="countryName" headerKey="0"
			headerValue="Country"></s:select>
		<s:textarea name="about" label="About you"></s:textarea>
		<s:checkboxlist name="community" label="community"
			list="communityList"></s:checkboxlist>
		<s:checkbox name="mailingList"
			label="Would you lika to join out mailing list?"></s:checkbox>
		<s:submit></s:submit>
	</s:form>

</body>
</html>