package inheritance;

public class Main02 {
	public static void main(String[] args) {
		Salaryman sal1 = new Salaryman();
		sal1.name = "아무개";
		sal1.age = 30;
		sal1.salary = 1000;
		
		Student st1 = new Student();
		st1.name = "김철수";
		st1.age = 23;
		st1.major = "화학";
		
		sal1.upSalary();
		sal1.upSalary();
		sal1.upSalary();
		sal1.upSalary();
		sal1.getSalaryInfo();
		System.out.println("-----------------");
		st1.getStudentInfo();
		
	}

}
