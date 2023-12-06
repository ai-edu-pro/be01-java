package quiz.mapEx02;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\n\n*-*-*-*-* 메뉴 *-*-*-*-*");
        System.out.println("1. 비디오 추가");
        System.out.println("2. 비디오 삭제");
        System.out.println("3. 전체 비디오 리스트 출력");
        System.out.println("4. 비디오 정보 수정");
        System.out.println("5. 대여");
        System.out.println("6. 반납");
        System.out.println("7. 프로그램 종료");
        System.out.println("----------------------");
        System.out.print(" >> ");
    }

    public static void pause() {
        try {
            System.in.read();
        } catch (IOException e) { }
    }
    public static void main(String[] args) {
        Video_manager vm = new Video_manager();
        Scanner sc = new Scanner(System.in);
        int vnum = 1;
        String s;

        while(true) {
            menu();
            int n = sc.nextInt();

            switch (n) {
                case 1: vm.VideoAdd(vnum);
                    vnum++;
                    System.out.println("비디오 추가 완료");
                    System.out.print("계속 하려면 Enter 키를 눌러 주세요");
//                    pause(); // '중지'시키기
                    break;

                case 2: vm.VideoDelete();
                    System.out.println("비디오 삭제 완료");
                    System.out.println("계속 하려면 Enter 키를 눌러 주세요");
//                    pause();
                    break;

                case 3: vm.VideoShowAll();
                    System.out.println("계속 하려면 Enter 키를 눌러 주세요");
//                    pause();
                    break;

                case 4: vm.VideoMod();
                    System.out.println("계속 하려면 Enter 키를 눌러 주세요");
                    pause();
                    break;

                case 5: vm.Lend();
                    System.out.println("계속 하려면 Enter 키를 눌러 주세요");
                    pause();
                    break;

                case 6 : vm.Return();
                    System.out.println("계속 하려면 Enter 키를 눌러 주세요");
                    pause();
                    break;

                case 7:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);

            }

        }
    }
}
