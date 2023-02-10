package ch08;

public class CompanyMainTest {

	public static void main(String[] args) {
		// Company company = new CompanyMainTest() 사용불가
		// 생성자에 접근 안하고 메소드로 객체 생성
		// 데이터 타입 class명으로 변수 선언
		Company company = Company.getInstance();
		System.out.println(company);
		// ch08.Company@7c30a502
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		System.out.println(company2);
		System.out.println(company3);
	} // end of main
}
