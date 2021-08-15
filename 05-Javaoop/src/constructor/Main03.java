package constructor;

public class Main03 {
	public static void main(String[] args) {
		BasketBallPlayer b1 = new BasketBallPlayer("마이클 조던", 200, 130); 
		b1.dunkShoot();
		System.out.println("--------------------");
		BasketBallPlayer b2 = new BasketBallPlayer("강백호", 190, 100);
		b2.dunkShoot();
	}

}

