<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8"); %>
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    %>
<!DOCTYPE html>
<html>
<% if (id.equals("abcd")&&pw.equals("1234"))  { %>
<head>
<meta charset="UTF-8">
<title>로그인 성공!</title>
</head>
<body>
	<b><%= id %></b>님 환영합니다.
</body>
<% }else if(id.equals("abcd")) { %>
<head>
<meta charset="UTF-8">
<title>로그인 실패!</title>
</head>
<body>
	<b>로그인에 실패하셨습니다. <br>
	비밀번호가 다릅니다.
	</b>
	<a href="req_login_form.jsp">로그인 창으로 돌아가기</a>
</body>
<% } else {%>
<head>
<meta charset="UTF-8">
<title>로그인 실패!</title>
</head>
<body>
	<b>로그인에 실패하셨습니다. <br>
	아이디가 없습니다.
	</b>
	<a href="req_login_form.jsp">로그인 창으로 돌아가기</a>
</body>
<% } %>
</html>