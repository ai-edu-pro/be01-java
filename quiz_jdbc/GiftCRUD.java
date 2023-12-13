package quiz_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftCRUD {
	static Connection conn;
	static Scanner sc = new Scanner(System.in);

	// 연결 메소드
	public static void connectSQL(String url, String uid, String pwd) throws ClassNotFoundException, SQLException {

		// 1. Driver load...... exception
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success!!!");

		// 2. Connection & Open
		// driver:IP:portNumber/DBName
//		url = url.length() == 0 ? "jdbc:mariadb://localhost:3306/encore" : url;
		url = url.length() == 0 ? "jdbc:mariadb://localhost:3306/sampledb" : url;
		uid = uid.length() == 0 ? "root" : uid;
		pwd = pwd.length() == 0 ? "maria" : pwd;

		conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!!!");

	}

	// selectAll()
	public static void selectAll() throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");

		System.out.printf("%10s%10s%10s%10s\n", "상품번호", "상품명", "최저가", "최고가");
		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString(2);
			int g_start = rs.getInt(3);
			int g_end = rs.getInt("g_end");
			System.out.printf("%10d%10s%10d%10d\n", gno, gname, g_start, g_end);
		}

		rs.close();
		stmt.close();
	}

	// selectByGno(int gno)
	public static void selectByGno(int gno) throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT WHERE gno = " + gno);

		System.out.printf("%10s%10s%10s%10s\n", "상품번호", "상품명", "최저가", "최고가");
		while (rs.next()) {
			String gname = rs.getString(2);
			int g_start = rs.getInt(3);
			int g_end = rs.getInt("g_end");
			System.out.printf("%10d%10s%10d%10d\n", gno, gname, g_start, g_end);
		}

		rs.close();
		stmt.close();
	}

	// update(int gno)
	public static void updateByGno(int gno) throws SQLException {
		System.out.println("Gift Table data update : 상품번호 = " + gno);
		// UPDATE GIFT SET gname = 'bb', g_start = 90, g_end = 900 WHERE gno = 11;
		String sql = "UPDATE GIFT SET gname = ?, g_start = ?, g_end = ? WHERE gno = " + gno;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.println("상품명/최저가/최고가");
		pstmt.setString(1, sc.next());
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());

		int result = pstmt.executeUpdate();
		pstmt.close();
		System.out.println(result + " 개 데이터 수정 성공");
	}

	// delete(int gno)
	public static void deleteByGno(int gno) throws SQLException {
		System.out.println("Gift Table data delete : 상품번호 = " + gno);
		String sql = "DELETE FROM GIFT WHERE gno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, gno);

		int result = pstmt.executeUpdate();
		pstmt.close();
		System.out.println(result + " 개 데이터 삭제 성공");
	}

	// insert()
	public static void insert() throws SQLException {
		System.out.println("Gift Table data input : 상품번호/상품명/최저가/최고가");
		String sql = "INSERT INTO GIFT VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.next());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());

		int result = pstmt.executeUpdate();
		pstmt.close();
		System.out.println(result + " 개 데이터 추가 성공");

	}

	// exit()
	public static void exit() throws SQLException {
		System.out.print("저장하시겠습니까? (y/n) : ");
		char ch = sc.next().charAt(0);
		do {
			if (ch == 'y') {
				conn.commit();
			} else if (ch != 'n') {
				System.out.println("잘못된 입력입니다.\n");

				System.out.print("저장하시겠습니까? (y/n) : ");
				ch = sc.next().charAt(0);
}
		} while (ch != 'y' && ch != 'n');
		conn.close();
		System.out.println("종료합니다.");
		System.exit(0);
	}

	// menu()
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		connectSQL("", "", "");
		System.out.println("\n\n환영합니다!\n\n");
		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 전체 출력");
			System.out.println("2. 선택 출력");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 삽입");
			System.out.println("6. 종료");
			System.out.print("입력 : ");
			char ch = sc.next().charAt(0);
			switch (ch) {
			case '1':
				selectAll();
				break;
			case '2':
				System.out.print("번호 : ");
				selectByGno(sc.nextInt());
				break;
			case '3':
				System.out.print("번호 : ");
				updateByGno(sc.nextInt());
				break;
			case '4':
				System.out.print("번호 : ");
				deleteByGno(sc.nextInt());
				break;
			case '5':
				insert();
				break;
			case '6':
				exit();
				break;
			default:
				System.out.println("\n잘못된 입력입니다.\n");
				break;
			}
		}
	}
}