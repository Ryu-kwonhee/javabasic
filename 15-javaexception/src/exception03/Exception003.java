package exception03;

public class Exception003 {
	public static void main(String[] args) {
		/*
		 * 다중 catch는 블럭 내부에서 여러유형의 예외가 발생할 수 있을때
		 * 각각 예외유형을 다르게 처리할 떄 사용합니다.
		 * 이 때 catch 구문을 여러 번 사용할 수 있습니다. 
		 */
		int[] number = {1, 2, 3, 4, 5, 6, 7, 0};
		
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println(number[i]);
			}
			System.out.println(number[3] / number[7]);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("범위를 벗어났습니다.");
		} catch (ArithmeticException ar){
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("이외의 예외가 발생했습니다.");
		}finally {
			System.out.println("끝!");
		}
	}
}
