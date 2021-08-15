import java.sql.*;
public class Jdbcpra {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/employees";
			con = DriverManager.getConnection(url, "root", "mysql");
			st = con.createStatement();
			String sql = "SELECT emp_no FROM employees LIMIT 10";
			rs = st.executeQuery(sql);
			rs.next();
			System.out.println(rs.getInt("emp_no"));
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}catch (SQLException e) {
			System.out.println("에러"+ e);
		}finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
