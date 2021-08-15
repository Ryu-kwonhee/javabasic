package collection01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {
	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 출력하도록 만들어주세요.
		// ArrayList의 정렬은  .sort()대신
		// Collections.sort(리스트);를 이용해 정렬합니다.
		Random random = new Random();
		List<Integer>list = new ArrayList<>();
		List<Integer>list2 = new ArrayList<>();
		
		while(list.size() != 6) {
			int lotto = random.nextInt(44)+1;
			if (!list.contains(lotto)) {
				list.add(lotto);
			} 
		}
		Collections.sort(list);
		System.out.println("추첨번호 : "+ list);
		int lotto2 = random.nextInt(44)+1;
		while (!list.contains(lotto2)&&list2.size() == 1) {
			list2.add(lotto2);
		}
		System.out.println("2등당첨번호 : "+ list2);
	}
}
