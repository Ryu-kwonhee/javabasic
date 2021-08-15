package structure;

public class ClassMain {
	public static void main(String[] args) {
		/*
		 * Person 2명을 만들어보겠습니다.
		 */
		PersonClass person1 = new PersonClass();
		PersonClass person2 = new PersonClass();
		// Person 2명 정보를 직접 기입해주세요.
		person1.name = "바이든";
		person1.age = 78;
		person1.pNum = "010-2143-8798";
		person1.address = "워싱턴";
		person1.glasses = false;
		
		person2.name = "아무개";
		person2.age = 50;
		person2.pNum = "010-5465-9798";
		person2.address = "부산";
		person2.glasses = true;
		
		// 정보를 조회 해보겠습니다.
		person1.getInfo();
		person2.getInfo();
		
	}

}
