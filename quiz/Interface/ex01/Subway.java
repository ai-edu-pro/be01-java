package quiz.Interface.ex01;

import java.util.Scanner;

public class Subway implements Tran {
	 
    Scanner sc = new Scanner(System.in);
    @Override
    public void Move() {
        
        System.out.println("지하철이 출발합니다.");
        System.out.print("속도를 정하세요 = ");
        int s = sc.nextInt();
        System.out.println((accelerater * s*10) + "속도로 달리는중입니다.");
 
    }
 
    @Override
    public void Stop() {
        System.out.println("지하철이 정지합니다.");
        System.out.println((accelerater * 0) + "속도로 정지 하였습니다.");
 
    }
 
}
