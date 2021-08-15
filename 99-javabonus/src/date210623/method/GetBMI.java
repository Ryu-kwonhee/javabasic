package date210623.method;

public class GetBMI {
	
	// getBMI 메서드를 만들어주세요.
	// 리턴 자료형은 double입니다.
	// 입력은 double height, double weight를 받습니다.
	// BMI공식은 몸무게 / 키 (미터)^2 입니다.
	// 175cm의 경우 -> 1.75입니다.
	// 메서드를 여기 작성해주신 다음, 메인 내부에서
	// getBMI를 Sysout으로 감싸서 결과값이 나오게 해주세요.
	public double height;
	public double weight;
	public static double getBmI(double height, double weight) {
		return weight/(height*height);
		
			
	}
	public static void main(String[] args) {
		System.out.println("BMI수치 : " + getBmI(1.75, 65.0));
	}
}
