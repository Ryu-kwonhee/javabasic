import java.sql.*;
public class OjdbcConnection {

	public static void main(String[] args) {
		// MySQL과 마찬가지로 Oracle SQL 역시 .jar 파일을 제공합니다.
		// 먼저, jar파일을 import해야 연결이 되기 때문에
		// 연결부터 하겠습니다.
		// .jar 파일의 위치
		// sqldeveloper 폴더 -> jdbc폴더 -> lib폴더 -> ojdbc8.jar
		// 프로젝트에 임포트하면 Oracle SQL과 연동 가능합니다.
		
		// 프로젝트 우클릭 -> Properties -> Java Build Path ->
		// 상단 library 탭 선태ㅏㄱ -> 우측 Add Library 선택
		// 하단의 User Library -> 우측 User Libraries.. 선택
		// 이름은 OJDBC Connection으로 설정 후 
		// Add External Jar... -> ojdbc8.jar 추가
		
		Connection con = null; 
		
		try {
			// oracle SQL과 연동할 것임을 나타냄
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 접속 url도 Oracle SQL에 맞춰서 적습니다.
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			
			con = DriverManager.getConnection(url, "mytest", "mytest");
	
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
