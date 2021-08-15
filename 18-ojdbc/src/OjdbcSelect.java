import java.sql.*;
public class OjdbcSelect {
	public static void main(String[] args) {
		// Oracle SQL과 연동해서 
		// Employees 테이블의 모든 인원에 대한 정보를 콘솔창에 띄워주세요.
		// SELECT * FROM employees;
		// 에 대한 결과물을 콘솔창에 띄워주세요.
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "hr", "hr");
			st = con.createStatement();
			String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, JOB_ID, SALARY FROM employees";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int emp_id = rs.getInt("EMPLOYEE_ID");
				String fName = rs.getString("FIRST_NAME");
				Date hDate = rs.getDate("HIRE_DATE");
				String job = rs.getString("JOB_ID");
				int sal = rs.getInt("SALARY");
				System.out.println("아이디 : "+ emp_id + ", 성 : "+ fName + ", 입사일 : "+ hDate + 
						", 직무명 : "+ job + ", 연봉 : "+ sal);
			}
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}catch(SQLException e) {
			System.out.println("에러"+e);
		}finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
