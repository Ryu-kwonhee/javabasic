package stringbuilder01;

public class Builder03 {
	public static void main(String[] args) {
		// Delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제합니다.
		// Delete(시작 인덱스, 끝 인덱스)를 입력하면
		// 시작지점부터 끝지점 사이를 삭제해줍니다.
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		a.delete(3,  10);// 시작숫자부터 끝 숫자 직전까지 삭제
		System.out.println(a);
	}
}
