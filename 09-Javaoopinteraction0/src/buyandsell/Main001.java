package buyandsell;

public class Main001 {
	public static void main(String[] args) {
		Buyer001 buyer = new Buyer001(10000);
		Seller001 seller = new Seller001(10);
		Seller002 seller2 = new Seller002(200);
//		buyer.buyMango(2);
//		buyer.showBuyer();
//		seller.sellMango(3);
//		seller.showSeller();
//		buyer.buyMango(seller, 10);
//		buyer.showBuyer();
//		seller.showSeller();
		buyer.buyApple(seller2, 10);
		buyer.showBuyer2();
		seller2.showApple();
	}
}
