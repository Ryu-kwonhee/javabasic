package system01;

public class Exit01 {
	public static void main(String[] args) {
		// System.exit()는 break문처럼 실행 즉시
		// 프로그램 실행을 종료한다.
		System.out.println("실행중 1");
		System.out.println("실행중 2");
		System.out.println("실행중 3");
		System.out.println("실행중 4");
		System.exit(-1);
		// 0 정상종료(에러발생x), 0이외 비정상종료(에러발생o)
		System.out.println("실행중 5");
		System.out.println("실행중 6");
	}
}