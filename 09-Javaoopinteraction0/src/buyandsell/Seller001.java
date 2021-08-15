package buyandsell;

public class Seller001 {
	// 판매자 
		// 돈, 망고를 가집니다.
		
		// 생성자에서 망고갯수를 입력받을 수 있습니다.
		// 돈은 0을 넣어주세요.
		
		// 판매시 망고갯수를 입력할 수 있고
		// 망고갯수 * 1000만큼의 돈이 올라가고
		// 망고는 판 갯수만큼 차감됩니다.
		// 0미만으로 망고가 줄어들 수 없습니다.
		
		// showSeller를 이용해 현재 남은 망고와 돈을 볼 수 있습니다.
	private int money;
	private int mango;
	
	public Seller001(int mango) {
		this.money = 0;
		this.mango = mango;
	}
	public void sellMango(int mango) {
		this.money += (mango * 1000);
		this.mango -= mango;
	}
	public void showSeller() {
		System.out.println("소지금액 : "+ money);
		System.out.println("남은 망고 : "+ mango);
	}
	public int getMango() {
		return mango;
	}
}
