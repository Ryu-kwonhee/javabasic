package exception03;

public class Exception004 {
	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 5, 0};
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(number[i]);
			}
			System.out.println(number[3] / number[5]);
		} catch (ArrayIndexOutOfBoundsException |
				ArithmeticException a) {
			System.out.println("범위를 벗어났거나");
			System.out.println("0으로 나눴습니다.");
		} catch (Exception e) {
			System.out.println("이외의 다른 예외가 발생했습니다.");
		}
	}
}
