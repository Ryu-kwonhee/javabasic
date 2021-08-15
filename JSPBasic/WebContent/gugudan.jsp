<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% for (int num = 2; num <= 9; num++) {%>
	<% if (num % 2 == 1) {%>
	<% out.print("<h2>"+"구구단"+num+"단"+"</h2>");%><hr>
	<% for (int i = 1; i <= 9; i++) { %>
	<% out.println(num + " * "+i+" = "+ num*i);%> <br/>
	<% } %>
	<% } %>
	<% } %>

</body>
</html>