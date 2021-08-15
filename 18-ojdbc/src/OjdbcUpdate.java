import java.sql.*;
import java.util.Scanner;
public class OjdbcUpdate {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 번호를 입력하세요.");
		int num = scan.nextInt();
		System.out.println("수정할 단어를 입력하세요.");
		String string = scan.next();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");
			String sql = "UPDATE test SET str = ? WHERE num = ?";
			pst = con.prepareStatement(sql);
			
			pst.setString(num, string);
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