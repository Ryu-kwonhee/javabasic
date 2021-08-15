<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String age = request.getParameter("age");
    
    
    %>	
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int a = Integer.parseInt(age);	
		if(a >= 20) {
			response.sendRedirect("res_ok.jsp");
		} else {
			response.sendRedirect("res_no.jsp");
		}
	%>
</body>
</html>