package iheritance.game;

public class Main03 {
	public static void main(String[] args) {
		
		Warrior war = new Warrior();
		war.id = "파워전사123";
		war.level = 30;
		war.life = 1500;
		war.mana = 50;
		war.damage = 100;
		
		Magician m = new Magician();
		m.id = "밥사법사123";
		m.level = 30;
		m.life = 800;
		m.mana = 200;
		m.mDam = 130;
		
		Assassin a1 = new Assassin();
		a1.id = "살자암살자123";
		a1.level = 30;
		a1.life = 1000;
		a1.mana = 100;
		a1.sDam = 80;
		
		war.getInfo();
		System.out.println("------------------");
		m.getInfo();
		System.out.println("------------------");
		a1.getInfo();
	}
}
