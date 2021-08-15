package date01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
	public static void main(String[] args) {
		// Date는 날짜를 표현하는 클래스로 DB등과 통신할때 Date를 이용해
		// 날짜자료를 받아오거나 넘겨주는 것이 권장됩니다.
		// 사용 시 import를 해야함
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(strNow);
		
		// 표현되는 양식을 바꿀때는 SimpleDateFormat을 활용합니다.
		// import가 필요합니다. ctrl + space를 활용해주세요.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// 월은 분과의 차이를 두기 위해 대문자로 표시
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
													 
	}
}
