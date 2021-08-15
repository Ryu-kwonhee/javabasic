package thiskeyword;

public class Main {
	public static void main(String[] args) {
		/*
		 * this가 적용된 Person 생성하기
		 * 생성시 ctrl+space를 누르면 입력하 요소가 출력됨
		 */
		Person p1 = new Person("류권희", 20, 2510, "철학");
		p1.getInfo();
		
		// Person객체를 하나 더 임의로 생성해주세요.
		
		Person pp = new Person("김철수", 25, 1470, "물리");
		pp.getInfo();
	}
}
