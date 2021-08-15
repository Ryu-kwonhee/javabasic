package exception02;

public class TryCatch02 {
	public static void main(String[] args) {
		/*
		 * 아까 exception 패키지 내부의 여러 예외 유형 중
		 * 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		 * 발생할 예외에 대한 처리는 try~catch블록을 활용합니다.
		 */
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for (int a : arr) {
				System.out.println("범위에 들어갑니다.");
				System.out.println(arr[10]);
			}
		} catch (Exception e){
			System.out.println("범위 안에 들어가지 않습니다.");
		} 
		System.out.println("코드 끝!");
	}
}
