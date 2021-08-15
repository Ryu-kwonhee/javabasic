package polymorphism.game;

public class Hunter {
	private int level;
	private int exp;
	private int hp;
	private int mp;
	private int atk;
	private int def;
	
	public Hunter() {
		this.level = 10;
		this.exp = 0;
		this.hp = 100;
		this.mp = 50;
		this.atk = 10;
		this.def = 5;
	}
	public void showHunter() {
		System.out.println("레벨 : "+ level);
		System.out.println("경험치 : "+ exp);
		System.out.println("체력 : "+ hp);
		System.out.println("마나 : "+ mp);
		System.out.println("공격력 : "+ atk);
		System.out.println("방어력 : "+ def);
	}
	
	public void hunt(Monster mon) {
		
		System.out.println("사냥을 시작합니다.");
		System.out.println("공격력 : "+ atk);
		System.out.println("사냥 결과 : ");
		System.out.println("레벨 : "+ level);
		System.out.println("경험치 : "+ exp);
		System.out.println("체력 : "+ hp);
		
		mon.huntMonster(this.atk);
		if ((mon.getAtk()-this.def)< 0) {
			this.hp -= 1;
		} else {
			this.exp += 10;
			this.hp = this.hp - (mon.getAtk()-this.def);
		}
		if (this.hp <= 0) {
			this.hp = 0;
			this.exp = 0;
			System.out.println("사망 하였습니다.");
			System.out.println("경험치 : "+ exp);
			System.out.println("체력 : "+ hp);
		}
		
	}
	
	
	
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int gethAtk() {
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
