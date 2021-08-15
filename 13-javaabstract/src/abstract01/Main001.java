package abstract01;

public class Main001 {
	public static void main(String[] args) {
		//Parent p1 = new Parent();
		Parent p2 = new Child();
		Child c1 = new Child();
		
		p2.getA();
		p2.getInfo();
		c1.getA();
		c1.getInfo();
	}
}
