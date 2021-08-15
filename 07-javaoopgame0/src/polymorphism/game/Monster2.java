package polymorphism.game;

public abstract class Monster2 {
	private String name;
	private int hp;
	private int atk;
	private int def;
	
	
	public Monster2(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	public abstract void battle(int matk); 
//	{
//		if (this.hp <= 0) {
//			this.hp = 0;
//			System.out.println(this.name + "을 물리쳤습니다.");
//			return;
//		}
//		System.out.println("으윽");
//		System.out.println("체력 : "+ this.hp);
//		if((matk - this.def) <= 0) {
//			this.hp -= 1;
//		} else {
//			this.hp = this.hp - (matk - this.def);
//		}
//	}
	
	public void thunderVolt(int matk) 
	{
		if (this.hp <= 0) {
			this.hp = 0;
			System.out.println(this.name + "을 물리쳤습니다.");
			System.out.println("----------------");
			return;
		}
		System.out.println("지지직 쿠쾅");
		System.out.println("으아아아악");
		System.out.println("----------------");
		if((matk*2 - this.def) <= 0) {
			this.hp -= 1;
		} else {
			this.hp = this.hp - (matk*2 - this.def);
			System.out.println("----------------");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
