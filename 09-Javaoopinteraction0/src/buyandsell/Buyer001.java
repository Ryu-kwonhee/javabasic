package buyandsell;

public class Buyer001 {
	// 구매자 
		// 구매자는 돈, 망고갯수를 멤버변수로 가집니다.
		// 은닉 구현을 위해서 private으로 처리합니다.
		
		// 생성자는(int money)를 받아 돈을 초기화합니다.
		// 망고는 자동으로 0을 대입합니다.
		
		// buyMango는 망고를 삽니다.
		// (int mango)로 망고 갯수를 입력받으면, 망고 * 1000만큼의
		// 돈을 차감하고 망고 변수에 그만큼 갯수를 늘려줍니다.
		// 현실에서 망고를 구매할 때 구매자가 가게를 고르지 
		// 가게에서 구매자를 선택하지 않으므로, seller 변수를 
		// Buyer가 고를 수 있도록 파라미터 설정을 합니다.
		
		// ShowBuyer는 구매자의 상태를 보여줍니다.
		// money, mango 수치가 각각 몇인지 콘솔에 찍어줍니다.
	private int money ;
	private int mango;
	private int apple;
	
	public Buyer001(int money) {
		this.money = money;
		this.mango = 0;
		
	}
	public void buyMango(Seller001 sell, int mango) {
		if (money < (mango*1000)) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		sell.sellMango(mango);
		this.money = money - (mango*1000);
		this.mango += mango;
	}
	public void showBuyer() {
		System.out.println("소지금액 : "+ money);
		System.out.println("구입한 망고 : "+ mango);
	}
	public void showBuyer2() {
		System.out.println("소지금액 : "+ money);
		System.out.println("구입한 사과 : "+ apple);
	}
	public void buyApple(Seller002 sell2, int apple) {
		if (money < (apple * 500)) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		sell2.sellApple(apple);
		this.money = money - apple*500;
		this.apple += apple;
	}
	
}
