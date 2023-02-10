package ch05;

import java.util.Scanner;

public class HanTest {

	public static void main(String[] args) {
		Student st1 = new Student("한범진 ", 100_000);
		Train train1 = new Train("무궁화", 123, 0, 0);
		Train train2 = new Train("KTX", 345, 0, 0);
		String exit = "나가기";
		String name;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("어떤 기차를 타시겠습니까?");
			name = scanner.nextLine();
			if (name.equals("무궁화호") ) {
				st1.takeTrain(train1);
				System.out.println("무궁화호를 선택하셨습니다.");
			} else if (name.equals("KTX")) {
				st1.takeTrain(train2);
				System.out.println("KTX를 선택하셨습니다.");
			}

		} while (!name.equals("무궁화호") && !name.equals("KTX"));

	} // end of main

} // end of class
