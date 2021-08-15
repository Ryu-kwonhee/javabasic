package testboard.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	
	private DataSource ds;
	
	private BoardDAO() {
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static BoardDAO dao = new BoardDAO();
	public static BoardDAO getInstance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}
	public int write(BoardVO board) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode;
		
		String sql = "INSERT INTO board (bname, btitle, bcontent, "
				+ "bdate, bhit +VALUES(?, ?, ?, now(), 0)";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getBname());
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(1, board.getBcontent());
			
			pstmt.executeUpdate();
			resultCode = 1;
		} catch(Exception e) {
			e.printStackTrace();
			resultCode = 0;
		}finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	}// end write
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM board ORDER BY bid DESC";
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
		while(rs.next()) {
			BoardVO board = new BoardVO();
			
			board.setBid(rs.getInt("bid"));
			board.setBname(rs.getString("bname"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBdate(rs.getTimestamp("bdate"));
			board.setBhit(rs.getInt("bhit"));
			
			boardList.add(board);
		}
		} catch(Exception e) {
			e.printStackTrace();
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
		return boardList;
	}// end getBoardList
	
	public BoardVO getBoardDetail(String bid) {
		BoardVO board = new BoardVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM board WHERE bid=?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  bid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setBid(rs.getInt("bid"));
				board.setBname(rs.getString("bname"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBhit(rs.getInt("bhit"));
			}
		} catch(SQLException e) {
			System.out.println("에러 : "+e);
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
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return board;
	}// end getBoardDetail
	
	public int deleteBoard(String bid) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode;
		
		try {
			con = ds.getConnection();
			String sql = "DELETE FROM board WHERE bid=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bid);
			
			pstmt.executeUpdate();
			resultCode = 1;
		} catch(SQLException e) {
			System.out.println("에러 : "+e);
			resultCode = 0;
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	}// end deleteBoard
	
	public int updateBoard(BoardVO board) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode;
		String sql = "UPDATE board SET bname=?, btitle=?, bcontent, "
				+ "bdate=?, bhit=? WHERE bid=?";
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getBname());
			pstmt.setString(2, board.getBtitle());
			pstmt.setString(3, board.getBcontent());
			pstmt.setTimestamp(4, board.getBdate());
			pstmt.setInt(5, board.getBhit());
			pstmt.setInt(6, board.getBid());
			
			pstmt.executeUpdate();
			resultCode = 1;
		} catch(SQLException e) {
			System.out.println("에러 : "+e);
			resultCode = 0;
		}finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	}// end updateBoard
	
	public void upHit(String bid) {
		String sql = "UPDATE board SET bhit = bhit + 1 WHERE bid=?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bid);
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}// end bhit
}
