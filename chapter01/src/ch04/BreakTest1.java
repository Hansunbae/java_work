package ch04;

public class BreakTest1 {
	public static void main(String[] args) {
		// 중간에 멈추는 break 문

		for (int i = 1; i < 11; i++) {
			System.out.println("i:" + i);
			// 만약 i값이 소수 7이면 멈추어라 ! // 소수: 나누지 못하는 수
			if (i % 7 == 0) {
				break; // 중간에 멈추고 반복문 하나를 빠져 나옴
			}
		}
	}
}
