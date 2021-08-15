import java.util.Scanner;

public class Break04 {
	public static void main(String[] args) {
		/*
		 * Scanner로 정수를 입력받으세요.
		 * 1 ~ n까지 차곡차곡 순서대로 더해나갔을떄
		 * 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는
		 * 프로그램을 작성해주세요.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
		int i = scan.nextInt();
		
		int sum = 0;
		int b = 1;
		while (true) {
		
			sum += b;
		
			System.out.println("1부터"+ b +"까지의 총합은 : "+ sum +"입니다.");
			if (sum >= i) {
				System.out.println("목표값 : "+ i);
				System.out.println("총합 : " + sum);
				System.out.println("몇 까지 더했나? : "+ b);

				break;
			}
			b++;
		}
				
	}

}
