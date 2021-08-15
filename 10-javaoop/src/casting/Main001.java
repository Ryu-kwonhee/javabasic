package casting;

public class Main001 {
	public static void main(String[] args) {
		Animal001 d1 = new Dog001("개개", 2);
		Animal001 c1 = new Cat001("고양고양이", 5);
		Animal001 a1 = new Animal001("동물", 5);
		
		d1.sit();
		c1.sit();
		a1.sit();
		
		Dog001 dog = (Dog001)d1;
		dog.bowWow();
	}
}
