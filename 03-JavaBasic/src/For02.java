import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		/*
		 * Hello Java를 입력한 횟수만큼 출력하는 구문을 작성해보세요.
		 * 입력은 Scanner로 받습니다.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("횟수 : ");
		int count = scan.nextInt();
		for (int a = 1; a <= count; a++) {
			System.out.println(a + ". Hello Java");
		}
		scan.close();
	}

}
