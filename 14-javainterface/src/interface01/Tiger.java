package interface01;

public class Tiger implements Animal {
	private String name;
	private int eat;
	private int health;
	private int speed;

	
	
	public Tiger() {
		this.name = "호랑이";
		this.eat = 0;
		this.speed = 0;
		this.health = 10;
		
	}


	@Override
	public void eat() {
		if (eat >= FULL) {
			eat = FULL;
			System.out.println("배부름..."+ eat);
		} else {
			eat += 20;
			System.out.println("먹는중..."+ eat);
		}
		
	}


	@Override
	public void rest() {
		if (health >= 10) {
			health = 10;
			System.out.println("활력이 넘친다..."+health);
		}else {
			health += 2;
			System.out.println("쉬는 중..."+health);
		}
		
	}


	@Override
	public void run() {
		if (speed >= 10) {
			speed = 10;
			System.out.println("전력질주..."+ speed);
		} else {
			System.out.println("뛰는 중..."+speed);
			speed += 2;
		}
		if (health <= 0) {
			health = 0;
			System.out.println("탈진..."+ health);
		} else {
			health -= 2;
		}
	}


	@Override
	public void stop() {
		if(speed <= 0) {
			speed = 0;
		} else {
			speed -= 1;
			System.out.println(speed);
		}
		
	}
	public void showStatus() {
		System.out.println("이름 : "+name);
		System.out.println("배고픔 : "+eat);
		System.out.println("체력 : "+health);
		System.out.println("속도 : "+speed);
	}
}
