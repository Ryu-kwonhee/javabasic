<%@ page import="java.sql.*" %>
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
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	
	String spw = (String)session.getAttribute("sessionPw");
	String dpw = request.getParameter("dpw");
	String sessionId = (String)session.getAttribute("sessionId");
	
	Connection con = null;
	PreparedStatement pstmt = null;
	
	if (spw.equals(dpw)) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/ict03";
		con = DriverManager.getConnection(url, "root", "mysql");
		
		String sql = "DELETE FROM site WHERE id=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(2, sessionId);
		
		pstmt.executeUpdate();
		
		session.invalidate();
	} catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(con != null && !con.isClosed()) {
				con.close();
			}
			if(pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}

	} else {
		response.sendRedirect("site_login_form.jsp");	
}		
%>
</body>
</html>