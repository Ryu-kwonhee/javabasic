package static02;

public class Asean001 {
	// 중간고사, 기말고사, 출석, 조별과제 점수를 변수로 정의해주세요.
	// 단, 조별과제는 모든 객체가 공유하는 점수이며
	// 나머지는 개별 객체가 가지는 변수입니다.
	private int middleTest;
	private int finalTest;
	private int attendance;
	
	public static int score;
	
	public Asean001(int middleTest, int finalTest, int attendance) {
		this.middleTest = middleTest;
		this.finalTest = finalTest;
		this.attendance = attendance;
	}
	public void showAseanInfo() {
		System.out.println("중간고사 : "+ middleTest);
		System.out.println("기말고사 : "+ finalTest);
		System.out.println("출석점수 : "+ attendance);
		System.out.println("조별과제 : "+ score);
	}
	
}
