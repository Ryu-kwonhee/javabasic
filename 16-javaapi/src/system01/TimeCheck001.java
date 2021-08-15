package system01;

public class TimeCheck001 {
	public static void main(String[] args) {
		// 시작지점
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		long all = 0;
		
		for (int i = 0; i < 2000000000; i++) {
			all += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		// 소요시간 
		System.out.println(end - start);
	}
}
