package interaction.game;

public class Main {

	public static void main(String[] args) {
		
		Magician m1 = new Magician();
		Skeleton s1 = new Skeleton();
		m1.huntSkeleton(s1);
		m1.huntSkeleton(s1);
		m1.huntSkeleton(s1);
		m1.huntSkeleton(s1);
		m1.showStatus();
	}

}
