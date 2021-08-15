package interaction.game;

public class InFighter {
	private int level;
	private int exp;
	private int hp;
	private int mp;
	private int atk;
	private int def;
	
	public InFighter() {
		this.level = 1;
		this.exp = 0;
		this.hp = 10;
		this.mp = 5;
		this.atk = 7;
		this.def = 3;
	}
	public void showInfo() {
		System.out.println("레벨 : "+ level);
		System.out.println("경험치 : "+ exp);
		System.out.println("체력 : "+ hp);
		System.out.println("마나 : "+ mp);
		System.out.println("공격력 : "+ atk);
		System.out.println("방어력 : "+ def);
	}
	public void huntGoblin(Goblin go) {
		if (go.getGohp() <= 0) {
			this.exp += 10;
			System.out.println("공격 !!!");
			System.out.println(this.atk);
			System.out.println("고블린을 물리쳤습니다.");
			System.out.println("경험치는 "+ exp+ "입니다.");
			return;
		}
		System.out.println("공격 !!!");
		System.out.println(this.atk);
		
		go.Battle3(this.atk);
		
		if (go.getGoatk() >= this.hp) {
			this.hp = 0;
			this.exp = 0;
			System.out.println("유저가 사망하였습니다.");
			System.out.println("사냥 결과 : 체력은 "+ hp);
			System.out.println("경험치는 "+ exp+ "입니다.");
			return;
		}
		
		this.hp = (this.hp + this.def) - go.getGoatk();
	}
	public void huntZombie(Zombie zo) {
		if (zo.getHp() <= 0) {
			this.exp += 10;
			System.out.println("공격 !!!");
			System.out.println(this.atk);
			System.out.println("좀비를 물리쳤습니다.");
			System.out.println("경험치는 "+ exp+ "입니다.");
			return;
		}
		System.out.println("공격 !!!");
		System.out.println(this.atk);
		
		zo.Battle3(this.atk);
		
		if (zo.getAtk() >= this.hp) {
			this.hp = 0;
			this.exp = 0;
			System.out.println("유저가 사망하였습니다.");
			System.out.println("사냥 결과 : 체력은 "+ hp);
			System.out.println("경험치는 "+ exp+ "입니다.");
			return;
		}
		
		this.hp = (this.hp + this.def) - zo.getAtk();
	}
	public int getHp() {
		return this.hp;
	}
	public int getExp() {
		return this.exp;
	}
}
