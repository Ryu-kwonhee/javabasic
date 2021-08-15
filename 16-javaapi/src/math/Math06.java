package math;

public class Math06 {
	public static void main(String[] args) {
		/*
		 * 가위바위보 게임을 만들어보겠습니다.
		 * Math.random()을 이용해 1/3확률로 가위, 바위, 보를 부여받으며
		 * 가위 > 보, 바위 > 가위, 보 > 가위의 상성을 가집니다.
		 * 같은 요소가 나오면 무승부입니다.
		 * 힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서 
		 * 조건식에 ||를 사용합니다.
		 */
		int i = (int)(Math.random() * 3);
		int com = (int)(Math.random() * 3);
		
//		final int ROCK = 0;
//		final int SCISSORS = 2;
//		final int PAPER = 1;
		// 상수를 이용해서 값에 의미를 부여하여 가독성을 높일 수 있음.
		
		// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
//		String[] items = {"가위", "바위", "보"};
//		System.out.println("나 : "+ items[i]);
//		System.out.println("컴퓨터 : "+ items[com]);
		// 인덱스번호를 이용한 방법
		
		if (i == 0) {
			System.out.println("나 : 주먹");
		} else if (i == 1) {
			System.out.println("나 : 보");
		} else if (i == 2) {
			System.out.println("나 : 가위");
		}
		if (com == 0) {
			System.out.println("컴퓨터 : 주먹");
		} else if (com == 1) {
			System.out.println("컴퓨터 : 보");
		} else if (com == 2) {
			System.out.println("컴퓨터 : 가위");
		}
		if(i == 0 && com == 2) {
			System.out.println("내가 이겼습니다.");
		} else if (i == 0 && com == 1) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (i == 1 && com == 0) {
			System.out.println("내가 이겼습니다.");
		} else if (i == 1 && com == 2) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (i == 2 && com == 0) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (i == 2 && com == 1) {
			System.out.println("내가 이겼습니다.");
		} else if (i == com) {
			System.out.println("무승부입니다.");
		}
		
	}
}
