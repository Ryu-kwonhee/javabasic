package casting;

public class Main {
	public static void main(String[] args) {
		// Animal타입은 어떤 자료형이건 받을 수 있다.
		Animal c1 = new Cat("고양이", 2);
		Animal d1 = new Dog("개", 4);
		Animal p1 = new Pig("돼지", 1);
		Animal a1 = new Animal("동물", 5);
		
		c1.sit();
		d1.sit();
		p1.sit();
		a1.sit();
		// 자식타입을 베이스로 만든 부모타입 변수는 
		// 자식타입으로 강제로 바꿀 수 있다.
		Cat cat = (Cat)c1;
		// 원타입으로 돌려놓으면 원타입만의 메서드도 호출이 가능합니다.
		cat.haAk();
		
		Dog dog = (Dog)d1;
		dog.bowWow();
		
		// 근본이 Animal인 경우는 다른 타입으로 변형이 안됩니다.
//		Cat = cat2 = (Cat)a1;
//		cat2.haAk();
		
	}
}
