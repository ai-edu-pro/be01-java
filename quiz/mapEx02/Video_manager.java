package quiz.mapEx02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Video_manager extends Video{
    Map<Integer, Video> map = new TreeMap<>();

    public Video_manager() {};

    public void VideoAdd(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("비디오 이름을 입력 하세요");
        title = sc.next();
        System.out.println("카테고리를 입력 하세요");
        category = sc.next();

        Video v = new Video(title, category);
        map.put(num, v);
    }


    public void VideoDelete() {
        Scanner sc = new Scanner(System.in);
        VideoShowAll();
        System.out.println("삭제하려는 비디오의 번호를 입력하세요");
        map.remove(sc.nextInt());
    }

    public void VideoShowAll() {
        Set<Map.Entry<Integer, Video>> set = map.entrySet();

        for (Map.Entry<Integer, Video> e : set) {
            System.out.print(e.getKey() + " ] 제목 : " + e.getValue().getTitle() + " 장르 : " + e.getValue().category +
                    " 대여 여부 : " + ((e.getValue().getLend())? "O" : "X") );
            if(e.getValue().getLend()) {
                System.out.print(" 대여자 : " + e.getValue().getLendName() + " 대여 날짜 : " + e.getValue().getLendDate() + "\n");
            }
            else System.out.println();
        }
    }


    public void VideoMod() {
        Scanner sc = new Scanner(System.in);
        VideoShowAll();
        System.out.println("수정하실 비디오의 번호를 입력 하세요");
        VideoAdd(sc.nextInt());
    }

    public void Lend() {
        Scanner sc= new Scanner(System.in);
        VideoShowAll();
        System.out.println("대여할 비디오의 번호를 입력 하세요");
        int n = sc.nextInt();
        if(map.containsKey(n)) {
            map.get(n).setLend(true);
            System.out.println("대여자의 이름을 입력하세요");
            map.get(n).setLendName(sc.next());

            // 현재 날짜 구하기
            LocalDate now = LocalDate.now();
            // 포맷 정의
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            // 포맷 적용
            String formatedNow = now.format(formatter);

            map.get(n).setLendDate(formatedNow);
        } else System.out.println("비디오가 존재하지 않습니다.");
    }

    public void Return() {
        VideoShowAll();
        System.out.println("반납할 비디오 번호를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map.get(n).setLend(false);
        map.get(n).setLendName(null);
        map.get(n).setLendDate(null);
    }
}
