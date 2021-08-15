package casting;

public class Dog001 extends Animal001{
	public Dog001(String name, int age) {
		super(name, age);
	}
	public void bowWow() {
		System.out.println("개가 짖습니다.");
	}
	public void sit() {
		System.out.println("개가 앉습니다.");
	}
}
