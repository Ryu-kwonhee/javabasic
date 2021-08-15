package polymorphism.game;

public class Monster {
	private String name;
	private int hp;
	private int atk;
	private int def;
	
	public Monster(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		
	}
	
	public void huntMonster(int hatk) {
		if((hatk - this.def) < 0) {
			this.hp -= 1;
		} else {
			this.hp = this.hp - (hatk - this.def);
		}
		if (this.hp <= 0) {
			System.out.println("몬스터를 물리쳤습니다.");
			
			return;
		}
	}
	
	
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
}
