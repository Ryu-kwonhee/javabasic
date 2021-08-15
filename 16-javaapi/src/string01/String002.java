package string01;

public class String002 {
	public static void main(String[] args) {
		String tomato = "tomato";
		int get = tomato.indexOf("to");
		System.out.println(get);
		
		get = tomato.indexOf("to", 1);
		System.out.println(get);
		
		get = tomato.indexOf("banana");
		System.out.println(get);
	}
}
