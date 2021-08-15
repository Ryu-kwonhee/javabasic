import java.util.Scanner;

public class Scanner03 {
	public static void main(String[] args) {
		/*
		 * 환율 계산기를 만들어보겠습니다.
		 * 네이버에 검색해서 원하는 국가 화폐의 환율을
		 * rate 변수에 저장해주세요
		 * 스캐너를 이용해서 won변수에 원화 금액을 입력해주세요
		 * 원화와 환율을 이용해서
		 * 원화 xxx원을 환전시 xxxx(화폐)입니다.로
		 * 결과물을 출력해주세요
		 */
		Scanner scan = new Scanner(System.in);
		double rate = 1355.29;
		System.out.println("유로의 환율은 "+ rate +"입니다.");
		System.out.println("원화를 입력해주세요.");
		int won = scan.nextInt();
		
		System.out.printf("원화로 %d원을 유로로 환전 시", won);
		System.out.println(Math.round(won * rate) + "€입니다.");
		System.out.print("1234//////");
		System.out.printf("%.0f", won/rate);
		scan.close();
		
	}

}
