<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	List<Integer>list = new ArrayList<>();
	while (list.size() != 6) {
		int num = (int)((Math.random()*45)+1);
		if (!list.contains(num)){
			list.add(num);
		};
		
	}
	Collections.sort(list);
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또번호 생성</title>
</head>
<body>
	<h2>로또번호 생성 결과</h2>
	이번주 로또는 이 번호다!!<br>
	<%= list %>
</body>
</html>