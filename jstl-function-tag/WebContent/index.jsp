<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jstl function tag</title>
</head>
<body>
<h1>now we are going to function tag of jstl</h1>
<c:set var="b" value=  "  my name is asad khan   "> </c:set>
<c:set var="a" value="AlhamdulillaH"> </c:set>
<h1><c:out value="${a }"></c:out>
<h1> length of this is 
<c:out   value="${fn:length(a) }"></c:out>
</h1>
<h1>in upppercASE  <c:out value="${fn:toUpperCase(a) }"></c:out></h1>
<h1>in LOWERCASE  <c:out value="${fn:toLowerCase(a) }"></c:out></h1>
<h1>contains are the <c:out value="${fn:contains(a,'khan') }"></c:out></h1>
<h1>index value of a     <c:out value="${fn:indexOf(a,'l') }"></c:out></h1>
<hr>

<h1>in upppercASE  <c:out value="${fn:toUpperCase(a) }"></c:out></h1>
<h1><c:out value="${fn:containsIgnoreCase(a,'H') }"></c:out></h1>
<h1>replace is the   <c:out value="${fn:replace(a,'h','haram') }"></c:out></h1>
<h1> start with this is <c:out value="${fn:startsWith(a,'Al') }"></c:out></h1>
<h1> split method <c:out value="${fn:split(a,'=') }"></c:out></h1>
<h1>substring  <c:out value="${fn:substring(a,'3','8') }"></c:out></h1>
<hr>
<h1><c:out value="${b }"></c:out></h1>
<h1> trim is <c:out value="${fn:trim(b) }"></c:out></h1>
</h1>
</body>
</html>