package polymorphism.game;

public class Boss extends Monster2{
	public Boss() {
		super("보스", 100, 50, 35);
	}
	public void battle(int matk) {
		if (getHp() <= 0) {
			setHp(0);
			return;
		}
	}
	
}
