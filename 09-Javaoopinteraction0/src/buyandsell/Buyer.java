package buyandsell;

public class Buyer {
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
	
	
	private int money;
	private int mango;
	private int apple;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.apple = 0;
	}
	public void buyMango(Seller s, int mango) {
		// 망고 가격보다 돈이 적은 경우
		if (money < (mango*1000) ) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		// 조건식 : 구매할 망고 개수보다 판매자의 재고가 적은 경우
		if (s.getMango() < mango) {
			System.out.println("망고 재고가 부족합니다.");
			return;
		}
		// 셀러쪽에서 망고를 파는 코드를 내가 망고를 사는 코드에 넣어서
		// 동시에 사고 팔도록 처리해야 상호작용이 이뤄집니다.
		s.sellMango(mango);
		System.out.println("망고를 " + mango + "개 삽니다.");
		this.money = money;
		money -= (mango * 1000);
		this.mango += mango;
	}
	public void buyApple(Seller2 s2, int apple) {
		if (money < (apple * 500)) {
			System.out.println("돈이 부족합니다.");
			return;
		}
		if (s2.getApple() < apple) {
			System.out.println("사과 재고가 부족합니다.");
			return;
		}
		s2.sellApple(apple);
		System.out.println("사과를 "+ apple + "개 삽니다.");
		this.money = money - (apple*500);
		this.apple += apple;
	}
	public void showBuyer() {
		System.out.println("소지금액 : "+ money);
		System.out.println("망고갯수 : " + mango);
	}
	public void showBuyer2() {
		System.out.println("소지금액 : "+ money);
		System.out.println("사과갯수 : " + apple);
	}
	
}
