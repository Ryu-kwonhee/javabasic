package polymorphism.game;

public class Orc extends Monster2{
	public Orc() {
		super("오크", 10, 3, 3);
	}
	public void battle(int matk) {
		if (getHp() <= 0) {
			setHp(0);
			return;
		}
		
	}

}
