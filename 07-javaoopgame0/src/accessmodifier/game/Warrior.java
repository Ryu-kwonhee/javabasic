package accessmodifier.game;

public class Warrior extends Commoner {
	
	public void getInfo() {
		
		System.out.println("아이디 : "+ getid("파워전사"));
		System.out.println("레벨 : "+ getlevel());
		System.out.println("경험치 : "+ getexp());
		System.out.println("체력 : "+ gethp());
		System.out.println("마나 : "+ getmp());
		System.out.println("-----------------");
		
	

	}

	public void hunt() {
		  
		  if (gethp() == 0) {
			  sethp(0);
			  System.out.println("사망하였습니다.");
			  System.out.println("체력 : "+ gethp());
			  return;
		  }	 else {
			  sethp(gethp()-2);
			  setexp(getexp() + 10); 
		  }	
	  
	  
		System.out.println("사냥을 시작했습니다.");
		System.out.println("사냥 결과 : 체력은 "+ gethp() +"입니다.");
		System.out.println("경험치는 " + getmp() + "입니다.");
		System.out.println("------------------");
	}
	public void doubleAttack() {
		
		if (getmp()-2 <= 0) {
			   setmp(0);
			System.out.println("마나가 부족합니다.");
			System.out.println("마나 : "+ getmp());
		} else {
			setmp(getmp()-2);
			
			setexp(getexp()+15);
			System.out.println("더블 어택!!!");
			System.out.println("마나 : "+ getmp());
			System.out.println("경험치 : " + getexp());
		}
		System.out.println("----------------");
		
	}
}

