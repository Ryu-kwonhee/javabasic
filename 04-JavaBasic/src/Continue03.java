
public class Continue03 {
	public static void main(String[] args) {
		/*
		 * 다음은 학생들의 과목별 성적입니다.
		 * math = 96, 23, 52, 82, 72, 31, 58
		 * eng = 62, 42, 68, 31, 80, 77, 45
		 * com = 10, 28, 39, 74, 65, 90, 98
		 * 각 과목별 평균점수를 내주시되, 합격자 평균만 내주세요.
		 * 합격 점수는 60점 이상입니다.
		 */
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int sum = 0;
		int passCount = 0;
		for (int m: math) {
			if (m < 60) {
				continue;
			} else {
				passCount++;
				sum += m;
			}
		}
		System.out.println("수학 평균 : " + sum/passCount++);
		
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int sum1 = 0;
		int passCount2 = 0;
		for (int e: eng) {
			if (e < 60) {
				continue;
			} else {
				passCount2++;
				sum1 += e;
			}
		}
		System.out.println("영어 평균 : " + sum1/passCount2++);
		
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		int sum2 = 0;
		int passCount3 = 0;
		for (int c: com) {
			if (c < 60) {
				continue;
			} else {
				passCount3++;
				sum2 += c;
			}
		}
		System.out.println("컴퓨터 평균 : " + sum2/passCount3++);
				
	}

}
