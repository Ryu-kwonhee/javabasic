package date210623.method;

public class MethodBonus002 {
	
	// void가 아닌 리턴 자료형을 가지는 메서드도
	// return구문 실행시 종료됩니다.
	public static int getInt() {
		System.out.println("인트 발송 전");
		if ( 3 < 5) {
			return 1;
		}
		System.out.println("인트 발송 후");
		return 0;
	}
	
	public static void main(String[] args) {
		// 리턴된 숫자를 출력하는 첫번째 방법
		int result = getInt();
		System.out.println(result);
		System.out.println(getInt());
		getInt();
	}
}
