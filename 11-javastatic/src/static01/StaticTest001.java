package static01;

public class StaticTest001 {
	public int num1 = 5;
	public static int num2;
	
	public StaticTest001() {
		num2 += 1;
		System.out.println("num1 변수는 수치가 변하지 않습니다." + num1);
		System.out.println("현재 가입자수는 "+ num2 + "명입니다.");
	}
}
