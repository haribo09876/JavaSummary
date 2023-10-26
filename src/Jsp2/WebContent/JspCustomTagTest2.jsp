<%@page import="ezen.dto.StudentDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JspCustomTagTest2</title>
<script type="text/javascript">
	
</script>
</head>
<body>

	<jsp:include page="./Header.jsp" />

	<%
		ArrayList<StudentDto> studentList = (ArrayList<StudentDto>) request.getAttribute("studentList");

		for (StudentDto student : studentList) {
	%>

	<div style="border: 1px solid black;">
		<%=student.getNo()%>,
		<%=student.getName()%>,
		<%=student.getClassName()%>,f
		<%=student.getDtoClass()%>
	</div>

	<%
		}
	%>
	<jsp:include page="./Tail.jsp" />
</body>
</html>