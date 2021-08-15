<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<% request.setCharacterEncoding("utf-8"); %>
	<%
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI지수</title>
</head>
<body>
	키 : <%= height %><br>
	체중 : <%= weight %><br>
	<%
	// cm를 변수로 표현하면 가독성을 높일 수 있다.
	double cm = (Double.parseDouble(height)/100);
	double bmi = 
	Double.parseDouble(weight)/(cm*cm);

	%>
	BMI지수 : 
	<b><%= bmi %></b><br>
	<%
		if (bmi >= 23) {
			out.println("과체중입니다.");
		} else if(bmi < 18.5) {
			out.println("저체중입니다.");
		} else {
			out.println("정상입니다.");
		}
	%>
</body>
</html>