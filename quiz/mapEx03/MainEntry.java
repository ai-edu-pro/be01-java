package quiz.mapEx03;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		VideoManager vm = new VideoManager();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("비디오 대여 관리 프로그램");
		
		oper: while (true) {
			System.out.print(
					"******************************************\n" + "삽입: insert <제목> <카테고리>\n" + "삭제: delete <ID>\n"
							+ "수정: update <ID> <제목> <카테고리>\n" + "대여: lend <ID> <대여자>\n" + "반납: receive <ID>\n"
							+ "출력: show\n" + "종료: exit\n" + "******************************************\n" + ">");
			String[] oprs = sc.nextLine().split("\\s+");
			
			switch (oprs[0]) {
				case "insert":
					if (oprs.length == 3) {
						String title = oprs[1];
						String cat = oprs[2];
						vm.insert(title, cat);
					} else {
						System.out.println("insert <제목> <카테고리> 형식으로 입력하십시오.");
					}
					break;
				case "delete":
					if (oprs.length == 2) {
						try {
							int id = Integer.parseInt(oprs[1]);
							if (!vm.delete(id))
								System.out.println("삭제 실패, 해당 ID가 없습니다.");
						} catch (NumberFormatException ex) {
							System.out.println("ID를 숫자형으로 입력하십시오.");
						}
					} else {
						System.out.println("delete <ID> 형식으로 입력하십시오.");
					}
					break;
				case "show":
					if (oprs.length == 1) {
						vm.show();
					} else {
						System.out.println("show는 파라미터가 필요 없습니다.");
					}
					break;
				case "update":
					if (oprs.length == 4) {
						try {
							int id = Integer.parseInt(oprs[1]);
							String title = oprs[2];
							String cat = oprs[3];
							if (!vm.update(id, title, cat))
								System.out.println("갱신 실패, 해당 ID가 없습니다.");
						} catch (NumberFormatException ex) {
							System.out.println("ID를 숫자형으로 입력하십시오.");
						}
					} else {
						System.out.println("update <ID> <제목> <카테로리> 형식으로 입력하십시오.");
					}
					break;
				case "lend":
					if (oprs.length == 3) {
						try {
							int id = Integer.parseInt(oprs[1]);
							String name = oprs[2];
							if (!vm.lend(id, name))
								System.out.println("대여 실패, 해당 ID가 없거나 대여중입니다.");
						} catch (NumberFormatException ex) {
							System.out.println("ID를 숫자형으로 입력하십시오.");
						}
					} else {
						System.out.println("lend <ID> <대여자> 형식으로 입력하십시오.");
					}
					break;
				case "receive":
					if (oprs.length == 2) {
						try {
							int id = Integer.parseInt(oprs[1]);
							if (!vm.receive(id))
								System.out.println("반납 실패, 해당 ID가 없거나 이미 반납한 상태입니다.");
						} catch (NumberFormatException ex) {
							System.out.println("ID를 숫자형으로 입력하십시오.");
						}
					} else {
						System.out.println("receive <ID>형식으로 입력하십시오.");
					}
					break;
				case "exit":
					if (oprs.length == 1) {
						break oper;
					} else {
						System.out.println("exit는 파라미터가 필요 없습니다.");
					}
					break;
				} // end switch
		} // end while
		sc.close();
	}
}
