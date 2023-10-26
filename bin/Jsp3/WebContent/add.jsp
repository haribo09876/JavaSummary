<%@ page language='java' contentType='text/html; charset=UTF-8'
    pageEncoding='UTF-8'%>
<!DOCTYPE html>
<html>
<head>
	<meta charset='UTF-8'>
	<title>회원 등록</title>
</head>

<body>

<h1>회원등록</h1>
<form action='add' method='post'>
이름: <input type='text' name='name'><br>
이메일: <input type='text' name='email'><br>
암호: <input type='password' name='password'><br>
<input type='submit' name='추가'><br>
<input type='reset' name='취소'><br>
</form>
	
</body>
</html>