import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		/*
		 * Scanner생성
		 */
		Scanner scan = new Scanner(System.in);
		
		// 문자열을 입력받는 경우
		String name = scan.nextLine();
		
		// 실수를 입력받는 경우
		double height = scan.nextDouble();
		
		System.out.println(name + height);// +연산에 문자열이 포함될 시 곧바로 다 문자열로 여김, 문자열끼리 +는 문자열을 그대로 붙여 나열함
		scan.close();
	}

}
