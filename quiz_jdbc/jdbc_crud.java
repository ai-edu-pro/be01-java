package quiz_jdbc;

import java.sql.*;
import java.util.Scanner;

public class jdbc_crud {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //화면 시작
        while(true) {
            System.out.println("gift db를 실행합니다.");
            menu();
            int n = sc.nextInt();
            switch (n) {
                case 1: selectAll();
                    break;
                case 2: selectByGno();
                    break;
                case 3: update();
                    break;
                case 4: delete();
                    break;
                case 5: insert();
                    break;
                case 6: System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력 입니다");
            }
        }


    }

    private static void insert() throws ClassNotFoundException, SQLException {
        //jdbc connect
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", "root", "maria");

        System.out.println("추가하고 싶은 상품의 번호, 이름, 최저가, 최고가를 차례로 입력하세요");

        String sql = "INSERT into gift values (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,sc.nextInt());
        pstmt.setString(2, sc.next());
        pstmt.setInt(3,sc.nextInt());
        pstmt.setInt(4, sc.nextInt());

        int result = pstmt.executeUpdate();

        System.out.println(result + " 개 데이터 추가 성공함");
        conn.commit();
        
        // 4. 닫기
        pstmt.close();
        conn.close();
    }

    private static void delete() throws ClassNotFoundException, SQLException {
        //jdbc connect
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", "root", "maria");

        System.out.println("삭제하고 싶은 상품의 번호를 입력하세요");

        String sql = "delete from gift where gno = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, sc.nextInt());

        int result = pstmt.executeUpdate();

        System.out.println(result + " 개 데이터 삭제 성공함");

        conn.commit();
        //4. 닫기(자원 변환)
        pstmt.close();
        conn.close();
    }

    private static void update() throws ClassNotFoundException, SQLException {
        //jdbc connect
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", "root", "maria");

        System.out.println("변경하고 싶은 상품의 번호를 입력하세요");
        int gno = sc.nextInt();
        System.out.println("변경하실 상품의 이름, 최저가, 최고가를 차례로 입력하세요");
        //사용
        String sql = "UPDATE gift SET gname = ?, g_start = ?, g_end = ? WHERE gno = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, sc.next());
        pstmt.setInt(2, sc.nextInt());
        pstmt.setInt(3, sc.nextInt());
        pstmt.setInt(4, gno);

        int result = pstmt.executeUpdate();
        System.out.println(result + " 개 데이터 업데이트 성공함");

        conn.commit();
        //자원반환
        pstmt.close();
        conn.close();
    }

    private static void selectByGno() throws ClassNotFoundException, SQLException {
        //jdbc connect
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", "root", "maria");

        //사용
        Statement stmt = conn.createStatement();
        System.out.println("원하는 상품의 번호를 입력하세요");
        ResultSet rs = stmt.executeQuery("SELECT * from gift where gno=" + sc.nextInt());

        System.out.println("상품 번호\t상품명\t최저가\t최고가");
        while(rs.next()) {
            int gno = rs.getInt(1);
            String gname = rs.getString("gname");
            int g_s = rs.getInt(3);
            int g_e = rs.getInt("g_end");

            System.out.println("  "+ gno + "\t" + gname + "\t" + g_s + "\t" +g_e);

            //4. 닫기(자원 변환)
            rs.close(); stmt.close(); conn.close();
        }
    }

    private static void selectAll() throws ClassNotFoundException, SQLException {
        //jdbc connect
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", "root", "maria");

        //사용
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from gift");

        System.out.println("상품 번호\t상품명\t최저가\t최고가");
        while (rs.next()) {
            int gno = rs.getInt(1);
            String gname = rs.getString("gname");
            int g_s = rs.getInt(3);
            int g_e = rs.getInt("g_end");

            System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);

            //4. 닫기(자원 변환)
            rs.close();
            stmt.close();
            conn.close();
        }
    }


    public static void menu() {
        System.out.println("메뉴를 골라주세요");
        System.out.println("1. select all");
        System.out.println("2. select by gno");
        System.out.println("3. update ");
        System.out.println("4. delete ");
        System.out.println("5. insert ");
        System.out.println("6. exit ");
    }
}