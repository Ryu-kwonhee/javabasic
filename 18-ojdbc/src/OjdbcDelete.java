import java.sql.*;
import java.util.Scanner;
public class OjdbcDelete {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 번호를 입력하세요.");
		int num = scan.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");
			String sql = "DELETE FROM test WHERE num = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(num, num);
			pst.executeUpdate();
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}catch(SQLException e) {
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