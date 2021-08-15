
public class For005 {
	public static void main(String[] args) {
		/*
		 * 2 ~ 9단까지 구구단을 출력하는 코드를 작성해주세요. 중첩 반복문을 써주세요.
		 */
		for (int i = 2; i <= 9; i++) {
			for (int a = 1; a <= 9; a++) {
				System.out.printf("%d * %d = %d\t", i, a, i*a);
				
			}
			System.out.println();
		}
	}
}
