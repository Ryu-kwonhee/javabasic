package constructor;
 
public class BasketBallPlayer {
	// 선수 속성(변수)
	public String name;
	public int height;
	public int jump;
	// 선수 생성자 
	public BasketBallPlayer(String n, int h, int j) {
		name = n;
		height = h;
		jump = j;
		System.out.println("선수 생성 완료!");
	}
	// 선수 동작 
	public void getPlayerInfo() {
		if (height >= 200) {
			System.out.println("선수 : " + name);
		} else {
			System.out.println("선수 : " + name);
		}
		System.out.println("키 : " + height);
		System.out.println("점프력 : " + jump);
		if (height + jump >= 300) {
			System.out.println("덩크슛에 성공했습니다.");
		} else {
			System.out.println("골대에 닿지 않았습니다.");
		}
		
	}
	// 슛 기능 
	public void dunkShoot() {
		getPlayerInfo();
	}
}
