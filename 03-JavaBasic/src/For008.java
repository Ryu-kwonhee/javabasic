
public class For008 {
	public static void main(String[] args) {
		/*
		 *    *
		 *   **
		 *  ***
		 * ****
		 */
		for (int i = 1; i <= 4; i++) {
			for (int a = 3; a >= i; a--) {
				System.out.print(" ");
			}
			for (int b = 1; b <= i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
