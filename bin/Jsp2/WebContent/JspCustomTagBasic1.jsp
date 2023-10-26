<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JspCustomTagBasic1</title>
	<script type="text/javascript">

	</script>
</head>
<body>
<!-- 	@ jsp 전용 태그 -->
<!-- 		- 지시자(Directive) : jsp페이지와 관련된 속성을 정의할 때 사용하는 태그이다 -->
<%-- 	<%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%--     pageEncoding="UTF-8"%> --%>
	
	
<!-- 		@ 스크립트릿 -->
<%-- 			- jsp 파일 안에 자바 코드를 넣을 때 <% %> 안에 작성한다 --%>
<!-- 				스크립트릿 태그 안에 작성한 내용은 서블릿 파일을 만들 때 그대로 복사된다 -->
	
		<%
			String val1 = "";
			String val2 = "";
			String result = "";
			
			val1 = "1";
			val2 = "2";
			result = val1 + val2;
			
			System.out.println(result);
		%>
	
	
<!-- 		@ 선언문 (Declaration) -->
<!-- 			- 서블릿 클래스의 멤버를 선언할 때 사용하는 태그 -->
<%-- 				<%! %>을 작성한다 --%>
			
			
<!-- 		@ 표현식 (Expression) -->
<!-- 			- 표현식 태그는 문자열을 출력할 때 사용한다 -->
<%-- 				<%= %> 안에 결과를 반환하는 자바 코드가 와야 한다 --%>
<!-- 				표현식 안의 자바 코드는 출력문으로 만들어진다 -->
					
<%-- 				<%= 결과를 반환하는 자바 표현식%> --%>
			
			<input type="text" value="<%=val1%>">
	
</body>
</html>