import java.sql.*;
import java.util.Scanner;
public class JdbcDelete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 번호를 입력해주세요.");
		int del = scan.nextInt();
		Connection con = null;
		Statement st = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			st = con.createStatement();
			String sql = "DELETE FROM JDBCInsert WHERE num = "+ del;
			System.out.println(sql);
			st.executeUpdate(sql);
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}catch(SQLException e) {
			System.out.println("에러"+ e);
		}finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
