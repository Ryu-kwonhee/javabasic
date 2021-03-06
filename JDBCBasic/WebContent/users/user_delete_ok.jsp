<%@page import="kr.co.ictedu.UsersVO"%>
<%@page import="kr.co.ictedu.UsersDAO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.setCharacterEncoding("utf-8");
	request.setCharacterEncoding("utf-8");
	// 세션쪽 아이디, 비밀번호, 그리고 사용자가 폼으로 보낸 비밀번호 얻기
	String spw = (String)session.getAttribute("session_pw");	
	String dpw = request.getParameter("dpw");
	String sessionId = (String)session.getAttribute("session_id");
	
	
	// 1. DAO를 생성하고
	UsersDAO dao = UsersDAO.getInstance();
	// 2. UsersVO를 생성하되, spw, sessionId만 setter로 넣어주세요.
	UsersVO user = new UsersVO();
	user.setUid(sessionId);
	user.setUpw(spw);
	// 3. DAO의 deleteUsers 기능을 호출하면서 파라미터로 적절한 자료를 넘겨주세요.
	int deleteResultNum = dao. usersDelete(user, dpw);
	System.out.println(deleteResultNum);
	// 삭제로직이 잘 돌아가는지 디버깅
	
	// 4. 결과에 따라 세션만 파기할지 redirect까지 해줄지 결정
	
	if (deleteResultNum == 1) {
	session.invalidate();
	} else if(deleteResultNum == 0){
	session.invalidate();
	response.sendRedirect("user_login_form.jsp");
	}
	
	
	
	
	
	
// 	Connection con = null;
// 	PreparedStatement pstmt = null;
	
// 	if(spw.equals(dpw)){
// 		// DB연결로직을 집어넣어주세요.
// 		try{
//   			Class.forName("com.mysql.cj.jdbc.Driver");
			
// 			String url = "jdbc:mysql://localhost/ict03";
			
// 			con = DriverManager.getConnection(url, "root", "mysql");
		
// 			// 1. SELECT 쿼리문을 작성합니다.
// 			// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문을 작성해주세요.
// 			String sql = "DELETE FROM users WHERE uid=?";
			
// 			// 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다.
// 			pstmt = con.prepareStatement(sql);
// 			pstmt.setString(1, sessionId);
	
// 			// 3. 쿼리문 실행
// 			pstmt.executeUpdate();
			
// 			// 세션 파기는 두 번  실행할 수 없으므로
// 			// 로직당 한 번만 실행되도록 배치한다.
// 			session.invalidate();
			
// 		} catch (SQLException e){
// 			e.printStackTrace();
// 		} finally{
// 			// 연결 끊기
// 			try {
// 				if(con!=null && !con.isClosed()){
// 					con.close();
// 				}
// 				if(pstmt!=null && !pstmt.isClosed()){
// 					pstmt.close();
// 				}
	
// 			} catch (SQLException e){
// 				e.printStackTrace();
// 			}
// 		}
// 	} else {
// 		session.invalidate();
// 		response.sendRedirect("user_login_form.jsp");
// 	}
		
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%= sessionId %>계정 삭제가 완료되었습니다.</h1>
	<a href="user_login_form.jsp">삭제 확인 및 돌아가기</a>
</body>
</html>