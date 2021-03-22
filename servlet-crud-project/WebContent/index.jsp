<%@page import="com.userbean.UserPojo"%>
<%@page import="com.daointerface.Daointerface"%>
<%@page import="com.daoimplement.DaoImplementation"%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Requestpage" method="post">
		<table>

			<td>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="S_name"></td>
			</tr>
			</td>


			<tr>
				<td>Address:</td>
				<td><input type="text" name="S_address"></td>
			</tr>

			<tr>
				<td>Mob_no:</td>
				<td><input type="text" name="S_mono"></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="S_salary"></td>
			</tr>

			<td><input type="submit" value="go">
		</table>
		<table border="2">
			<th>id</th>
			<th>name</th>
			<th>Address</th>
			<th>Mob_no</th>
			<th>salary</th>
			<%
				Daointerface d = new DaoImplementation();
				List<UserPojo> list = d.fetch();
				Iterator itr = list.iterator();
				while (itr.hasNext()) {
					UserPojo b = (UserPojo) itr.next();
			%>

			<tr>
				<td><%=b.getId()%></td>
				<td><%=b.getS_name()%></td>
				<td><%=b.getS_address()%></td>
				<td><%=b.getS_mono()%></td>
				<td><%=b.getS_salary()%></td>
				<td><a href="#"
					onclick="update('<%=b.getId()%>','<%=b.getS_name()%>','<%=b.getS_address()%>','<%=b.getS_mono()%>','<%=b.getS_salary()%>')">Update</a></td>
				<td><a href="Requestpage?Name=<%=b.getId()%>">Delete</a></td>


				<%
					}
				%>
			</tr>
		</table>
	</form>
</body>
</html>