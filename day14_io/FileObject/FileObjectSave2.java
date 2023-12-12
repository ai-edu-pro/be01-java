package day14_io.FileObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class FileObjectSave2 {
	public static void main(String[] args) throws IOException {
		// 이름 직급 부서
		String name = null;
		String position = null;
		String part = null;
		boolean con = true;

		/*
		 * FileObjectSave 파일은 수업시간에 한 내용과 대부분 동일합니다. 계속 입력할지 알려주는 boolean변수 con을
		 * 통해 연속 입력을 받습니다.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = null;
		File f = new File("emp.txt");
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(f, true); // append mode
			oos = new ObjectOutputStream(fos);

			while (con) {
				System.out.println("----------------회원 정보 입력 하기 ----------------------");
				System.out.print("이름 >> ");
				name = br.readLine();
				System.out.print("직급 >> ");
				position = br.readLine();
				System.out.print("부서 >> ");
				part = br.readLine();

				oos.writeObject(name);
				oos.writeObject(position);
				oos.writeObject(part);

				System.out.print("More Input? Y or N >> ");

				if (br.readLine().equalsIgnoreCase("N")) {
					con = false;
				}

			} // while end

			System.out.println("emp.txt  save!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
//			fos.close();
		} // try end
	}
}
