package quiz.Interface.ex01;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Tran b = new Bus();
        Subway s = new Subway();
        Tran p = new Plain();
        
        do {
	        System.out.println("************** 교 통 수 단 *************");
	        System.out.println(" 1. 버스   2. 지하철   3. 비행기   4. 종료");
	        System.out.println("****************************************");
	        System.out.println("");
	        System.out.print("원하시는 교통수단을 번호로 고르세요 = ");
	        int vi = sc.nextInt();
	        
	        if(vi == 1) {
	            b.Move();
	            b.Stop();
	        } 
	        else if ( vi == 2) {
	            s.Move();
	            s.Stop();
	        }
	        else if ( vi == 3) {
	            p.Move();
	            p.Stop();
	        }
	        else if (vi == 4) {
	            break;
	        }
	        
	      } while(true);
        
        System.out.println("이용해 주셔서 감사합니다!");
    }
 
}
