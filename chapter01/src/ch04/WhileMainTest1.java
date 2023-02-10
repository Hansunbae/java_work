package ch04;

public class WhileMainTest1 {
	// 메인 작업자
	public static void main(String[] args) {

		// 1~ 1000 연산 코드
		int num = 1;
		int sum = 0;
		int userinput = 345;

		while (num <= userinput) {
			System.out.println("현재값 :" + num); // 무한 루프에 조심
			// sum = sum + num;
			sum += num;
			num++;
		}
		;

		System.out.println("연산에 대한 결과값은 :" + sum + "입니다");
	} // end of main

} // end of class
