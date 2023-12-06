package quiz.mapEx04;

import java.util.Scanner;

public class MainEntry {  // view
	
    public static void main(String[] args) {
    	
        VideoManager manager = new VideoManager();
        Scanner sc = new Scanner(System.in);
        
//        System.out.println(LocalDate.now()); //

        while(true){
            menu();
            System.out.println();
            switch (sc.nextInt()){
                case 1:
                    System.out.println("input video title");
                    String title = sc.next();
                    System.out.println("input video category");
                    String category = sc.next();
                    manager.addVideo(title,category);
                    break;
                case 2:
                    System.out.println("input video title to delete: ");
                    String deltitle = sc.next();
                    manager.delVideo(deltitle);
                    break;
                case 3:
                    manager.printList();
                    break;
                case 4:
                    System.out.println("수정하려는 비디오 타이틀 제목을 입력하세요");
                    String modtitle = sc.nextLine().trim();
                    manager.modVideo(modtitle);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
               
            }
        }

    }
    public static void menu(){
        System.out.println("메뉴를 선택하여주세요: ");
        System.out.println("1: 추가 2: 삭제 3: 비디오 목록 열람 4: 수정 5: 프로그램 종료 ");    
    }
}

/**
 * 비디오 클래스
 * 타이틀 비디오제목
 * 카테고리 장르
 * 렌드 대여여부
 * 대여자
 * 대여일자(오늘 날짜)
 *
 * 비디오 추가/삭제/비디오 리스트 출력/수정/프로그램 종료
 */