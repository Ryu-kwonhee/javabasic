package iheritance.game;

public class Main01 {
	public static void main(String[] args) {
		// 초보자 계정 하나를 생성하고 확인해주세요.
		Commoner com = new Commoner();
		com.id = "초보자123";
		com.level = 10;
		com.life = 50;
		com.mana = 30;
		
		com.getInfo();
	}
}
