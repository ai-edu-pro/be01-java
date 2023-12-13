package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftCRUD {
	
	static Scanner sc = new Scanner(System.in);
	static Connection conn;

	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		menu();
	}
	
	// 연결 메소드
	public static void connection() throws ClassNotFoundException, SQLException {
		System.out.println("로딩중....");
		Class.forName("org.mariadb.jdbc.Driver"); // exception
		String url = "jdbc:mariadb://localhost:3306/sampledb";
		String uid = "root";
		String pwd = "maria";
		conn = DriverManager.getConnection(url, uid, pwd);// exception
	}

	
//	SELECT * FROM gift;
	// selectAll()   
	public static void selectAll() throws ClassNotFoundException, SQLException {

		connection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");// cmd+shift+x :대문자
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString(2);
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		} // while end
		
		conn.commit();
		//rs.close();		stmt.close();		conn.close();
	}

	
//	SELECT * FROM gift WHERE gno=1;
	// selectByGno(int gno)  <----
	public static void selectByGno(int gno) throws ClassNotFoundException, SQLException {

		connection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT WHERE GNO=" + gno);

		// 3.사용(DML-Select)
		System.out.println("해당 " + gno + "번 정보는 다음과 같습니다.");
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			int gn = rs.getInt(1);
			String gname = rs.getString(2);
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);

			System.out.println(gn + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		conn.commit();
		// 4.닫기(자원반환)
		//rs.close();		stmt.close();		conn.close();
	}

	
	// update(int gno)
	public static void UpdateByGno(int gno) throws ClassNotFoundException, SQLException {
		connection();

		// 3.사용(DML-Select)
		// UPDATE GIFT SET GNO/GNAME/G_START/G_END=1 WHERE GNO=10;
		System.out.println("수정할 조건을 번호로 입력하세요 : 1.번호/2.상품이름/3.최저가/4.최고가");
		String option, value, sql;
		int su = sc.nextInt();
		
		switch ( su ) {    // switch (sc.nextInt()) {
			case 1:
				option = "GNO";
				System.out.println("gno ? : ");
				value = sc.next();
				break;
			case 2:
				option = "GNAME";
				System.out.println("gname ? : ");
				value = sc.next();
				break;
			case 3:
				option = "G_START";
				System.out.println("start ? : ");
				value = sc.next();
				break;
			case 4:
				option = "G_END";
				System.out.println("end ? : ");
				value = sc.next();
				break;
			default:
				System.out.println("input error!! ");
				return;
		}
		
		if(su == 2) {
			sql = "UPDATE GIFT SET " + option + " = '" + value + "' WHERE gno = " + gno;
		} else {
			sql = "UPDATE GIFT SET " + option + " = " + value + " WHERE gno = " + gno;
		}
		
		System.out.println(sql.toString());
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.executeUpdate();
		
		conn.commit();
		// 4.닫기(자원반환)
		//stmt.close();		conn.close();
	}
	
	// delete(int gno)
	public static void deleteByGno() throws ClassNotFoundException, SQLException {
		connection();
		
		System.out.println("상품번호를 입력해주세요.");
		int gno = sc.nextInt();
		Statement stmt = conn.createStatement();
		String sql = "DELETE FROM gift WHERE gno =  " + gno ;
			
		System.out.println(sql.toString());  // qurey문 출력하기
		ResultSet rs = stmt.executeQuery(sql);

		System.out.println(gno + "번 삭제");
		conn.commit();
	}
	
	// insert()
	public static void insertByGno(int gno) throws ClassNotFoundException, SQLException {
		connection();

		// 3.사용(DML-Insert)
		String sql = "INSERT INTO GIFT VALUES(" + gno + ",?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.println("상품명 / 최저가 / 최고가 를 입력하세요.");
		pstmt.setString(1, sc.next());  
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());
		pstmt.executeUpdate();
		
		conn.commit();
		System.out.println("추가 완료!!!");
		// 4.닫기(자원반환)
		//pstmt.close();		conn.close();
	}
	
	// menu()  <---- 
	public static void menu() throws ClassNotFoundException, SQLException {
		while (true) {
			System.out.println("0.전체조회 1.선택조회 2.추가 3.수정 4.삭제 5.exit ");
			switch (sc.nextInt()) {
					case 0:
						// 0.전체조회
						selectAll();
						break;
					case 1:
						// 1.조회
						System.out.println("조회하고 싶은 상품번호를 입력하세요.");
						selectByGno(sc.nextInt());
						break;
					case 2:
						// 2.추가
						System.out.println("추가하고 싶은 상품번호를 입력하세요.");
						insertByGno(sc.nextInt());
						selectAll();
						break;
					case 3:
						// 3.수정
						System.out.println("수정하고 싶은 상품번호를 입력하세요.");
						UpdateByGno(sc.nextInt());
						break;
					case 4:
						// 4.삭제
						System.out.println();
						deleteByGno();
						break;
					case 5:
						System.out.println("프로그램 종료!!");
						conn.close();  // 
						System.exit(0);
					default:
						System.out.println("없는 번호 입니다. 선택 확인해주세요. ");
						continue;
			} // end switch
		} // end while
	}
	
}
