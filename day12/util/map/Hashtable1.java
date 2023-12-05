package day12.util.map;
import java.util.Hashtable;
import java.util.Enumeration;
class Hashtable1  {
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();  // Hashtable 
		
		ht.put("1","가위");
		ht.put("2","바위");
		ht.put("3","보");
		if(ht.containsKey("1"))
			System.out.println("가위 포함되어 있음");
		if(ht.containsValue("보"))
			System.out.println("보는 3번으로 포함되어 있음");
		System.out.println("총 개수는"+ht.size()+" 입니다.");
		ht.remove("1");
		Enumeration enu = ht.keys();
		while(enu.hasMoreElements()){
			Object key = enu.nextElement();
			Object value = ht.get(key);
			System.out.println("키 = "+key+"값 "+value);
		}
	}
}
