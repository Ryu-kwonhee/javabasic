
public class ParseInt001 {
	public static void main(String[] args) {
		/*
		 * parseInt는 문자열을 정수로 치환할 수 있다.
		 * 형식 : Integer.parseInt();
		 */
		String str = "2021";
		
		int year = Integer.parseInt(str);
		System.out.println(year + 1);
	}

}
