package structure;

public class Structure01 {
	public static void main(String[] args) {
		/*
		 * Scanner와 마찬가지로 사용자가 커스텀으로 디자인한 자료형은
		 * 아래와 같이 new 자료형(); 문법으로 생성합니다.
		 */
		Person a = new Person();
		// a라는 구조체에 이름, 나이, 폰 번호를 입력합니다.
		a.name = "류권희";
		a.age = 25;
		a.pNum = "010-3863-2634";
		a.address = "강원도 춘천시 동내면 대룡산 길 26-12";
		// 입력된 자료를 하나하나 출력합니다.
		System.out.println(a.name);		
		System.out.println(a.age);		
		System.out.println(a.pNum);		
		System.out.println(a.address);
		// 또 다른 사람을 하나 만들어봅니다.
		Person b = new Person();
		b.name = "김철수";
		b.age = 25;
		b.pNum = "010-1234-1234";
		b.address = "서울특별시 마포구 서교동 xxxxx";
		// 입력된 자료를 하나하나 출력합니다.
		 System.out.println(b.name);
		 System.out.println(b.age);
		 System.out.println(b.pNum);
		 System.out.println(b.address);
	}

}
