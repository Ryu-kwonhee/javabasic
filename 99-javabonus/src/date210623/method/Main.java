package date210623.method;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person(10000, 0);
		
		// 과일을 하나 사고 돈을 1000원 차감하는 setter
		// setter 특성상 돈이 0이면 구매시도를 해도 구매가 이뤄지지않음.
		p1.buyFruits();
		
		// 수치값을 넣어주는 setter
		// 집어넣은 값을 그대로 money로 만들어줌
		p1.setMoney(1000);
		p1.buyFruits();
		p1.buyFruits();
		
	}
}
