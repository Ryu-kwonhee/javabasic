package interaction.game;

public class Monster2 {
	private int hp;
	private int atk;
	private int def;
	
	public Monster2() {
		this.hp = 7;
		this.atk = 5;
		this.def = 10;
	}
	public void attack2() {
		if (hp <= 0) {
			hp = 0;
			System.out.println("몬스터가 죽었습니다.");
			return;
		}
		hp -= 1;
		System.out.println("공격!!! 공격!!!");
		System.out.println("체력 : "+ hp);
		System.out.println("---------------");
	}
	public void getInfo( ) {
		System.out.println("체력 : "+ hp);
		System.out.println("공격력 : "+ atk);
		System.out.println("방어력 : "+ def);
	}
	public int getMonster2() {
		return hp;
	}
	public void sethp2(int hp) {
		this.hp = hp;
	}
}
