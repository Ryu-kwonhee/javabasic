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
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String session_id = (String)session.getAttribute("sessionId");
	if(session_id != null) {
		id = session_id;
	} else {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/ict03";
			con = DriverManager.getConnection(url, "root", "mysql");
			
			String sql = "SELECT * FROM site WHERE id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			if(rs.next()) {
			String siteId = rs.getString("id");
			String sitePw = rs.getString("pw");
				
			rs = pstmt.executeQuery();
			
			if (id.equals(siteId)&&pw.equals(sitePw)) {
				session.setAttribute("sessionId", siteId);
				session.setAttribute("sessionPw", sitePw);
			} else {
				response.sendRedirect("site_login_fail.jsp");
			}
		} else {
				response.sendRedirect("site_login_fail.jsp");
		}
	} finally {
		try {
			if(con != null && !con.isClosed()) {
				con.close();
			}
			if(pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
			if(rs != null && !rs.isClosed()) {
				rs.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
<<<<<<< HEAD

=======
}
>>>>>>> branch 'master' of https://github.com/Ryu-kwonhee/javabasic.git
	
%>
<h1><%= id %>님 환영합니다.</h1>
<h2>로그인 되었습니다.</h2>
<a href="site_logout.jsp">로그아웃</a>
<a href="site_delete_form.jsp"></a>
</body>
</html>