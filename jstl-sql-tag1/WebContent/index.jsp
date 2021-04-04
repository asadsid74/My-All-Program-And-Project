<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL tags </title>
</head>
<body>
<h1>THIS IS MY SQL TAG</h1>

<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/world","root","root" var="ds"/>
<sql:query dataSource="${ds }" var="rs"> select * from kld</sql:query>

<table>
<tr>
<td>
U_ID
</td>
<td>
U_Name
</td>
<td>
U_Address
</td>
<td>
U_Salary
</td>
</tr>
</table>

</body>
</html>