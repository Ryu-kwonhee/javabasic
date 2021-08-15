
public class For08 {
	public static void main(String[] args) {
		/*
		 *    *
		 *   **
		 *  ***
		 * ****
		 */
		for (int b = 1; b <= 4; b++) {
			for (int c = 3; c >= b; c--) {
				System.out.print(" ");
			}
			for (int a = 1; a <= b; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
