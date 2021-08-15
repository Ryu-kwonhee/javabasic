import java.util.Scanner;

public class For06 {
	public static void main(String[] args) {
		/*
		 * Scanner로 정수를 입력받게 해주세요.
		 * 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		 * 중첩 반복문을 작성해주세요.
		 * ex)3 입력시
		 * ***
		 * ***
		 * *** 과 같이 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int length = scan.nextInt();
		for (int c = 1; c <= length; c++) {
			for (int a = 1; a <= length; a++) {
				System.out.print("*");
			}
			System.out.println();
			
		} scan.close();
	}

}
