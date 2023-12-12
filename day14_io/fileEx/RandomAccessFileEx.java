package day14_io.fileEx;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) 
						throws FileNotFoundException, IOException {
		
		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
//		RandomAccessFile raf = new RandomAccessFile("c:\\dell\\sawon.txt", "r");
		
		for (int i = 0; i <= 50; i++) {
			
//			raf.seek(i * 100); 
			raf.seek(i * 200);  //
			String str = "hello";
			raf.writeUTF(str + i);
//			raf.writeInt(i);
			
		}
		
		for (int i = 0; i <= 50; i++) {
//			raf.seek(i * 100);  //
			raf.seek(i * 200);
//			System.out.println(raf.readInt());
			System.out.println(raf.readUTF());
		}
		
		System.out.println("string print success!!");
		raf.close();
	}
}
