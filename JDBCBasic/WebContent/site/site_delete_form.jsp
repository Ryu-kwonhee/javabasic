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
		String sessionId = (String)session.getAttribute("sessionId");
			if(sessionId == null) {
				response.sendRedirect("site_login_form.jsp");
			}
	%>
	<h1>회원 탈회를 진행합니다.</h1><br>
	<h2>삭제한 아이디로는 다시 가입할 수 없습니다.</h2><br>
	<form action="site_delete_ok.jsp">
		<input type="password" name="dpw" placeholder="비밀번호">
		
		<input type="submit" value="확인">
	</form>
</body>
</html>