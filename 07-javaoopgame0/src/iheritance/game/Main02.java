package iheritance.game;

public class Main02 {
	public static void main(String[] args) {
		/*
		 * Warrior를 생성해서 각종 스탯을 입력해주신 다음
		 * getInfo()를 호출해주세요.
		 * 
		 * getInfo()호출시 Commoner의 getInfo()는 무시됩니다.
		 * Warrior의 getInfo()가 우선적으로 호출됩니다.
		 */
		Warrior war = new Warrior();
		war.id = "파워전사123";
		war.level = 30;
		war.life = 1500;
		war.mana = 50;
		war.damage = 100;
		
		war.getInfo();
		
	}

}
