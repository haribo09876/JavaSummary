<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 목록</title>

<style type="text/css">

table, tr, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
}
</style>

</head>

<body>
	<jsp:include page="/Header.jsp" />
	<h1>회원목록</h1>
	
	
	
	<p><a href='./add'>신규 회원</a></p>
	
	
	<table>
		<tr>
			<th>
				번호
			</th>
			<th>
				이름
			</th>
			<th>
				이메일
			</th>
			<th>
				가입일
			</th>
			<th>
				수집 동의일
			</th>
			<th></th>
		</tr>
		
		<c:forEach var="memberDto" items="${memberList}">
		<tr>
			<td>${memberDto.no}</td>
			<td>
				<a href='./update?no=${memberDto.no}'>${memberDto.name}</a>
			</td>
			<td>${memberDto.email}</td>
			<td>${memberDto.createdDate}</td>
			<td>${memberDto.modifiedDate}</td>
			<td>
				<a href='./delete?no=${memberDto.no}'>[삭제]</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<jsp:include page="/Tail.jsp" />
</body>
</html>