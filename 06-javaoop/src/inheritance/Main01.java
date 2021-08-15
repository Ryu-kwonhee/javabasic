package inheritance;

public class Main01 {
	public static void main(String[] args) {
		/*
		 * Student가 Person을 상속했기 때문에
		 * Student는 Person의 자원을 사용할 수 있습니다.
		 */
		Student s1 = new Student();
		s1.name = "류권희";
		s1.age = 25;
		s1.major = "화학";
		
		s1.getPersonInfo();
		s1.getStudentInfo();
	}
}
