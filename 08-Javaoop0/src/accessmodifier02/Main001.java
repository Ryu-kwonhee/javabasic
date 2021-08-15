package accessmodifier02;

public class Main001 {
	public static void main(String[] args) {
		Child001 child = new Child001();
		
		System.out.println(child.a);// 모든 외부요소들 가능
		System.out.println(child.b);// 같은 패키지.클래스, 다른 패키지는 상속으로 연결가능
		//System.out.println(child.c);// private은 같은 클래스만, 상속도 (x)
		System.out.println(child.d);// 같은 패키지. 클래스
	}
}
