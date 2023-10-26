<%@page import="ezen.dto.StudentDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JspCustomTagTest3</title>
<script type="text/javascript">
	
</script>
</head>
<body>
<!-- 	h1태그들이 있다 홀수들은 빨간색 -->
<!-- 	짝수들은 파란색 경계선으로 만들고 -->
	
<!-- 	h?에 있는 숫자들 * 100 한 값이 안의 내용으로 출력되도록 구현하시오 -->

	<%
		int[] numArr = new int[6];
		for(int i=0; i<6; i++) {
			numArr[i] = i + 1;
		}		
		pageContext.setAttribute("numArr", numArr);
	%>
	
	<c:forEach var="tagNum" items="${numArr}">
		<c:if test="${tagNum % 2 == 1}" var="result">
			<div style="border: 1px solid red;">
				<h${tagNum}>${100 * tagNum}</h${tagNum}>
			</div>
		</c:if>
		<c:if test="${tagNum % 2 == 0}" var="result">
			<div style="border: 1px solid blue;">
				<h${tagNum}>${100 * tagNum}</h${tagNum}>
			</div>
		</c:if>
	</c:forEach>
			

</body>
</html>