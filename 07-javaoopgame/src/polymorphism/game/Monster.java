package polymorphism.game;

public class Monster {
	private String name;
	private int hp;
	private int def;
	private int atk;
	
	public Monster(
			String name, 
			int hp, 
			int def, 
			int atk) {
		this.name = name;
		this.hp = hp;
		this.def = def;
		this.atk = atk;
	}
}
