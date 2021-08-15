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
	// 세션 파기 코드를 아래에 작성해주세요.
	session.invalidate();
	
	// login페이지로 리다이렉트 해주세요.
	if(request.isRequestedSessionIdValid()) {
	} else {
		
		response.sendRedirect("session_login.jsp");
	}
	
	
%>
</body>
</html>