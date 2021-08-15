<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 1. 세션을 통해 아이디를 가져옵니다.
	// 	만약 로그인 상태가 아니면 로그인 창으로 리다이렉트합니다.
	String sessionId = (String)session.getAttribute("session_id");
	if(sessionId == null) {
		response.sendRedirect("user_login_form.jsp");
	}
	
	
	// 2. dao를 통해 UsersVO를 가지고 와야 합니다. 
	UsersDAO dao = UsersDAO.getInstance();
	UsersVO user = new UsersVO();
	user.setUid(sessionId);
	
	// 3. 들고 온 UsersVO를 이용해 아래 html 태그의 value속성에 표현식을 이용해 
	//	UsersVO의 아이디, 이름, 이메일을 기입하게 만들어줍니다.
	UsersVO resultData = dao.getUserInfo(user);
	System.out.println(resultData);
	
	if(resultData.getUid() == null) {
		session.invalidate();
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
	<h1><%= resultData.getUid() %>님 계정 정보 수정</h1>
	<form action="user_update_ok.jsp" method="post">
<<<<<<< HEAD
		<input type="text" name="uid" readonly="true" placeholder="ID"  value=<%= resultData.getUid() %>><br>
=======
		<input type="text" name="uid" readonly="true" placeholder="ID" value=<%= resultData.getUid() %>><br>
>>>>>>> branch 'master' of https://github.com/Ryu-kwonhee/javabasic.git
		<input type="passowrd" name="upw" placeholder="PW"><br>
		<input type="text" name="uname" placeholder="NAME" value=<%= resultData.getUname() %>><br>
		<input type="email" name="email" placeholder="EMAIL" value=<%= resultData.getEmail() %>><br>
		
		<input type="submit" value="회원정보 수정"><br>
	</form>
</body>
</html>