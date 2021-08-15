<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int total = 0;
%> 
<%
	int num = (int)((Math.random()* 8)+2);
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% total++; %>
	페이지 누적 요청수 : <%= total %><br>
	매 <b>10</b>번째 방문자에게는 기프티콘을 드립니다.<br>
<%
	if (total %  10 == 0) {
		out.println("당첨되셨습니다!!"+"<br>");
	} 
%>
	<h2>랜덤 구구단(<%= num %>단)</h2>
	이번에 나온 구구단은 <%= num %>단입니다.<br><br>
	<% 
	for (int i = 1; i<=9; i++) {
		out.println(num + " x " + i + " = "+num*i+"<br>");
	}
	%>
</body>
</html>