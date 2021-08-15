import java.util.Scanner;

public class Continue02cp {
	public static void main(String[] args) {
		/*
		 * 1부터 n까지 총합을 구하되 홀수끼리만 더한 
		 * 총합을 구하는 구문을 작성해주세요.
		 * continue문을 반드시 사용하는 로직으로 작성해주세요.
		 * n은 스캐너로 받습니다.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 " + num +"까지의 홀수 합은 "+ sum
				);
	}

}
