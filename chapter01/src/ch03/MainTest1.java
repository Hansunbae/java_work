package ch03;

public class MainTest1 {

	public static void main(String[] arg) {

		char myA = 'A'; // char 2byte
		char yourA = 'a';
		System.out.println((int) myA);
		System.out.println((int) yourA);
		System.out.println("==================");
		System.out.println((short) myA); // short 2byte // 같은 크기라도 형변환을 명시해야함

		// 대입 연산자 (=), 연산에 방향은 오른쪽에서 왼쪽으로 연산이 된다
		int number = 10;
		// 변수에 변수를 대입할 수 있다.
		int number2 = number;
		System.out.println(number2);

		// 부호 연산자(+,-)

		System.out.println("---------------테스트");
		System.out.println(-number);

		System.out.println(number); // 이 때는 -10이 아닌 여전히 10
		// 부호 연산자는 부호를 변경하는 연산자이다.
		// 단, 변수에 있는 실제값을 변경한 상태는 아니다. 즉 데이터상에 초기변수값이 영구히 -로 변하는 것이 아니다
		// 실제 값을 변경하려면 대입 연산자를 사용하면 된다.

		number = -number; // 이렇게 했을 때 데이터가 영구히 -로 바뀜
		System.out.println(number);

	}
}
