package ch08;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		// 배열 선언과 동시에 초기화하기
		// int[] arr = new int[10];
		int[] arr = { 1, 2, 3, 4, 5 }; // length - 5, index -4

		try {
			for (int i = 0; i < 10; i++) { // 예외처리 확인하여 catch문으로 던짐
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // 예외 처리하여 프로그램 종료가 안됨
			System.out.println("개발자야 인데스 길이 모르니");
		}
		System.out.println("비정상 종료되지 않았습니다.");

	} // end of main
} // end of class
