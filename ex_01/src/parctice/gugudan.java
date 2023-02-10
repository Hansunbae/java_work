package parctice;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;

		System.out.println("시작 숫자를 입력해 주세요");
		n1 = scanner.nextInt();
		System.out.println("끝 숫자를 입력해 주세요");
		n2 = scanner.nextInt();
		int step;

		for (step = 2; n1 <= n2; n1++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(n1 + "*" + j + "=" + (n1 * j));
			}
		}
	}
}
