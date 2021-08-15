package system01;

public class TImeCheck02 {
	public static void main(String[] args) {
		// tryCatch 구문의 소요시간을 구해주세요.
		// 여러분들이 직접 원하는 종류의 예외를 발생시켜주세요.
		
		int[] number = new int[200000000];
		
		long start =System.currentTimeMillis();
		System.out.println(start);
		long all = 0;
		try {
			for(int i = 0; i <8; i++) {
				System.out.println(number[i]);
				all += i;
			}
			System.out.println(number[1] / number[32]);
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("범위를 벗어났습니다.");
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			System.out.println("이외의 예외 발생!");
		} finally {
			System.out.println("코드를 종료합니다.");
		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(end - start);
	}
}
