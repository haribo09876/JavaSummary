<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello Spring</title>
<script type="text/javascript">
	function loginMoveFnc() {
		var formObj = document.getElementById('simpleForm');
		
		formObj.submit();
	}
</script>
</head>
<body>
	<h1>Hello Spring Projects</h1>
	
	<form action="auth/login.do" id="simpleForm" method="get">
		<input type="button" value="로그인 화면으로 이동" onclick="loginMoveFnc();">	
	</form>
	
	
</body>
</html>