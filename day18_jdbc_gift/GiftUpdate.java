package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("org.mariadb.jdbc.Driver"); //

		Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/sampledb", "root", "maria"); //

		// 3. 사용 ( DML - Update ) -  PreparedStatement
		System.out.println("Gift Table update number :(상품명/최저가/최고가/GNO ) = ");
		//UPDATE gift SET gname='bb', g_start=90, g_end=900 WHERE gno = 11;
		String sql = "UPDATE GIFT SET  GNAME = ?, G_START=?, G_END=? WHERE GNO = ?";
		PreparedStatement  pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, sc.next());
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
			
		int result = pstmt.executeUpdate(); // 반환값이 없는 경우 - insert, update, delete
		
		System.out.println(result + " 개 데이터 수정 성공함.");
		conn.commit();  // 커밋 완료
		
		// 4. 닫기 (자원반환)
		pstmt.close();		conn.close();
	}
}
