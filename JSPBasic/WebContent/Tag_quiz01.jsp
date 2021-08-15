<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!	
	int total = 0;
	
%>	
<%
	String str = "Web";
	int each = 0;
	each++;
	total++;
%>
<%!	
	int randomNum() {
	int num = (int)((Math.random()* 10)+1);
	return num; 
}
	 String color() {
		double colorNum = Math.random();
	if (colorNum >= 0.66) {
		return "빨강";
	} else if (colorNum >= 0.33) {
		return "노랑";
	} else {
		return "파랑";
	} 
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>행운의 숫자와 색깔</title>
</head>
<body>
<h2><%= str %>프로그래밍</h2>
	페이지 누적 요청수 : <%= total %>
	페이지 개별 요청수 : <%= each %>
<h3>오늘의 행운의 숫자와 행운의 색깔</h3>
	행운의 숫자 : <%= randomNum() %>
	행운의 색깔 : <%= color() %>
	

</body>
</html>