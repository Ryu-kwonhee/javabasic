package exception02;

import java.util.Scanner;

public class TryCatch001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1번 정수를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("2번 정수를 입력해주세요.");
		int num2 = scan.nextInt();
		
		try {
			System.out.println(num1 / num2);
			System.out.println("계산 끝!");
		} catch (Exception e){
			System.out.println("0으로 나누지 마시오");
		} finally {
			System.out.println("코드 끝!");
		}
	}
}
