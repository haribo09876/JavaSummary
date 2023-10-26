<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>1</title>

	<script type="text/javascript">

	</script>
</head>
<body>
<!-- 	리퀘스트 객체에 List를 담는다 -->
<!-- 	db 초기에 입력한 인물 5명의 이름을 저장하고 -->
	
<!-- 	보기 좋게 라인을 구분하여 모든 인물들을 출력하시오 -->

	<%
		ArrayList<String> nameList = new ArrayList<String>();
			nameList.add("홍길동");
			nameList.add("임꺽정");
			nameList.add("일지매");
			nameList.add("이몽룡");
			nameList.add("성춘향");
		request.setAttribute("nameList", nameList);
	%>

	<c:forEach var="nameList" items="${nameList}">
		${nameList}<br><hr>
	</c:forEach>
	
</body>
</html>