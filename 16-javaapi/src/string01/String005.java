package string01;

import java.util.Scanner;

public class String005 {
	public static void main(String[] args) {
		// .length()와 charAt()을 활용해 입력된 전체 문자열을
		// 한 글자씩을 한줄씩 출력하는 로직을 작성해보세요.
		// 문자열은 Scanner로 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String s = scan.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char get = s.charAt(i);
			System.out.println(get);
		}
	}
}
