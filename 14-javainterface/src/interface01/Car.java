package interface01;

// 인터페이스를 구현(상속이 아님!) 하기 위해서는
// implements (extends가 아님!)키워드를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 구현해줘야 한다.
public class Car implements Vehicle {
	// 자동차라면 가져야하는 변수 설정
	// 현재속도, 현재연료량, 차주
	private String owner;
	private int speed;
	private int gas; 
	// 생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재속도 0, 연료량 100을 자동 대입해줍니다.
	
	public Car(String owner) {
		this.owner = owner;
		this.speed = 0;
		this.gas = MAX_GAS;
	}
	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록
		// 연료는 한 번 가속에 1씩 소비합니다.
		// 단, 속도는 200을 초과할 수 없습니다.
		if (speed + 10 > 200) {
			speed = 200;
		} else {
			speed += 10;
		}
		if (gas - 1 <= 0) {
			gas = 0;
			System.out.println("연료가 부족합니다.");
		} else
		gas -= 1;
		System.out.println("속도 : "+ speed);
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속시 속도가 10씩 줄어들게 해주세요.
		// 단, 속도는 0미만이 될 수 없습니다.
		if (speed - 10 <= 0) {
			speed = 0;
		} else {
			speed -= 10;
		}
		System.out.println("속도 : "+ speed);
	}

	@Override
	public void reFuel() {
		// 연료를 다시 채울경우 30씩 채워줍니다.
		// 단, 연료 최대값은 상수 MAX_GAS를 이용해서 측정해주세요.
		if (gas + 30 >= MAX_GAS) {
			gas = MAX_GAS;
			System.out.println("연료가 꽉 찼습니다.");
		} else {
			gas += 30;
			System.out.println("주유중...");
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("차주 : "+ owner); 
		System.out.println("속도 : "+ speed); 
		System.out.println("연료량 : "+ gas); 
		System.out.println("-------------");
	}

}
