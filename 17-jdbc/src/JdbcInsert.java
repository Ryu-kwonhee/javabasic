import java.sql.*;
import java.util.Scanner;
public class JdbcInsert {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int n = scan.nextInt();
		System.out.println("자료를 입력해주세요.");
		String s = scan.next(); 
		Connection con = null;
		Statement st = null;
		// resultSet은 SELECT구문에 대한 결과만 처리합니다. 이외 구무에는 불필요.
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			st = con.createStatement();
			// 쿼리문이 길다면 아래와 같이 + 로 여러줄로 나눠 연결합니다.
			String sql = "INSERT INTO JDBCInsert (num, str) "+ 
			"VALUES "+ "("+ n +", "+"'"+s+"'"+")";
			System.out.println(sql);
			
			// SELECT문은 executeQuery(sql구문); 형식으로 호출하지만
			// 이외 구문은 exexuteUpdate(sql구문);으로 호출합니다.
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
