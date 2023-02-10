package ch08;

// 디자인 패턴
// 싱글톤 패턴 -- 객체 생성하는 코드에 사례
public class Company {
	// 1. 생성자를 private 선언한다. 외부에서는 생성자 사용불가
	private Company() {
	}

	// 2. private + static 자기 자신에 데이터 타입을 선언해 준다.
	private static Company company; // static 밖에서는 멤버변수에 접근 불가

	// 3. 외부에서 접근 가능한 static 메소드를 만들어 둔다.
	public static Company getInstance() { // 싱글톤 패턴의 이름짓는 법 . getInstance
		// 4. 코드 구현하기
		if (company == null) {
			company = new Company(); // ()는 생성자 
		}
		return company; // return 한다 새로 생성된 company 객체를 
	}
	
	// 내가 개인적으로 하는 연습 
	public static void main(String[] args) {
		Company company1 = getInstance();
		Company company2 = getInstance();
		System.out.println(company1); // ch08.Company@58ceff1 같은 힙메모리 영역을 공유함
		System.out.println(company2);  // ch08.Company@58ceff1
	}
	
	
}
