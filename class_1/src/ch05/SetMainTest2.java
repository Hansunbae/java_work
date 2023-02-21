package ch05;

import java.util.HashSet;
import java.util.Random;

public class SetMainTest2 {

	public static void main(String[] args) {

		HashSet<Integer> numberSet = new HashSet<>();
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		System.out.println(numberSet.size());
//		System.out.println(numberSet.toString());

		// 무조건 6개 사이즈를 가지는 numberSet 구성하시오
		// hint --> 반복문 사용

		// 중복값 확인 equals와 hashcode 함수를 재정의 하는 방법
		int count = 0;
		while (numberSet.size() != 6) {
			count++;
			numberSet.add(getRandomNumber());
		}
		System.out.println(numberSet.toString());
		System.out.println("반복 횟수 : " + count);

	} // end of main

	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	}

} // end of class
