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
	String sports = request.getParameter("sports");

	if (sports.equals("swim")) {
		response.sendRedirect("swim.jsp");
	} else if (sports.equals("valley ball")) {
		response.sendRedirect("valley ball");
	} else if (sports.equals("soccer")) {
		response.sendRedirect("soccer");
	}else if (sports.equals("judo")) {
		response.sendRedirect("judo");
	}

%>
</body>
</html>