
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL project</title>
</head>
<body>
<h1>this is exammple</h1>
<c:set var ='a' value='780' scope="application"></c:set>
<%-- <h1><c:out value="${a }"></c:out></h1>
<c:remove var="a"/> --%>

<c:out value="${a } this is default value"></c:out>
<hr>

<c:if test="${a>20 }"></c:if>
<c:out value="${a } True"></c:out>

<br>
<c:choose>
<c:when test="${a<=21 }">
<h1>first</h1>
<h1>
number is small than 30
</h1>
</c:when>
<c:when test="${a>=900 }">
<h1>Second</h1>
<h1>
number is greater2 than 30
</h1>
</c:when>
<c:when test="${a==30 }">
<h1>third</h1>
</c:when>
<c:otherwise>default</c:otherwise>



</c:choose>
<br>
<hr>
<c:forEach var="k" begin="20" end="36">
<c:out value="${k }" ></c:out></c:forEach>
<br>

<c:url var="s" value="https://www.jio.com/search">
<c:param name="w" value="onlyjava"></c:param>
</c:url>
<h1><c:out value="${s }"></c:out></h1>

<c:redirect url="${s }"></c:redirect>
</body>
</html>