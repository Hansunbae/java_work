package ch02;

import java.util.Arrays;
import java.util.Random;

public class LottoProgram {

	public int[] randomNumber() {
		final int arrNum = 6;

		Random random = new Random();
		int[] arr = new int[arrNum];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		return arr;
	}

} // end of class
