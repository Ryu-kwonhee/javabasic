package interface01;

public class Ship implements Vehicle{
	private String name;
	private int speed;
	private int fuel;
	private int MAX_SPEED;
	private int MIN_SPEED;
	
	public Ship() {
		this.MAX_SPEED = 300;
		this.MIN_SPEED = 0;
		this.name = "CODING호";
		this.speed = 0;
		this.fuel = 100;
	}

	@Override
	public void accel() {
		if (speed >= MAX_SPEED) {
			speed = MAX_SPEED;
			System.out.println("최대속도 입니다."+ MAX_SPEED+"km/h");
		}else {
			speed += 15;
			System.out.println("가속중..."+ speed + "km/h");
		}
		if(fuel <= 0) {
			fuel = 0;
			System.out.println("연료가 부족합니다.");
			return;
		} else {
			fuel -= 10;
		}
		
	}

	@Override
	public void breakSpeed() {
		if (speed <= MIN_SPEED) {
			speed = MIN_SPEED;
		} else {
			speed -= 10;
		}
		System.out.println("감속..."+ speed + "km/h");
	}

	@Override
	public void reFuel() {
		if (fuel >= MAX_GAS) {
			fuel = MAX_GAS;
			System.out.println("연료가 가득 찼습니다.");
		} else {
			fuel += 30;
			System.out.println("주유중..."+ fuel);
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("배 : "+ name);
		System.out.println("현재 속도 : "+ speed +"km/h");
		System.out.println("연료량 : "+ fuel);
		System.out.println("------------------------");
		
	}
	
}
