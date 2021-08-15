package interaction.game;

public class Goblin {
	private int hp;
	private int atk;
	private int def;
	
	public Goblin() {
		this.hp = 5;
		this.atk = 2;
		this.def = 1;
	}
	public void Battle1(int waratk) {
		this.hp = (this.hp + this.def) - waratk;
		if (this.hp <= 0) {
			this.hp = 0;
			System.out.println("고블린 체력 : "+ hp);
			return;
		}
	}
		
		public void Battle2(int magatk) {
			this.hp = (this.hp + this.def) - magatk;
			if (this.hp <= 0) {
				this.hp = 0;
				System.out.println("고블린 체력 : "+ hp);
				return;
			}
		}
			
			public void Battle3(int infatk) {
				this.hp = (this.hp + this.def) - infatk;
				if (this.hp <= 0) {
					this.hp = 0;
					System.out.println("고블린 체력 : "+ hp);
					return;
				}
			}
		
	public void showInfo( ) {
		System.out.println("체력 : "+ hp);
		System.out.println("공격력 : "+ atk);
		System.out.println("방어력 : "+ def);
	}
	public int getGohp() {
		return this.hp;
	}
	public int getGoatk() {
		return this.atk;
	}
}
