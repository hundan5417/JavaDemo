<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table align="center" border="1" cellspacing="0" width="680">
		<tr>
			<th>序号</th>
			<th>Product Name:</th>
			<th>Product Price:</th>
			<th>Product Description:</th>
			<th>Product Time:</th>
			<th>Product Age:</th>
			<th>delete</th>
		</tr>
		<c:forEach items="${product}" var="product" varStatus="vs">
			<tr>
			
				<td>${vs.count}</td>
				<td>${product.value.name}</td>
				<td>${product.value.price}</td>
				<td>${product.value.description}</td>
				<td>${product.value.time}</td>
				<td>${product.value.age}</td>

				<td><a href="product_del.action?id=${product.value.id}">delete</a></td>



			</tr>
		</c:forEach>
	</table>
	<form action="product_update.action" method="post">
		<fieldset>
			<legend>Add a product</legend>
			<label for="id">要修改的行:</label> <input type="text" id="id" name="id"
				value="" tabindex="2" required /> <label for="name">Product
				Name:</label> <input type="text" id="name" name="name" value="" tabindex="2"
				required /> <label for="description">Description:</label> <input
				type="text" id="description" name="description" value=""
				tabindex="2" required /> <label for="price">Price:</label> <input
				type="text" id="price" name="price" value="" tabindex="3" required />
			<label for="time">time:</label> <input type="text" id="time"
				name="time" value="" tabindex="3" required /> <label for="age">age:</label>
			<input type="text" id="age" name="age" value="" tabindex="3" required />

			<div id="buttons">
				<label for="dummy"></label> <input type="reset" id="reset"
					tabindex="4" /> <input type="submit" id="submit" tabindex="5"
					value="Update Product" />

			</div>
		</fieldset>
	</form>

</body>
</html>