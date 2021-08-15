
public class While003 {
	public static void main(String[] args) {
		/*
		 * while에 true 값을 직접넣으면 break를 넣을 때까지 
		 * 무한 루프가 진행된다.
		 */
		int count = 0;
		while(true) {
			count += 1;
			System.out.println("반복 실행중입니다." + count);
		}
	}

}
