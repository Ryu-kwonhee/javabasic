package constructor;

public class Car {
	/*
	 * 자동차 속성(변수)
	 */
	public int gas;
	public int speed;
	public String owner;
	
	/*
	 * 자동차 생성자(New 키워드로 자동차 생성시 실행될 메서드)
	 * 리턴 타입은 기입하지 않습니다.
	 * 클래스 이름인 Car로 메서드 명을 정합니다.
	 * 생성시 자동으로 호출되기 때문에 무시하고 넘어갈 수 없습니다.
	 */
	public Car(int g, int s, String o) {
		// 입력받은 정보를 변수에 대입.
		gas = g;
		speed = s;
		owner = o;
		System.out.println("자동차 생성 완료!");
		System.out.println("연료 : "+ gas + 
						   ", 속도 : "+ speed + 
						   ", 주인 : "+ owner);
	}
	
	// 자동차 동작 추가하기
	public void getInfo() {
		System.out.println("현재 연료량 : " + gas);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 주인 : " + owner);
		System.out.println("------------------");
	}
	// 자동차 운전 기능 추가하기
	public void accelSpeed() {
		gas -= 2;
		speed += 10;
		getInfo();
	}
	// 자동차 브레이크 기능 추가하기
	 public void breakspeed() {
		 speed -= 10;
		 getInfo();
	 } // 동사 - 메서드, 변수 - 명사
}
