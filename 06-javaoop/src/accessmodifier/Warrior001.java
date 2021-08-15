package accessmodifier;

public class Warrior001 {
	private int atk;
	private int level;
	private int hp;
	private int exp;
	private String id;
	
	public Warrior001(String id) {
		this.atk = 15;
		this.level = 1;
		this.exp = 10;
		this.hp = 50;
		this.id = id;
	}
	public void hunt() {
		System.out.println("전사가 사냥을 시작했습니다.");
		hp -= 2;
		exp += 10;
		System.out.println("사냥 결과 체력은 "+ hp + "입니다.");
		System.out.println("사냥 결과 경험치는 "+ exp + "입니다.");
	}
	
}
