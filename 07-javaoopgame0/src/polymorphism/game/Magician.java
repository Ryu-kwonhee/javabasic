package polymorphism.game;

public class Magician {
	private int hp = 15;
	private int mp = 20;
	private int atk = 10;
	private int def = 5;
	private int level = 10;
	private int exp = 0;
	
	public void showStatus() {
		System.out.println("레벨 : "+ level);
		System.out.println("경험치 : "+ exp);
		System.out.println("체력 : "+ hp);
		System.out.println("마나 : "+ mp);
		System.out.println("공격력 : "+ atk);
		System.out.println("방어력 : "+ def);
		System.out.println("----------------");
	}
	public void hunt(Monster2 mon2) {
		if (mon2.getHp() <= 0) {
			this.exp += 10;
			System.out.println(mon2.getName()+"가 죽었습니다.\n"+"사냥을 종료합니다.");
			System.out.println("<사냥 결과>");
			System.out.println("체력 : "+ hp);
			System.out.println("경험치 : "+ exp);
			System.out.println("----------------");
			return;
		}
		mon2.battle(this.atk);
		if (this.hp <= 0) {
			this.hp = 0;
			this.exp = 0;
			System.out.println("사망하였습니다.");
			System.out.println("체력 : "+ hp);
			System.out.println("경험치 : "+ exp);
			System.out.println("----------------");
			return;
		}
		System.out.println("공격 !!!");
		System.out.println("공격력 : "+ atk);
		System.out.println("----------------");
		if ((mon2.getAtk() - this.def) <= 0) {
			this.hp -= 1;
		} else {
			this.hp = this.hp - (mon2.getAtk() - this.def);
		}
	}
	public void thunderVolt(Monster2 mon2) {
		this.exp += 20;
		if (mp <= 0) {
			this.mp = 0;
			System.out.println("마나가 부족합니다.");
		} else {
			this.mp -= 2;
		}
		System.out.println("썬더 볼트!!!");
		mon2.thunderVolt(this.atk);
		System.out.println("<사냥 결과>");
		System.out.println("체력 : "+ hp);
		System.out.println("경험치 : "+ exp);
		System.out.println("----------------");
	}
	public void hpUp() {
		System.out.println("체력 회복!!!");
		System.out.println("----------------");
		if (this.hp >= 15) {
			System.out.println("체력이 충분합니다.");
			this.hp = 15;
		} else {
			this.hp += 5;
		}
	}
	public void mpUp() {
		System.out.println("마나 회복!!!");
		System.out.println("----------------");
		if (this.mp >= 20) {
			System.out.println("마나가 충분합니다.");
			this.mp = 20;
		} else {
			this.mp += 5;
		}
	}
	/*
	public void thunderVolt(Monster mon2) {
		atk = 5*2;
		if (mon2.getHp() <= 0) {
			this.exp += 20;
			System.out.println("썬더 볼트!!!");
		}
		System.out.println("썬더 볼트!!!");
		System.out.println("지지직 쿠쾅");
		System.out.println("으아아아악");
		System.out.println("체력 : "+ mon2.getHp());
		if((mon2.getDef() - atk) <= 0) {
			this.hp -= 2;
		} else {
			mon2.setHp(mon2.getHp() - (mon2.getDef() - atk));
		}
	}*/
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
	
}
