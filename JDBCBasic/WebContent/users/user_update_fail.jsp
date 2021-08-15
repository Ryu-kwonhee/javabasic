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
	<h1>수정에 실패했습니다.</h1><br>
	<a href="user_login_form.jsp">로그인 창으로 가기</a>
	
</body>
</html>