
public class Break03 {
	public static void main(String[] args) {
		/*
		 * 중첩 반복문 사용시 전체 다 종료가 아닌
		 * 내부 반복문만 종료하는 예시
		 * 구구단 출력, 단 n * 5까지만 출력하는 예시
		 * 단, break가 속한 반복문이 아닌 상위 반복문을 종료하고 싶다면
		 * 라벨명 : for(...)로 라벨을 붙여준 다음
		 * break 라벨명;
		 * 으로 호출하면 상위 반복문도 종료시킬 수 있다.
		 * 
		 * 바깥쪽 반복문에 outter라는 이름을 붙여줌
		 */
			outter : for (int i = 2; i <= 9; i++) {
				System.out.println(i + "단 출력.");
				for (int j = 1; j <= 9; j++) {
					if (j > 5) {
						System.out.println("*6이상은 직접 알아보기");
						break outter;// 라벨링을 할 시 라벨이름과 동일한 이름의 반복문까지 종료시킴
					}
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println("----------------------");
			}
		
	}

}
