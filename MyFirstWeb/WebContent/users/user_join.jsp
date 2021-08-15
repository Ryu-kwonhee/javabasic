<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입 창</h1>
	<form action="/MyFirstWeb/join.do" method="post">
		<input type="text" name="uid" placeholder="ID"><br>
		<input type="password" name="upw" placeholder="PW"><br>
		<input type="text" name="uname" placeholder="NAME"><br>
		<input type="email" name="email" placeholder="EAMIL"><br>
		<input type="submit" value="회원가입하기">
	</form>
</body>
</html>