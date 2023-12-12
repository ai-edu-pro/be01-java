package day17_jdbc_jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) 
						throws ClassNotFoundException, SQLException {  // 예외처리 위임
		
		//1. Driver load..... exception
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success!!!");
		
		//2. Connection & Open
					//driver:IP:portNmber/DBName
		String url="jdbc:mariadb://localhost:3306/sampledb";
		String uid = "root";
		String pwd = "1004";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!!");
		
		//3. 사용 ( DML 명령어 )
		
		//4. 닫기 ( 자원 반환 )
	}
}
