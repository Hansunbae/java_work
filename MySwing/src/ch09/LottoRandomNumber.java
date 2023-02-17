package ch09;

import java.util.Arrays;
import java.util.Random;

// 기능
// 랜덤 번호 발생하는 클래스 1 ~ 45
// set, set
// 6개 번호를 리턴하는 기능, 정렬까지 책임
public class LottoRandomNumber  {

	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int ranNum = r.nextInt(45)+ 1;
			lotto[i] = ranNum;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i = i - 1;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}

}
