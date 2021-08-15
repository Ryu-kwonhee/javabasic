<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.invalidate();
	%>
	<h1>로그아웃이 완료되었습니다.</h1><br>
	<a href="site_login_form.jsp">로그인하러 가기</a>
</body>
</html>