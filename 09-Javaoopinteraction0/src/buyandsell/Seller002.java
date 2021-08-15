package buyandsell;

public class Seller002 {
	private int apple;
	private int money;
	
	public Seller002(int apple) {
		this.apple = apple;
		this.money = 0;
	}
	public void sellApple(int apple) {
		this.money += apple * 500;
		this.apple -= apple;		
	}
	public void showApple() {
		System.out.println("소지금액 : "+ money);
		System.out.println("남은 사과 : "+ apple);
	}
	public int getApple() {
		return apple;
	}
}
