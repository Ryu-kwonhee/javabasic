<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//로그인 상태에서만 이 페이지를 볼 수 있도록 처리
	String sessionId = (String)session.getAttribute("session_id");
	if(sessionId == null){
		response.sendRedirect("user_login_form.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%= sessionId %>회원 탈퇴를 진행합니다.</h1>
	<form action="user_delete_ok.jsp" method="post">
		비밀번호를 한 번 더 입력해주세요.<br/>
		삭제 진행 후 되돌릴 수 없으니 주의하세요.<br/>
		<input type="password" name="dpw" placeholder="삭제할 계정 비밀번호"><br/>
		<input type="submit" value="제출">
	</form>
</body>
</html>