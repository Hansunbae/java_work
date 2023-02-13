package ch03;

public interface Calc {

	public abstract int add(int n1, int n2);

	public abstract int substract(int n1, int n2);

	public abstract int times(int n1, int n2);

	public abstract double devide(int n1, int n2);

	// 코드 테스트
	public static void main(String[] args) {
		Calc calc = new CompleteCalc();

		if (calc instanceof CompleteCalc) { // showInfo 호출하기 위해 다운캐스팅
			((CompleteCalc) calc).showInfo();
		}
	}

}
