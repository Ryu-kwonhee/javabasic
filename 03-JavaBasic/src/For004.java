
public class For004 {
	public static void main(String[] args) {
		/*
		 * 중첩 반복문은 반복문에 반복문을 중첩 시키는 구조
		 * 반복문1 횟수 * 반복문2 횟수
		 */
		for (int a = 0; a < 3; a++) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i*a);
			}
		}
	}

}
