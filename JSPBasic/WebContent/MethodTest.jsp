<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘의 온도</title>
</head>
<body>
	<%!
		public double C = 33;
		double CtoF(double C) {
			return (C * 1.8) + 32; 
		}
	%>
	<%
		out.println("<h2>오늘의 온도</h2><br>");
		out.println("섭씨온도 : "+ "<strong>"+C +"</strong>"+ "<br>");
		out.println("화씨온도 : "+"<strong>"+CtoF(C)+"</strong>");
	%>
</body>
</html>
