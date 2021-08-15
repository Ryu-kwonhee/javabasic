package abstract01;

public abstract class Parent001 {
	public int a;
	
	public Parent001() {
		this.a = 5;
	}
	public abstract void getA();
	
	public void getInfo() {
		System.out.println("일반 메서드입니다.");
	}
}
