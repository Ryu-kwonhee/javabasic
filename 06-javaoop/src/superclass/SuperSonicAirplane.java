package superclass;
// 초음속 비행기는 비행기를 상속합니다.
public class SuperSonicAirplane extends Airplane {
	// 초음속 비행기도 일반 비행기처럼 속도를 사용합니다.
	// 따라서 변수는 추가로 정의하지 않습니다.
	
	public SuperSonicAirplane(int s) {
		// Airplane의 생성자는 상속되지 않습니다.
		// 따라서 부모쪽의 생성자라는  의미로
		// super();를 사용하며 이 때 부모쪽에 넘겨줄 수치값도
		//함께 받아서 처리해줍니다.
		super(s);
		
		
		
	}
	
	
	public void fly() {
		// 일반 비행(부모클래스의 fly)는 super.fly();
		// 를 이용해서 호출 가능합니다.
		// 속도 900이하인 경우 일반 비행 모드를 호출하게 해주시고
		// 속도가 900이상 1300이하인 경우는 초음속 비행을
		// 호출하도록 로직을 만들어주세요.
		

		if (speed + 500 <= 900) {
			super.fly();// super는 한 단계 위 부모 클래스의 객체를 지정할 때 사용하는 키워드
		} else {
			if (speed + 500 >= 1300) {
				speed = 1300;
			} else {
				speed += 500;
			}
			System.out.println("초음속 비행중 : "+ speed);
		}
		
	}

}
