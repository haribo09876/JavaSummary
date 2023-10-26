<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JspCustomTagBasic3</title>
</head>
<body>

	<h3>c:if</h3>

	<div style="border: 1px solid black;">
		<c:if test="${10 < 20}" var="result">
			10은 20보다 작다
		</c:if>
	</div>
	
	${pageScope.result}
<%-- 	<c:if test="조건" var="변수명" scope="변수를 담을 장소"> --%>
<!-- 		조건이 맞으면 수행될 내용들 -->
<%-- 	</c:if> --%>
							
</body>
</html>