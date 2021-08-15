package kr.co.ictedu;
import java.sql.*;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SiteDAO {
	private DataSource ds;
	
	private static final String URL = "jdbc:mysql://localhost/ict03";
	private static final String DBID = "root";
	private static final String DBPW = "mysql";

	private static final int ID_DELETE_SUCCESS = 1;
	private static final int ID_DELETE_FAIL = 0;
	 
	private static final int ID_LOGIN_SUCCESS = 1;
	private static final int ID_LOGIN_FAIL = 0;
	
	private static final int ID_UPDATE_SUCCESS = 1;
	private static final int ID_UPDATE_FAIL = 0;
	
	
	private SiteDAO() {
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static SiteDAO dao = new SiteDAO();
	
	public static SiteDAO getInstance() {
		return dao;
	}
	
	public int joinSite(SiteVO site) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();
			String sql = "INSERT INTO site VALUES(?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, site.getName());
			pstmt.setString(2, site.getId());
			pstmt.setString(3, site.getPw());
			pstmt.setString(4, site.getNick());
			pstmt.setString(5, site.getEmail());
			
			pstmt.executeUpdate();
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
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}// end joinSite
	
	public int siteDelete(SiteVO site, String dpw) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			if(site.getPw().equals("dpw")) {
				con = ds.getConnection();
				String sql = "DELETE FROM site WHERE id=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, site.getId());
				pstmt.executeUpdate();
				
				return ID_DELETE_SUCCESS;
			} else {
				return ID_DELETE_FAIL;
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
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ID_DELETE_FAIL;
	}// end siteDelete
	
	public int siteLogin(SiteVO site) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = ds.getConnection();
			String sql = "SELECT * FROM site WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, site.getId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String dbId = rs.getString("id");
				String dbPw = rs.getString("pw");
				
				if(site.getId().equals(dbId)&&site.getPw().contentEquals(dbPw)) {
					return ID_LOGIN_SUCCESS;
				} else {
					return ID_LOGIN_FAIL;
				}
			} else {
				return ID_LOGIN_FAIL;
			}
		} catch(SQLException e) {
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
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ID_LOGIN_FAIL;
	}// end siteLogin
	
	public SiteVO getSiteInfo(SiteVO site) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		SiteVO resultData = new SiteVO();
		
		try {
			con = ds.getConnection();
			String sql = "SELECT * FROM site WHERE id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, site.getId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				resultData.setName(rs.getString("name"));
				resultData.setId(rs.getString("id"));
				resultData.setPw(rs.getString("pw"));
				resultData.setNick(rs.getString("nick"));
				resultData.setEmail(rs.getString("email"));
			}
		} catch(SQLException e) {
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
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return resultData;
	}
	
	public int siteUpdate(SiteVO site) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();
			String sql = "UPDATE site SET name=?, pw=?, nick=?, email=? WHERE id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, site.getName());
			pstmt.setString(2, site.getPw());
			pstmt.setString(3, site.getNick());
			pstmt.setString(4, site.getEmail());
			pstmt.setString(5, site.getId());
			
			pstmt.executeUpdate();
			return ID_UPDATE_SUCCESS;
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
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return ID_UPDATE_FAIL;
	}// end siteUpdate
}
