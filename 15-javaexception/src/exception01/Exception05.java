package exception01;

public class Exception05 {
	public static void main(String[] args) {
		/*
		 * 예외 발쌩 케이스 5.
		 * 숫자베이스가 아닌 문자를 숫자로 바꾸려고 할 떄 에러 발생
		 */
		String a= "123qwe";
		int result = Integer.parseInt(a);
		System.out.println(result);
	}
}