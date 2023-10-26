<%@page import="ezen.dto.StudentDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JspCustomTagTest1</title>
	<script type="text/javascript">

	</script>
</head>
<body>

	<%
	ArrayList<StudentDto> studentList = new ArrayList<>();
	
	StudentDto studentDto1 = new StudentDto(1, "학생1", "1반", "studentDto1");
// 	studentDto1.setNo(1);
// 	studentDto1.setName("고길동");
// 	studentDto1.setClassName("1반");
// 	studentDto1.setDtoClass("studentDto1");
	studentList.add(studentDto1);
	
	StudentDto studentDto2 = new StudentDto(2, "학생2", "2반", "studentDto2");
// 	studentDto2.setNo(2);
// 	studentDto2.setName("홍길동");
// 	studentDto2.setClassName("2반");
// 	studentDto2.setDtoClass("studentDto2");
	studentList.add(studentDto2);
	
	StudentDto studentDto3 = new StudentDto(3, "학생3", "3반", "studentDto3");
// 	studentDto3.setNo(3);
// 	studentDto3.setName("이순신");
// 	studentDto3.setClassName("3반");
// 	studentDto3.setDtoClass("studentDto3");
	studentList.add(studentDto3);
	%>

	<div>
		번호 : <%=studentDto1.getNo()%><br>
		이름 : <%=studentDto1.getName()%><br>
		반 이름 : <%=studentDto1.getClassName()%><br>
		DTO클래스 : <%=studentDto1.getDtoClass()%>
	</div>
	<br>
	<div>
		번호 : <%=studentDto2.getNo()%><br>
		이름 : <%=studentDto2.getName()%><br>
		반 이름 : <%=studentDto2.getClassName()%><br>
		DTO클래스 : <%=studentDto2.getDtoClass()%>
	</div>
	<br>
	<div>
		번호 : <%=studentDto3.getNo()%><br>
		이름 : <%=studentDto3.getName()%><br>
		반 이름 : <%=studentDto3.getClassName()%><br>
		DTO클래스 : <%=studentDto3.getDtoClass()%>
	</div>
<!-- 		학생		번호 -->
<!-- 					이름 -->
<!-- 					반명 -->
<!-- 					DTO클래스 -->
					
<!-- 					3명의 임의의 학생을 list에 담고 -->
					
<!-- 					익스프레션을 활용하여 div태그에 각각 학생 정보를 출력하시오 -->
	
</body>
</html>