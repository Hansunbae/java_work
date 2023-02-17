package parctice;

import java.util.Random;

public class LottoMiddleTest {

	public static void main(String[] args) {
		final int num = 6;
		Random random = new Random();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 숫자는 : " + arr[i]);
		}

	} // end of main

} // end fo class
