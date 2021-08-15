package interaction.game;

public class Monster3 {
	private int hp;
	private int atk;
	private int def;
	
	public Monster3() {
		this.hp = 10;
		this.atk = 5;
		this.def = 7;
	}
	public void attack3() {
		if (hp <= 0) {
			hp = 0;
			System.out.println("몬스터가 죽었습니다.");
			return;
		}
		hp -= 2;
		System.out.println("공격 하라!!!");
		System.out.println("체력 : "+ hp);
		System.out.println("---------------");
	}
	public void getInfo( ) {
		System.out.println("체력 : "+ hp);
		System.out.println("공격력 : "+ atk);
		System.out.println("방어력 : "+ def);
	}
	public int getMonster3() {
		return hp;
	}
	public void sethp3(int hp) {
		this.hp = hp;
	}
}
