package ch08;

public class NumberPrinter {

	private int id;
	// private int waitNumber;
	public static int waitNumber; // new하기 전에 상수 메모리 영역에 뜨기 때문에 굳이 객체를 만들기 전에 사용할 수 있다.

	// 생성자는 맨 먼저 실행되고 한번만 수행이 된다.
	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}

	// 번호표를 출력합니다.
	public void printWaitNumber() {
		System.out.println(" 대기 순번  " + waitNumber);
		waitNumber++;
	}

}
