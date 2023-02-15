package ch08;

public class MainTest2 {
	public static void main(String[] args) {
		// 예외 처리 구문 작성
		// 10 / 0 연산 시키고 예외 처리까지 작성해 주세요
		// 1. try
		try {
			int n1 = 10 / 0;
		} catch (Exception e) {
			System.out.println("0으로 나누기는 불가능합니다.");

		}
		// 2. 클래스 설계 throws 활용
		calculator calculator = new calculator();
		try {
			calculator.cal(10, 0);
			System.out.println(calculator.n);
		} catch (Exception e1) {
			System.out.println("0으로 나누는 메서드는 불가능 합니다.");
			e1.printStackTrace();
		}
	}
}

// throws는 클래스 설계
class calculator {
	int n;

	public void cal(int a, int b) throws Exception {
		this.n = a / b;
	}

}