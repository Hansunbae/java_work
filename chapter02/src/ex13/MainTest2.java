package ex13;

public class MainTest2 {

	public static void main(String[] args) {
		// 2
		int[] myNumbers = new int[10];
		myNumbers[0] = 10;
		myNumbers[1] = 4;
		myNumbers[2] = 100;
		myNumbers[3] = 23;
		myNumbers[4] = 51;
		myNumbers[5] = 1;
		myNumbers[6] = 6;
		myNumbers[7] = 88;
		myNumbers[8] = 42;
		myNumbers[9] = 31;

		// 1. 전에 넣은 수보다 큰수를 다음 배열에 넣게 해야한다. 이전수와 현재수 변수를 미리 만들까
		// 비교해야 할 것은 배열에 들어있는 숫자다
		// 2. 배열 전체를 한 번 반복하면서 배열에 오름차순으로 넣는다.
		int min = 0;
		for (int i = 0; i < myNumbers.length; i++) {

			for (int j = 1; j < myNumbers.length; j++) {
				if (myNumbers[i] > myNumbers[j]) {
					int box= 0;
					box = myNumbers[j];
				}
			}
		}

//		int prvnum;
//		int nextnum = 1;
//		boolean flag = true;
//
//		for (int i = 0; i < 8; i++) { // 0~9
//			
//		
//				if (myNumbers[i] < myNumbers[nextnum]) {
//					int box1 = myNumbers[nextnum];
//					myNumbers[i] = myNumbers[nextnum];
//				}
//				nextnum++;
//
//		} // end of for
//
//		 while (flag) {
//			int nownum = 1;
//			System.out.println(myNumbers[nownum]);
//			if (nownum == 10) {
//				flag = false;
//				nownum++;
//			}
//		}
		System.out.println(myNumbers[0]);
		System.out.println(myNumbers[1]);
		System.out.println(myNumbers[2]);
		System.out.println(myNumbers[3]);
		System.out.println(myNumbers[4]);
		System.out.println(myNumbers[5]);
		System.out.println(myNumbers[6]);
		System.out.println(myNumbers[7]);
		System.out.println(myNumbers[8]);
		System.out.println(myNumbers[9]);
		// 오름 차순으로 정렬 해주세요
		// for , if 문 활용

	}

}
