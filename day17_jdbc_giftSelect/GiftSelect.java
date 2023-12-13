package day17_jdbc_giftSelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {  // select 
	public static void main(String[] args) 
					throws ClassNotFoundException,SQLException {
		
		//1. Driver load..... exception
		Class.forName("org.mariadb.jdbc.Driver");  //
		
		//2. Connection & Open
					//driver://IP:portNmber/DBName
		Connection conn = DriverManager.getConnection(
							"jdbc:mariadb://localhost:3306/sampledb", 
							"root", "maria"); //
		
		//3. 사용 ( DML - Select ) 
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");  // executeQuery() : 반환값 있는경우
		
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while( rs.next() ) {
			int gno = rs.getInt(1);  // 인덱스 , int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno+"\t"+gname+"\t"+g_s+"\t"+g_e);
			
		}
		conn.commit();
		//4. 닫기 ( 자원 반환 )
		rs.close();		stmt.close();		conn.close();
	}
}

// SQL Query 구문, HTML Tag 는 자바에서 문자열 취급함.








