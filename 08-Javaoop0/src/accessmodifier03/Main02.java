package accessmodifier03;

public class Main02 {
	public static void main(String[] args) {
		/*
		 * 다른 패키지에서 상속받은 Child02를 확인해보겠습니다.
		 */
		Child02 child02 = new Child02();
		
		// 1. public 접근 제한자
		System.out.println(child02.a);
		// 1-2. child02 내부의 e값 변경 및 접근
		child02.e = 100;
		System.out.println(child02.e);
		// 2. protected 접근 제한자
		// protected는 같은 패키지, 혹은 다른 패키지라면
		// 상속관계일때 접근 가능
//		System.out.println(child02.b);
//		child02.setB(7);
//		child02.getB();
//		child02.setB(100);
//		child02.getB();
		System.out.println(child02.getBInt());
		// 3. default 접근 제한자(패키지가 같으면 접근 가능)
//		System.out.println(child02.d);
	}
}
