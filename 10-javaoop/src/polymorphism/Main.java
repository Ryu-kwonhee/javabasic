package polymorphism;

public class Main {
	public static void main(String[] args) {
		
		// 부모타입인 Person만으로도 양쪽 자료형을 모두 처리 가능.
		Person t1 = new Teacher("김선생", 50, "과학");// 대입은 가능하나 통제력은 Person부분 까지만
		Person s1 = new Student("이학생", 15, 2);// 대입은 가능하나 통제력은 Person부분 까지만
		Person sports = new Sports("박야구", 30, "야구");
		// 단, 메서드는 Person을 베이스 객체는
		// Person에 정의된 메서드만 호출 가능
		t1.showPerson();
		// t1.showTeacher();
		s1.showPerson();
		// s1.St
		sports.showPerson();
		
				
	}
}
