<%@ page import="java.sql.*" %>
<%@page import="java.sql.SQLException"%>
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
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nickname");
	String email = request.getParameter("email");

	
	Connection con = null;
	PreparedStatement pstmt = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/ict03";
		con = DriverManager.getConnection(url, "root", "mysql");
		
		String sql = "INSERT INTO site VALUES(?, ?, ?, ?, ?)";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, id);
		pstmt.setString(3, pw);
		pstmt.setString(4, nick);
		pstmt.setString(5, email);
	
	}catch(SQLException e) {
		e.printStackTrace();
	
	} finally {
		try {
			if(con != null && con.isClosed()) {
				con.close();
			}
			if(pstmt != null && pstmt.isClosed()) {
				pstmt.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
%>
	<h2><%= nick %><%= (id) %>님 환영합니다.</h2><br>
	<h2>가입 되었습니다.</h2><br>
	<a href="site_login_form.jsp">로그인</a>
</body>
</html>