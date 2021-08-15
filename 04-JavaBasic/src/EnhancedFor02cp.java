
public class EnhancedFor02cp {
	public static void main(String[] args) {
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int sum = 0;
		for (int a = 0; a < math.length; a++) {
		sum += math[a];
		}
		System.out.println("수학 평균 : " + sum/math.length);
		
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int sum2 = 0;
		for (int b = 0; b < eng.length; b++) {
			sum2 += eng[b];
		}
		System.out.println("영어 평균 : " + sum2/eng.length);
		
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		int sum3 = 0;
		for (int c = 0; c < com.length; c++) {
			sum3 += com[c];
		}
		System.out.println("컴퓨터 평균 : " + sum3/com.length);
		
	}

}
