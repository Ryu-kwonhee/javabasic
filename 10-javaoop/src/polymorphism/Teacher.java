package polymorphism;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	public void showTeacher() {
		super.showPerson();
		System.out.println("과목 : "+ subject);
		
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("과목 : "+ subject);
		System.out.println("-----------------");
	}
}
