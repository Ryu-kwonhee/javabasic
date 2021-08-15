package accessmodifier;

public class Main {
	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요.
		// 사냥 3번 후에 전체 상태르 Sysout을 이용해 출력해주세요.
		Warrior war = new Warrior("파워전사");
		war.hunt();
		war.hunt();
		war.hunt();
//		System.out.println("아이디 : "+ war.id);
//		System.out.println("레벨 : "+war.level);
//		System.out.println("경험치 : "+war.exp);
//		System.out.println("체력 : "+war.hp);
//		System.out.println("공격력 : "+war.atk);
		
		Warrior war2 = new Warrior("광전사");
		war2.hunt();
		war2.hunt();
		war2.hunt();
//		System.out.println("아이디 : "+ war2.id);
//		System.out.println("레벨 : "+ war2.level);
//		System.out.println("경험치 : "+ war2.exp);
//		System.out.println("체력 : "+ war2.hp);
//		System.out.println("공격력 : "+ war2.atk);
	}
	
	
}
