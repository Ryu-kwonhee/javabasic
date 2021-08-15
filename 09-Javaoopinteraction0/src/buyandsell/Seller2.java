package buyandsell;

public class Seller2 {
	private int money;
	private int apple;
	
	public Seller2(int apple) {
		this.apple = apple;
		this.money = 0;
	}
	public void sellApple(int apple) {
		if (this.apple < apple) {
			System.out.println("사과가 모자랍니다.");
			return;
		}
		System.out.println("사과를 "+ apple + "개 팝니다.");
		this.apple -= apple;
		this.money = money + (apple * 500);
	}
	public void showSeller2() {
		System.out.println("소지금액 : "+ money);
		System.out.println("사과갯수 : "+ apple);
	}
	public int getApple() {
		return apple;
	}
}
