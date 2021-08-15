
public class For05 {
	public static void main(String[] args) {
		/*
		 * 2 ~ 9단까지 구구단을 출력하는 코드를 작성해주세요. 중첩 반복문을 써주세요.
		 */

		for (int num = 1; num <= 9; num++) {//  for num 여는 부분
			for (int i = 2; i <= 9; i++) {// for i 여는 부분
				System.out.printf("%d * %d = %d\t",i,num,i*num);
				
			}// for i 닫는 부분
			System.out.println();
		}// for num 닫는 부분

	}

}
// 19 * 19단 짜오기
