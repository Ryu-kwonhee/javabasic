package accessmodifier.game;

public class Commoner {
	private String id;
	private int level;
	private int exp;
	private int hp;
	private int mp;
	
	public Commoner() {
		this.id = id;
		this.level = 10;
		this.exp = 0;
		this.hp = 20;
		this.mp = 10;
	}

	public String getid(String id) {
		return this.id; 
	}
	public int getlevel() {
		return this.level;
	}
	public int getexp() {
		return this.exp; 
	}
	public int gethp() {
		return this.hp; 
	}
	public int getmp() {
		return this.mp;
	}
	public void setexp(int exp) {
		this.exp = exp;
	}
	public void sethp(int hp) {
		this.hp = hp;
	}
	public void setmp(int mp) {
		this.mp = mp;
	}
	
}
