package accessmodifier.game;

public class WarriorPro extends CommonerPro {
	public void getInfo() {
		this.id = "파워전사";
		System.out.println("아이디 : "+ id);
		System.out.println("레벨 : "+ level);
		System.out.println("경험치 : "+ exp);
		System.out.println("체력 : "+ hp);
		System.out.println("마나 : "+ mp);
		System.out.println("-----------------");
		
	}
	public void hunt() {
		hp -= 2;
		exp += 10;
		System.out.println("사냥을 시작했습니다.");
		System.out.println("사냥 결과 : 체력은 "+ hp +"입니다.");
		System.out.println("경험치는 " + exp + "입니다.");
		System.out.println("------------------");
	}
	public void doubleAttack() {
		if (mp - 2 <= 0) {
			mp = 0;
			System.out.println("마나가 부족합니다.");
			System.out.println("마나 : "+ mp);
		} else {
			mp -= 2;
			exp += 15;
			System.out.println("더블 어택!!!");
			System.out.println("경험치 : "+ exp);
			System.out.println("마나 : "+ mp);
		}
		System.out.println("----------------");
	}
}
