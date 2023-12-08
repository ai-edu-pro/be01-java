package quiz.IO.bmiFour;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    		throws IOException, ClassNotFoundException {  // View

        Scanner sc = new Scanner(System.in);

        BmiRepository bmiRepository = new BmiRepository();

        char input = ' ';
        while(input != 'q'){
            System.out.println("==== BMI 조회 프로그램 ====");
            System.out.println("1: 추가 / 2: 삭제 / 3:전체 출력 / 4: 수정 / 5: 파일 저장 / 6: 파일 정보 조회 / q: 종료");
            input = sc.next().charAt(0);

            switch (input){
                case '1' :
                    bmiRepository.add();
                    break;
                case '2' :
                    bmiRepository.del();
                    break;
                case '3' :
                    bmiRepository.print();
                    break;
                case '4' :
                    bmiRepository.edit();
                    break;
                case '5' :
                    bmiRepository.printTxt();
                    break;
                case '6' :
                    bmiRepository.readTxt();
                    break;
                case 'q' :
                    break;
                default:
                    System.out.println("입력이 잘못 되었습니다.\n");
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
