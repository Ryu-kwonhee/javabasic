package polymorphism;

public class Sports extends Person {
	private String Baseball;
	
	public Sports(String name, int age, String Baseball) {
		super(name, age);
		this.Baseball = Baseball;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("운동 : "+ Baseball);
		System.out.println("-----------------");
	}
}
