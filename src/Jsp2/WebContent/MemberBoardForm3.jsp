<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>MemberBoardForm3</title>
	<script type="text/javascript">

	</script>
</head>
<body>

	<h1>jsp에서 jsp로 이동?</h1>
	<form action="/JspTempBasic/MemberBoardForm.jsp" method="get">
		<input type="text" name="abc" value="">
		<input type="text" name="id" value="">
		<input type="password" name="pwd" value="">
		
		<input type="submit" value="서블릿(화면)에 정보 전송 버튼">
	</form>
	
</body>
</html>