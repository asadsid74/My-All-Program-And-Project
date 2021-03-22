<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<title>Products List</title>
</head>
<body>
	<h1>Change the Product Detail</h1>

	<h3>Products List</h3>

	<form action="${pageContext.request.contextPath }/productform" method="post">
		<table align="center">
				<tr>
				<td><input type="text" name="id" 
					value="${product.id }" />
					</tr>
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="name" placeholder="Enter Name"
					maxlength="30"
					value=${product.name } />
			</tr>

			<tr>
				<td>Product Description</td>
				<td><input type="text" name="description"
					placeholder="Enter Description" maxlength="30" 
					value=${product.description }
					/>
			</tr>

			<tr>
				<td>Product Price</td>
				<td><input type="text" name="price" placeholder="Enter Price"
					maxlength="30" 
					value="${product.price }"
					/>
			</tr>

			<tr>
				<td><input type="submit" name="save" maxlength="30" />
			</tr>
		</table>
	</form>

</body>
</html>
