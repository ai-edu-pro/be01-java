package quiz.Interface.ex02;

import java.util.Scanner;

public class MainEntry {
	 
    public static void main(String[] args) {
    	
        Trans[] ts = new Trans[2];
        Scanner sc = new Scanner(System.in);
        
        ts[0] = new Bus();
        ts[1] = new Air();
        
        System.out.println("이동 수단을 선택 해주세요.");
        System.out.println("[ 1: 버스 2:비행기 ]");
        int nIndex = sc.nextInt();
        
        do{
            if(nIndex <= 0 || nIndex > 2)
            {
                System.out.println("다시 입력 해주세요");
                System.out.println("[ 1: 버스 2:비행기 ]");
                nIndex = sc.nextInt();
                continue;
            }
            ts[nIndex-1].Proc();
            System.out.println("계속 이동 하시겠습니까?(Y/N)");
            String str = sc.next();
            if(str.equals("N")||str.equals("n"))
            {
                System.out.println("끝");
                break;
            }
            else
            {
                System.out.println("이동 수단을 선택 해주세요.");
                System.out.println("[ 1: 버스 2:비행기 ]");
                nIndex = sc.nextInt();
                continue;
            }
            
        } while(true);
        
    }
 
}
