<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    Cookie[] cookies = request.getCookies();
    String userId = "";
    String userPw = "";
    
    for ( Cookie c : cookies) {
    	String cookieName = c.getName();
    	if (cookieName.equals("remember_id")) {
    		userId = c.getValue();
    	}
    	if (cookieName.equals("remember_pw")) {
    		userPw = c.getValue();
    	}
    }
    System.out.println(userId);
    System.out.println(userPw);

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="cookie_login_ok.jsp" method="post">
		<input type="text" name="id" placeholder="ID"
			value="<%= userId %>"/>
		<input type="checkbox" name="id_check" value="yes">
		아이디 기억하기<br>
		<input type="password" name="pw" placeholder="PW"
			value="<%= userPw %>"/>
		<input type="checkbox" name="pw_check" value="yes">
		비밀번호 기억하기<br><br>
		
		<input type="submit" value="로그인"/>
</body>
</html>