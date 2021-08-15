
public class For07 {
	public static void main(String[] args) {
		/*
		 * 피라미드형 별을 찍어봅시다.
		 * 아래와 같은 별을 찍을  수 있도록 코드를 작성해주세요.
		 * *
		 * **
		 * ***
		 * ****
		 * 중첩 반복문의 어느 곳이 세로, 가로를 담당하는지 생각해보세요.
		 */
		
		for (int c = 1; c <= 4; c++) {
			for (int i = 1; i <= c; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a = 1; a <= 4; a++) {
			for (int b = 4; b >= a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}