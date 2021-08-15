
public class DoWhile001 {
	public static void main(String[] args) {
		/*
		 * do ~ while문은 기본적으로 while문과 동일
		 * 그러나 첫 번째부분은 조건을 따지지않고 출력하고
		 * 두 번째부분부터 조건을 따짐
		 */
		int a = 1;
		
		do {// do구문을 먼저 씀
			a += 2;
			System.out.println("a가 5보다 작니??");
		} while (a < 5); 
			
		
	}

}
