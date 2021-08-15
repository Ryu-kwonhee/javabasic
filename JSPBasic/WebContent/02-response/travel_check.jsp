<%@page import="java.util.jar.Attributes.Name"%>
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
	String travel = request.getParameter("travel");
	
%>
<%
	if (travel.equals("TOKYO")) {
	response.sendRedirect("travel_TOKYO.jsp");
	} else if(travel.equals("NEWYORK")) {
	response.sendRedirect("travel_NEWYORK.jsp");
	} else if(travel.equals("CAPETWON")) {
	response.sendRedirect("travel_CAPETOWN.jsp");
	} else if(travel.equals("HOCHIMIN")) {
	response.sendRedirect("travel_HOCHIMIN.jsp");
	}
%>
</body>
</html>