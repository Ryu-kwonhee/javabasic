package structure;

public class Structure02 {
	
	/*
	 *  Person 내부의 정보를 쉽게 조회 하기위한 메서드 제작
	 */
	public static void getInfo(Person p) {
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
	}
	/*
	 * Cat자료형을 정의해주세요.
	 * 이름, 나이, 품종
	 * Structure02 내부에 고양이 2마리를 생성해주시고
	 * getCatInfo메서드를 만들어 고양이 정보를 조회할 수 있도록 만들어주세요.
	 */
	public static void getCatInfo(Cat c) {
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.cultival);
	}
	
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a, b)
		
		Person a = new Person();
		a.name = "김철수";
		a.age = 20;
		a.pNum = "010-1234-5678";
		a.address = "부산";
		Person b = new Person();
		b.name = "김영미";
		b.age = 30;
		b.pNum = "010-3213-7687";
		b.address = "서울";
		getInfo(a);
		System.out.println();
		getInfo(b);		
		System.out.println();
		Cat i = new Cat();
		i.name = "나비";
		i.age = 4;
		i.cultival = "먼치킨";
		Cat c = new Cat();
		c.name = "냥이";
		c.age = 7;
		c.cultival = "서바나 캣";
		getCatInfo(i);
		System.out.println();
		getCatInfo(c);
	}

}
