
public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 다음 로직대로 전위, 후위 수식을 이용해 고드를
		 * 작성해주시고, 전위, 후위 수식 코드는
		 * unary01.java에서 그랬듯
		 * 두 단계로 주석으로 풀어서 설명도 하세요.
		 * 
		 * 1. a에 15를 선언 및 초기화합니다.
		 * 2. a를 후위 수식 감소시키면서 콘솔에 찍습니다.
		 * (1) : System.out.println(a(15)); 
		 * (2) : a = a - 1;, a = 14
		 * 3. a를 콘솔에 찍습니다.
		 * 4. a를 전위 수식 감소시키면서 콘솔에 찍습니다.
		 * (1) : a = a - 1;, a = 13
		 * (2) : System.out.println(a(13));
		 * 5. a를 콘솔에 찍습니다.
		 */
		int a = 15;
		System.out.println(a--);
		//(1) : System.out.println(a(15)); 
		//(2) : a = a - 1;, a = 14
		System.out.println(a);
		System.out.println(--a);
		//(1) : a = a - 1;, a = 13
		//(2) : System.out.println(a(13));
		System.out.println(a);
		
	}

}
