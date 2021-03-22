
<html>
<head>
<%@include file="./base.jsp"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


</head>

<body>
	<h2 align="center">Hello Hey! there i am using Springframwork!</h2>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12"></div>

			<h1 class="text-center mb-3">Welcome to Product App</h1>

			<table class="table table-grey">
				<thead>
					<tr>
						<th scope="col">Sr.No</th>

						<th scope="col">Product Name</th>
						<th scope="col">Product Description</th>
						<th scope="col">Product Price</th>
						<th scope="col">Product Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${products }" var="p">
						<tr>
							<th scope="row">potech${p.id }</th>
							<td>${p.name }</td>
							<td>${p.description }</td>
							<td class="font-weight-bold"> &#x20B9;${p.price }</td>
							<td>
							<a href="delete/${p.id }">delete</a>
							<a href="update/${p.id }">update</a>
							</td>
						</tr>

					</c:forEach>
				</tbody>
			</table>
			<div class="container text-center">
				<a href="product_form" class="btn btn-outline-success">Add
					Product</a>
					

			</div>

		</div>

	</div>

</body>
</html>
