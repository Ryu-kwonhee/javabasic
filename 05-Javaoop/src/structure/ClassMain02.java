package structure;

public class ClassMain02 {
	public static void main(String[] args) {
		AnimalClass A = new AnimalClass();
		AnimalClass B = new AnimalClass();
		AnimalClass C = new AnimalClass();
		
		A.name = "호랑이";
		A.type = "포유류";
		A.eat = "육식";
		A.life = 15;
		A.size = "2에서 4미터";
		
		B.name = "앵무새";
		B.type = "조류";
		B.eat = "초식";
		B.life = 30;
		B.size = "10에서 99센티";
		
		C.name = "고등어";
		C.type = "어류";
		C.eat = "육식";
		C.life = 6;
		C.size = "30센티";
		
		A.getAnimalInfo();
		System.out.println("---------------");
		B.getAnimalInfo();
		System.out.println("---------------");
		C.getAnimalInfo();
		
	}

}
