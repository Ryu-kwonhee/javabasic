package accessmodifier03;

import accessmodifier02.Parent;// 패키지가 다르면 import해야함.

/*
 * Child02는 accessmodifier03 패키지 소속
 * Parent는 accessmodifier02 패키지 소속으로
 * 부모 자식간 클래스 소속이 다르다.
 */
public class Child02 extends Parent {
	protected int e;
	
	// Child02의 getB메서드는 Parent의 b에 접근합니다.
	// getB()와 같이 내부 요소를 조회만 할 수 있고
	// 수정은 할 수 없게 제한하는 메서드를
	// getter라고 합니다.
	public void getB() {
		System.out.println(b);
	}
	public void setB(int b) {
		// setter는 사용자의 선택폭을 제한할때 씁니다.
		if (b >= 0) {
			this.b = b;
		} 
		// b변수의 값을 변경할 수 있도록 도와주는
		// setB(int) 메서드를 작성해보세요.
		// b값은 음수가 될 수 없습니다.
	}
	
	// getter는 위의 getB()처럼 특정변수의 수치를
	// 콘솔에 찍어주는 유형도 있지만
	// 좀 더 많이 사용하는 유형은 해당 변수의 값을
	// return 구문을 이용해 호출위치로 가져다 두는 형태를 더 많이 씁니다.
	// int를 리턴자료로 가지는 getBInt()를 추가로 아래에 작성해주세요.
	// Main02에서 getBInt()를 이용해 조회한 값을 콘솔에 출력해주세요.
	public int getBInt() {
		return this.b;
	}
	
}
