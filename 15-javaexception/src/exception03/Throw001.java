package exception03;

public class Throw001 {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 10);
		
		try {
			if (i > 3) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				System.out.println("정상 난수 발생");
			}
		} catch (Exception e) {
			System.out.println("없는 예외를 만들었습니다.");
			 e.printStackTrace();
		} finally {
			System.out.println("코드 끝!");
		}
	}
}
