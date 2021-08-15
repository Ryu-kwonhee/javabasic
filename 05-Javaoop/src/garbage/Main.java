package garbage;

public class Main {
	public static void main(String[] args) {
		Item i1 = new Item(1);
		i1 = null;
		Item i2 = new Item(2);
		i2 = null;
		Item i3 = new Item(3);
		System.gc(); // 메모리 회수 명령, 스택과 힙 사이에 연결 상태에 따라 - 연결되어 있으면 정상, 안 되어 있으면 쓰레기 데이터로 취급함.
		Item i4 = new Item(4);
		i4 = null;
		Item i5 = new Item(5);
		System.gc();
		Item i6 = new Item(6);
	}

}
