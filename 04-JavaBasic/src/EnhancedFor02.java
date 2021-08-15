
public class EnhancedFor02 {
	public static void main(String[] args) {
		/*
		 * 다음은 학생들의 과목별 성적입니다.
		 * math = 96, 23, 52, 82, 72, 31, 58
		 * eng = 62, 42, 68, 31, 80, 77, 45
		 * com = 10, 28, 39, 74, 65, 90, 98
		 * 위 3개의 명칭으로 array를 만들어 담아주신 다음
		 * 과목별 평균점수를 enhanced for문을 이용해 구한 다음
		 * 출력
		 */
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int sum;
		sum = 0;
		
		for (int m: math) {
			sum += m;
		}
		
		System.out.println("수학 평균 : " + sum/math.length);
		
		int sum1 = 0;
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		for (int e: eng) {
			sum1 += e;
		}
		
		System.out.println("영어 평균 : " + sum1/eng.length);
		
		int sum2 = 0;
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		for (int c: com) {
			sum2 += c;
		}
		
		System.out.println("컴퓨터 평균 : " + sum2/com.length);
		
	}

}
