import java.sql.*;
import java.util.Scanner;
public class JdbcUpdate {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("바꿀 단어를 입력해주세요.");
		String string = scan.next();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			st = con.createStatement();
			String sql = "UPDATE JDBCInsert SET "+"str = "+ "'" + string + "'";
			st.executeUpdate(sql);
			System.out.println(sql);
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
