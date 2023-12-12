package day14_io.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {  // 예외처리 위임
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("yuna.jpg");
		
		// 쓰기 객체 - FileOutputStream
//		OutputStream  os = new FileOutputStream("C:/Dell/kim2.jpg");
		OutputStream  os = new FileOutputStream("kim1.jpg");
		
		long start = System.currentTimeMillis(); 
		
		while( true ) {
			int inputData = is.read(); 
			if( inputData == -1 ) break;  // 
			os.write(inputData);
		} // while end
		
		long end = System.currentTimeMillis();  
		
		System.out.println(end - start); //복사(작업)에 걸린 시간 
		is.close();
		os.close();
		System.out.println("copy success!!");
	}
}







