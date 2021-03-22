
<%@page import="java.util.Iterator"%>
<%@page import="com.Pojo.bean"%>
<%@page import="java.util.List"%>
<%@page import="com.Daoimpl.Daoimplmt"%>
<%@page import="com.Dao.Daoiinterface"%>
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
<td><input type="name" id="n"  name="Name"></td>
</tr>
</td>


<tr>
<td>mobile no.:</td>
<td><input type="name" id="m"  name="MO_no" ></td>
</tr>

<tr>
<td>Address:</td>
<td><input type="name" id="a"  name="Address"></td>
</tr>

<td><input type="submit" id="submit" name="submit" value="save">
</table>
<table border="2">
<th>name </th>
<th>Mobile no</th>
<th>Address</th>
<%
Daoiinterface d=new Daoimplmt();
List<bean> list=d.GetAlldata();
Iterator itr=list.iterator();
while(itr.hasNext()){
	bean b=(bean) itr.next();
	%>

	<tr>
	<td><%= b.getName() %></td> 
	<td><%= b.getMO_no() %></td>
	<td><%= b.getAddress() %></td>
	<td><a href="#" onclick="update('<%=b.getName()%>','<%=b.getMO_no()%>','<%=b.getAddress()%>')">Update</a></td>
	<td><a href="Requestpage?Name=<%=b.getName()%>">Delete</a></td>
	
<%} %>
</tr>
</table>

<script type="text/javascript">
	function update(Name,MO_no,Address) {
	 document.getElementById('n').value=Name;
		document.getElementById('m').value=MO_no;
		document.getElementById('a').value=Address;
		
		document.getElementById('submit').innerHTML="update";
		document.getElementById('submit').value="update"; 
		}
	
	</script>


</form>
</body>
</html>