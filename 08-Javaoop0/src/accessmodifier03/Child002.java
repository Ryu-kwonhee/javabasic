package accessmodifier03;

import accessmodifier02.Parent001;

public class Child002 extends Parent001{
	protected int e;
	
	//getter는 변수의 값을 얻어오는데 사용하는 메서드, 수정은 할 수 없게 제한.
	public void getB() {
		System.out.println(b);
	}
	// setter는 변수 값을 변경시키는데 사용, 사용자의 선택폭을 제한할때 씁니다.
	public void setB(int b) {
		if (b >= 0) {
			this.b = b;
		} 
	}
	public int getBInt() {
		return this.b;
	}

}
