
public class Binary02 {
	public static void main(String[] args) {
		/*
		 * 비교 연산자는 크게 대소 비교와 단순 비교로 나뉩니다.
		 * 단순 비교는 ==, !=이며 모든 자료형간(같은 자료형 끼리 or 같게 맞출 수 있는 자료형 끼리) 
		 * 비교가 가능합니다.
		 * 대소 비교는 >, <, >=< <= 이며
		 * 숫자끼리만 비교가 가능합니다.
		 * 컴퓨터는 비교 연산자를 명제로 인식하며
		 * 참(true) 거짓(false)를 판단해 결과로 보여줍니다.
		 */
		System.out.println(3 > 5);
		System.out.println('a' <= 12);
		
		System.out.println("a" != "b");
		System.out.println("a" == "a");
		System.out.println(5 == 5.0);
	}

}
