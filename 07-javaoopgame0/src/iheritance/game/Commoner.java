package iheritance.game;

public class Commoner {
	// 레벨, 체력, 아이디, 마나수치를 변수로 만들어주세요.
	public int level;
	public int life;
	public String id;
	public int mana;
	
	
	// 메서드는 getInfo()로 콘솔에 변수 상태를 조회할 수 있도록
	// 구성해주시면 됩니다.
	public void getInfo() {
		System.out.println("아이디 : "+ id);
		System.out.println("레벨 : "+ level);
		System.out.println("체력 : "+ life);
		System.out.println("마나 : "+ mana);
	}
}
