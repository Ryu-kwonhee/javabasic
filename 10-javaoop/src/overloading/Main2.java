package overloading;

public class Main2 {
	public static void main(String[] args) {
		OverTest overtest1 = new OverTest();
		OverTest overtest2 = new OverTest("2번입니다.");
		OverTest overtest3 = new OverTest(123);
		OverTest overtest4 = new OverTest("4번이네요.", 4);
		
		overtest1.showData();
		overtest2.showData();
		overtest3.showData();
		overtest4.showData();
	}
}
