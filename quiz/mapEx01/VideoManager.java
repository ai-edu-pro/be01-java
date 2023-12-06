package quiz.mapEx01;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class VideoManager {  // Controller
	
	private static int number = 1;  // 추가된 레코드 수 카운트할 변수
	private HashMap<Integer, Video> map = new HashMap<>();
	private Scanner sc = new Scanner(System.in);
	
	public void addVideo() {
		System.out.print("제목 입력 : ");
		String title = sc.next();
		System.out.print("장르 입력 : ");
		String category = sc.next();
		Video v = new Video(title, category);
		map.put(number++, v);
		System.out.println("추가되었습니다.");
	}
	
	public void delVideo() {
		
		System.out.print("제목 입력 : ");
		String title = sc.next();
		boolean flag = false;
		
		for(Integer i : map.keySet()) {
			if(map.get(i).getTitle().equals(title)) {
				map.remove(i);
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("삭제되었습니다.");
		}
		else {
			System.out.println("없는 제목입니다.");			
		}
	}
	public void editVideo() {
		
		System.out.print("제목 입력 : ");
		
		String title = sc.next();
		boolean flag = false;
		int num = -1;
		
		for(Integer i : map.keySet()) {
			if(map.get(i).getTitle().equals(title)) {
				flag = true;
				num = i;
				break;
			}
		}
		if(flag) {
			System.out.print("제목 입력 : ");
			title = sc.next();
			System.out.print("장르 입력 : ");
			String category = sc.next();
			map.get(num).setTitle(title);
			map.get(num).setCategory(category);
			System.out.println("변경되었습니다.");						
		}
		else {
			System.out.println("없는 제목입니다.");			
		}		
	}
	public void rentVideo() {
		
		System.out.print("제목 입력 : ");
		String title = sc.next();
		boolean flag = false;
		int num = -1;
		
		for(Integer i : map.keySet()) {
			if(map.get(i).getTitle().equals(title)) {
				if(!map.get(i).isLend()) {
					flag = true;
					num = i;
					break;					
				}
				else {
					System.out.println("이미 대여중입니다.");
					return;
				}
			}
		}
		if(flag) {
			System.out.print("대여자 입력 : ");
			String name = sc.next();
			map.get(num).setLendName(name);
			map.get(num).setLendDate(new Date());
			map.get(num).setLend(true);			
			System.out.print("대여되었습니다.");
		}
		else {
			System.out.println("없는 제목입니다.");			
		}	
	}
	public void returnVideo() {
		
		System.out.print("제목 입력 : ");
		String title = sc.next();
		boolean flag = false;
		int num = -1;
		for(Integer i : map.keySet()) {
			if(map.get(i).getTitle().equals(title)) {
				flag = true;
					num = i;
					break;					
			}
		}
		if(flag) {
			map.get(num).setLendName("");
			map.get(num).setLendDate(new Date());
			map.get(num).setLend(false);	
			System.out.print("반납하였습니다.");
		}
		else {
			System.out.println("없는 제목입니다.");			
		}	
	}
	public void printVideo() {
		for(Integer i : map.keySet()) {
			System.out.println("============================");
			System.out.println("제목 : " + map.get(i).getTitle());
			System.out.println("장르 : " + map.get(i).getCategory());
			System.out.println("대여여부 : " + map.get(i).isLend());
			System.out.println("대여자 : " + map.get(i).getLendName());
			System.out.println("대여일자 : " + map.get(i).getLendDate());
			System.out.println("비디오번호 : " + i);
			System.out.println("============================");
		}
	}
	
}
