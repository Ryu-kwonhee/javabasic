
public class SwitchCase02 {
	public static void main(String[] args) {
		// Math.random();을 이용해 난수를 하나 발급 받을 수 있고
		// 난수의 범위는 0초과 1미만입니다.
		double number = Math.random();
		System.out.println(number);

		// 뒤에 숫자를 곱하면 원하는 범위의 정수를 얻을 수 있습니다.
	//	int intNum = (int)(Math.random() * 10);
	//	System.out.println(intNum);
		
		// Switch ~ case문을 이용해서
		// 식당 이름을 출력하는 프로그램을 만들어보세요.(최소 6가지)
		int num = (int)(Math.random() * 10);
		switch (num) {
		case 1:
			System.out.println("고쿠텐");
			break;
		case 2:
			System.out.println("노브랜드 버거");
			break;
		case 3:
			System.out.println("홍식당");
			break;
		case 4:
			System.out.println("싸움의 고수");
			break;
		case 5:
			System.out.println("손오공 마라탕");
			break;
		case 6:
			System.out.println("닝교초 식당");
			break;
		case 7:
			System.out.println("삼미 식당");
			break;
		case 8:
			System.out.println("성화 라멘");
			break;
		case 9:
			System.out.println("분식");
			break;
		default:
			System.out.println("곱도리 식당");
			break;
		}
	}

}
