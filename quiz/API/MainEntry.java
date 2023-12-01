package quiz.API;

public class MainEntry {
	public static void main(String[] args) {
		String str = "abcDEFGHeijwEIMPYmnqr";
		// 위의 str 문자열을 대문자는 소문자로 소문자는 대문자로 출력하기
		String result = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				result += String.valueOf(ch).toLowerCase();
			} else if (ch >= 'a' && ch <= 'z') {
				result += String.valueOf(ch).toUpperCase();
			} else {
				result += ch;
			} // if end
		} // for end

		System.out.println(result);

		System.out.println("===============================");
		String[] s = str.split("");

		for (int i = 0; i < str.length(); i++) {
			if (s[i].charAt(0) >= 97) {  // a=97 ~ z = 122 ,  A=65 ~ Z= 90
				System.out.println(s[i].toUpperCase());
			} else {
				System.out.println(s[i].toLowerCase());
			}
		}
		
		System.out.println("===============================");
		String str2 = "";
		char ch;

		for(int i = 0; i < str.length(); i++) {
			
			ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				str2 += (char)(ch + 'A' - 'a');
			}
			else
				str2 += (char)(ch - 'A' + 'a');		
		}
		System.out.println(str2);
	}
}






