package ch03;

public class MainTest2 {

	public static void main(String[] args) {

		// 산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		int number4 = (int) (5.0 / 4.0);
		// 강사님 최종 1.25아닌 1 왜? int(왼쪽) 에는 부합 하지만 int형에는 소수점 뒤자리를 버리기에 버리고 대입

		// int number4 = 5 / 4;
		// 1.25가 아닌 1 왜? 값이 int타입에는 부합하나 int(왼쪽)는 정수만 들어가기 때문에 소수점을 버리고 대입

		// int number4 = 5.0 / 4.0;
		// 오류 왜? 오른쪽 값이 정수가 아니라 기본 int(왼쪽) Type에 부합하지 않아 오류발생

		// int number4 = (double)5.0 / (double)4.0;
		// 오류 왜? int(왼쪽) 타입에 부합하지 않아 오류 발생

		// double number4 = 5.0 / 4.0;
		// 1.25 왜? double 타입이니 실수형태라도 받아 들이고 연산 후 정상적으로 값을 대입

		// double number4 = (double)5.0 / (double)4.0;
		// 1.25 왜? double(왼쪽)에 부합하고 값도 소수점 아래까지 전부들어감

		int number5 = 5 % 3;

		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);// 1.66666
		System.out.println(number5);

		// 내가 혼자 한 부분
		// 3.6025641026
		// int num1 = (int)(28.1 / 7.8); // 3 계산하고 int
		int num1 = (int) 28.1 / (int) 7.8; // 4 int 먼저하고 계산
		// int num1 = (double)28.1 / 7.8;
		// int num1 = (double)(28.1 / 7.8);
		// int num1 = (double)28.1 / (double)7.8;
		System.out.println(num1);

		System.out.println("=========================한글 테스트");

		// 문제1
		// 1. (12 + 3) / 3 을 화면에 출력하시오
		System.out.println((12 + 3) / 3);
		// 2.(25 % 2) 값을 화면에 출력하시오
		System.out.println((25 % 2));
		// 3. 3.0 / 5 를 정수값 result 변수에 담아 주세요
		System.out.println((int) (3.0 / 5));// 0.6 자동으로 더블 형으로 바뀐
		int result = (int) (3.0 / 5);
		System.out.println(result);
	}
}
