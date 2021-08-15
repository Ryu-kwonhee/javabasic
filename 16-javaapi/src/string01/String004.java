package string01;

public class String004 {
	public static void main(String[] args) {
		String name = "김수한무 거북이와 두루미 삼천갑자 동방삭";
		System.out.println(name.length());
		
		String report = "안녕하세요. 저는 리포트 보고자는 김영수, 김영수 입니다.";
		report = report.replace("김영수", "류권희");
		System.out.println(report);
	}
}
