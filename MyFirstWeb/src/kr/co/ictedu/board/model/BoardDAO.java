package kr.co.ictedu.board.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class BoardDAO {
	// 싱글턴 패턴과 커넥션풀을 적용해서
	// DAO의 연결부(생성자, getInstance())까지 작성해주세요.
	
	private DataSource ds;
	
	private BoardDAO() {
		try {
			Context ct = new  InitialContext();
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
		// Connection, PreparedStatement 객체선언
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode;
		// 구문작성
		// bId는 auto_increment가 붙어있으므로 입력 안 해도 됨
		// bName. bTitle, bContent는 폼에서 날려준걸 넣음
		// bDate는 자동으로 현재 서버시간을 입력함
		// bHit는 자동으로 0을 입력함 
		String sql = "INSERT INTO jspboard (bname, btitle, bcontent, bdate, bhit)"
				+ "VALUES(?, ?, ?, now(), 0)";
		
		try {
			// 커넥션 생성 및 pstmt에 쿼리문 넣고 완성시켜서 실행까지 하고
			// close()로 메모리 회수까지 해주세요.
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getBname());
			pstmt.setString(2, board.getBtitle());
			pstmt.setString(3, board.getBcontent());
			
			pstmt.executeUpdate();
			resultCode = 1;
			
			
		} catch(Exception e) {
			e.printStackTrace();
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
	}// end write
	
	// 모든 게시글의 정보를 DB로부터 얻어올 메서드
	public List<BoardVO> getBoardList() {
		// 내부에서 사용할 변수 선언
		List<BoardVO> boardList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// SQL문 작성
		String sql = "SELECT * FROM jspboard ORDER BY bid DESC";
		
		try {
			// 커넥션 연결 후 DB에 쿼리 쏴주시고
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			// boardList에 DB내 모든 글을 저장해주세요. 
		while (rs.next()) {
			BoardVO board = new BoardVO();
			
			board.setBid(rs.getInt("bid"));
			board.setBname(rs.getString("bname"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBdate(rs.getTimestamp("bdate"));
			board.setBhit(rs.getInt("bhit"));
			
			boardList.add(board);
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
		return boardList;
	}// end getBoardList
	
	
	public BoardVO getBoardDetail(String bid) {
		// bid에 해당하는 글 정보를 가져와서 리턴하도록 로직을 작성해주세요.
		BoardVO board = new BoardVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM jspboard WHERE bid=?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bid);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				board.setBid(rs.getInt("bid"));
				board.setBname(rs.getString("bname"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBdate(rs.getTimestamp("bdate"));
				board.setBhit(rs.getInt("bhit"));
			}
			
		} catch(SQLException e) {
			System.out.println("에러 : "+e);
		}finally {
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
			String sql = "DELETE FROM jspboard WHERE bid=?";
			
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
		String sql = "UPDATE jspboard SET bname=?, btitle=?, bcontent=?, bdate=?, bhit=? WHERE bid=?";
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
	
	
	// 글 조회수를 상승시키는 메서드
	public void upHit(String bid) {
		// 필요 변수들을 생성해주세요.
		
		// 특정 글의 조회수를 1 올리는 쿼리문 
		String sql = "UPDATE jspboard SET bhit = bhit + 1 WHERE bid=?";
		
		// DB연결 후 코드를 실행해주세요.
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
	
	// 페이지 번호에 맞는 게시물 가져오기
		public List<BoardVO> getPageList(int pageNum){
			// 내부에서 사용할 변수 선언
			List<BoardVO> boardList = new ArrayList<>();
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			// 쿼리문(SELECT구문, 역순, 10개씩 pageNum에 맞춰서);
			String sql = "SELECT * FROM jspboard ORDER BY bid DESC " +
						"LIMIT ?, 10";
			try {
				// 연결구문을 다 작성해주세요. 리턴구문까지.
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, pageNum);
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
				} catch(Exception e) {
					e.printStackTrace();
				}			
			}
			return boardList;
		} // end getPageList
		
		
		// 페이징 처리를 위해 DB내 전체 데이터 개수 알아오기
		public int getBoardCount() {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int countNum = 0;
			
			String sql = "SELECT COUNT(*) FROM jspboard";
			
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				rs = pstmt.executeQuery();
				if(rs.next()) {
					countNum = rs.getInt(1);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(con!=null && !con.isClosed()) {
						con.close();
					}
					if(pstmt!=null && !pstmt.isClosed()) {
						pstmt.close();
					}
					if(rs!=null && !rs.isClosed()) {
						rs.close();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			return countNum;
		} // end getCountBoard()
		
}

