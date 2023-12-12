package day14_io.object;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("grade.dat");
		ObjectInputStream  ois = new ObjectInputStream(is);
		
		Grade dto =  (Grade)ois.readObject();
		System.out.println("result output : " + dto);
		ois.close();
	}
}
