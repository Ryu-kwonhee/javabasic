package polymorphism.game;

public class Main2 {
	public static void main(String[] args) {
		Monster2 orc = new Orc();
		Monster2 Bigfoot = new Bigfoot();
		Monster2 Boss = new Boss();
		//Monster2 mon2 = new Monster2(); 추상화시킴
		Magician mag = new Magician();
		
		mag.hunt(orc);
		mag.hunt(orc);
		mag.hunt(orc);
		mag.showStatus();
		mag.hunt(orc);
		mag.hunt(orc);
		mag.showStatus();
		mag.hunt(orc);
		mag.hpUp();
		mag.hpUp();
		mag.hpUp();
		mag.hpUp();
		mag.showStatus();
		mag.hunt(orc);
		mag.hpUp();
		mag.hunt(orc);
		mag.showStatus();
		mag.hpUp();
		mag.hunt(orc);
		mag.hunt(orc);
		mag.showStatus();
		mag.hpUp();
		mag.thunderVolt(orc);
		mag.thunderVolt(orc);
		mag.hpUp();
		mag.thunderVolt(orc);
		mag.hpUp();
		mag.thunderVolt(orc);
		mag.mpUp();
		mag.mpUp();
		mag.thunderVolt(orc);
		mag.thunderVolt(orc);
		mag.mpUp();
		mag.thunderVolt(orc);
		mag.mpUp();
		
//		mag.hunt(Bigfoot);
//		mag.hpUp();
//		mag.hunt(Bigfoot);
//		mag.hpUp();
//		mag.hunt(Bigfoot);
//		mag.showStatus();
//		mag.hunt(Bigfoot);
//		mag.hpUp();
//		mag.hunt(Bigfoot);
//		mag.showStatus();
//		mag.hunt(Bigfoot);
//		mag.showStatus();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hunt(Bigfoot);
//		mag.hunt(Bigfoot);
//		mag.hpUp();
//		mag.showStatus();
//		mag.hunt(Bigfoot);
//		mag.hpUp();
//		mag.hpUp();
//		mag.hunt(Bigfoot);
//		mag.showStatus();
//		mag.thunderVolt(Bigfoot);
//		mag.hpUp();
//		mag.thunderVolt(Bigfoot);
//		mag.thunderVolt(Bigfoot);
//		mag.thunderVolt(Bigfoot);
//		mag.thunderVolt(Bigfoot);
//		mag.thunderVolt(Bigfoot);
//		mag.thunderVolt(Bigfoot);
		
//		mag.hunt(Boss);
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hunt(Boss);
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hunt(Boss);
//		mag.showStatus();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();mag.hunt(Boss);
//		mag.hunt(Boss);
//		mag.showStatus();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();mag.hunt(Boss);
//		mag.showStatus();
//		mag.hunt(Boss);
//		mag.hunt(Boss);
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();mag.hunt(Boss);
//		mag.hunt(Boss);
//		mag.showStatus();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();
//		mag.hpUp();mag.thunderVolt(Boss);
//		mag.thunderVolt(Boss);
//		mag.thunderVolt(Boss);
//		mag.thunderVolt(Boss);
//		mag.thunderVolt(Boss);
//		mag.thunderVolt(Boss);
//		mag.thunderVolt(Boss);
		
		
		
	}
}
