<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 창</h1>
	<form action="/MyFirstWeb/login.do" method="post">
		<input type="text" name="uid" placeholder="ID"><br>
		<input type="password" name="upw" placeholder="PW"><br>
		
		<a href="user_join.jsp">회원가입</a>
		<input type="submit" value="로그인">
		<br>
	</form>
</body>
</html>