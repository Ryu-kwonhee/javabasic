package polymorphism.game;

public class Bigfoot extends Monster2 {
	public Bigfoot() {
		super("빅풋", 15, 10, 7);
	}
	public void battle(int matk) {
		if (getHp() <= 0) {
			setHp(0);
			return;
		}
	}

}
