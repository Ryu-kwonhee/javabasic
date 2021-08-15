package interaction.game;


public class Zombie {
	private int hp;
	private int atk;
	private int def;
	
	public Zombie() {
		this.hp = 500;
		this.atk = 4;
		this.def = 2;
		
	}
	public void Battle1(int waratk) {
		this.hp = (this.hp + this.def) - waratk;
		if (this.hp <= 0) {
			this.hp = 0;
			System.out.println("좀비 체력 : "+ hp);
			return;
		}
		
		
		
	}
	public void Battle2(int magatk) {
		this.hp = (this.hp + this.def) - magatk;
		if (this.hp <= 0) {
			this.hp = 0;
			System.out.println("좀비 체력 : "+ hp);
			return;
		}
	}
	public void Battle3(int infatk) {
		this.hp = (this.hp + this.def) - infatk;
		if (this.hp <= 0) {
			this.hp = 0;
			System.out.println("좀비 체력 : "+ hp);
			return;
		}
	}
	public void showInfo( ) {
		System.out.println("체력 : "+ hp);
		System.out.println("공격력 : "+ atk);
		System.out.println("방어력 : "+ def);
	}
	public int getHp() {
		return this.hp;
	}
	public int getAtk() {
		return this.atk;
	}
}
