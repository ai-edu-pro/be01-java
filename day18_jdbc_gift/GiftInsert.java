package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws Exception {
		
		Class.forName("org.mariadb.jdbc.Driver"); //

		Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/sampledb", "root", "maria"); //

		// 3. 사용 ( DML - Insert ) - Statement / PreparedStatement
		Statement stmt = conn.createStatement();
		// INSERT INTO gift VALUES(11,'스팸', 800, 1200)
//		String sql = "INSERT INTO gift VALUES(12,'스팸2', 900, 1300)";  // 직접 넣기
		String sql = "INSERT INTO gift VALUES("+args[0]+",'"+args[1]+"', "+args[2]+","+ args[3]+")";
		System.out.println(sql);  // 출력확인
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result + " 개 데이터 추가 성공함.");
		conn.commit();  // 커밋 완료
		
		// 4. 닫기 (자원반환)
		stmt.close();		conn.close();
	}
}
