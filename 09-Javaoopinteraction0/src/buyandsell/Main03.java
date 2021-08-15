package buyandsell;

public class Main03 {
	public static void main(String[] args) {
		Seller2 s2 = new Seller2(10);
		Buyer buyer = new Buyer(10000);
		buyer.buyApple(s2, 5);
		s2.showSeller2();
		buyer.showBuyer2();
	}
}
