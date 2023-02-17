package ch02;

public class LottoTest1 {
	public static void main(String[] args) {

		int[] arr1 = new int[6];
		LottoProgram lottoProgram = new LottoProgram();

		arr1 = lottoProgram.randomNumber();

		System.out.println("로또 번호 추첨");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
