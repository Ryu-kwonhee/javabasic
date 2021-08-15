package accessmodifier.game;

public class Hunter extends Commoner{
	public void getInfo() {
		
		System.out.println("아이디 : "+ getid("헌터x헌터"));
		System.out.println("레벨 : "+ getlevel());
		System.out.println("경험치 : "+ getexp());
		System.out.println("체력 : "+ gethp());
		System.out.println("마나 : "+ getmp());
		System.out.println("----------------");
	}
	public void hunt() {
		sethp(gethp()-2);
		setexp(getexp()+10);
		System.out.println("사냥을 시작합니다.");
		System.out.println("사냥 결과 : 체력은 "+gethp());
		System.out.println("경험치는 "+getexp());
		System.out.println("----------------");
	}
	public void doubleShot() {
		if (getmp() <= 0) {
			setmp(0);
			System.out.println("마나가 부족합니다.");
			System.out.println("마나 : "+ getmp());
			System.out.println("----------------");
		} else {
			setmp(getmp()-2);
			setexp(getexp()+15);
			System.out.println("더블 샷!!!");
			System.out.println("마나 : "+ getmp());
			System.out.println("경험치 : "+ getexp());
			System.out.println("----------------");
		}
	}
	public void exploreShot() {
		if (getmp() <= 0) {
			setmp(0);
			System.out.println("마나가 부족합니다.");
			System.out.println("마나 : "+ getmp());
			System.out.println("----------------");
		} else {
			setmp(getmp()-3);
			setexp(getexp()+20);
			System.out.println("익스플로어 샷!!!");
			System.out.println("마나 : "+ getmp());
			System.out.println("경험치 : "+ getexp());
			System.out.println("----------------");
		}
	}
}
