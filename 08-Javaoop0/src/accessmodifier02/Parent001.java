package accessmodifier02;

public class Parent001 {
	public int a;
	protected int b;
	private int c;
	
	
	int d; // default - protected와 private중간
	
	public Parent001() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
	}
}
