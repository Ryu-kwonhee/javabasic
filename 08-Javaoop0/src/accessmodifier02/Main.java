package accessmodifier02;

public class Main {
	public static void main(String[] args) {
		// Parent를 상속받은 Child 내부의 자료조회
		Child child = new Child();
		// 1. public 자료
		System.out.println(child.a);// public 모두 접근 가능
		// 2. protected 자료
		// 현재 Mai.java와 같은 패키지 내부에 Parent, Child
		// 가 존재하므로 protected 접근 가능
		System.out.println(child.b);
		// protected 같은 패키지. 클래스만 접근 가능, 다른 패키지인 경우 상속관계이면 가능
		
		// 3. private 자료
	//	System.out.println(child.c);
		/*
		 private은 같은 클래스 내부만 접근 가능, child가 parent의 자식관계이나 
		 private인 c는 parent소속일 때에만 접근을 시켜줌. */ 
		
		// 4. default 자료
		System.out.println(child.d);// friendly 같은 클래스, 같은 패키지에서만 접근 가능
	}
}
