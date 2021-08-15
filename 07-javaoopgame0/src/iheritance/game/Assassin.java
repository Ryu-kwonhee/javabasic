package iheritance.game;

public class Assassin extends Commoner {
	public int sDam;
	
	public void getInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " +  level);
		System.out.println("체력 : " + life);
		System.out.println("마나 : " + mana);
		System.out.println("속공 : " + sDam);
	}
}
