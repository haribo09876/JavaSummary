<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>2</title>

	<script type="text/javascript">

	</script>
</head>
<body>
	
	<%
		pageContext.setAttribute("scoreArr", new int[]{90, 80, 70, 100});
	%>

<%-- 	${scoreArr[3]} --%>
	<c:forEach var="test" items="${scoreArr}">
		<div>
			${test}
		</div>
	</c:forEach>

	<hr>
	<c:forEach var="test" items="${scoreArr}" begin="2" end="3">
		<div>
			${test}
		</div>	
	</c:forEach>
	
</body>
</html>