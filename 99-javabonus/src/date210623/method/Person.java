package date210623.method;

public class Person {
	private int money;
	private int fruits;
	
	public Person(int money, int fruits) {
		this.money = money;
		this.fruits = fruits;
	}
	
	public void buyFruits() {
		if (money <= 0) {
			System.out.println("과일을 살 수 없습니다.");
		} else {
			this.fruits += 1;
			this.money -= 1000;
		}
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}
