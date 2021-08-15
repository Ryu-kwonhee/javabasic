package stringbuilder01;

public class Builder05 {
	public static void main(String[] args) {
		// 다음 문자열의 문자를 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		for (int i = 0; i < a.length(); i++) {
			if (i % 3 == 0) { // 0도 3으로 나누면 0이되니까 0번부터 삭제됨
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);
	}
}
