package buyandsell;

public class Main02 {
	public static void main(String[] args) {
		// 상인 2개 만들기
		Seller seller1 = new Seller(1);
		Seller seller2 = new Seller(4);
		Seller2 sellerA = new Seller2(10);
		// 구매자 1개 만들기
		Buyer buyer = new Buyer(10000);
		// 구매자 정보 확인
		buyer.showBuyer();
		System.out.println("----------------");
		// 1번 상인 정보확인
		seller1.showSeller();
		System.out.println("----------------");
		// 2번 상인 정보확인
		seller2.showSeller();
		System.out.println("----------------");
		// 1번 상인에게 구매자가 망고 구매
		buyer.buyMango(seller1, 3);
		System.out.println("----------------");
		// 구매자 정보 확인
		buyer.showBuyer();
		System.out.println("----------------");
		// 1번 상인 정보확인
		seller1.showSeller();
		System.out.println("----------------");
		// 2번 상인 정보 확인
		seller2.showSeller();
		System.out.println("----------------");
		
		buyer.buyApple(sellerA, 10);
		System.out.println("----------------");
		sellerA.showSeller2();
		System.out.println("----------------");
		buyer.showBuyer2();
		
	}
}
