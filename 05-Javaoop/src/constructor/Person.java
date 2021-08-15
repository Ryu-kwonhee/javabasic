package constructor;

public class Person {
	public String name;
	public int age;
	public String pNum;
	
	// 생성자 이름은 항상 class이름과 동일하게 해야함!!!!
	public Person(String n, int a, String p) {
		name = n;
		age = a;
		pNum = p;
		System.out.println("인적사항!");
		System.out.println("이름 : "+ n);
		System.out.println("나이 : "+ a );
		System.out.println("전화번호 : "+ p);
	}		


	
	public void getPersonInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("전화번호 : "+ pNum);
	}
}


