package casting;

public class Pig extends Animal{
	
	public Pig(String name, int age) {
		super(name, age);
	}
	public void eat() {
		System.out.println("돼지가 먹습니다.");
	}
	public void sit() {
		System.out.println("돼지가 앉습니다.");
	}
}
