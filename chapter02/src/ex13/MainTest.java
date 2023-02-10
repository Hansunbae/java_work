package ex13;

import java.util.Random;
import java.util.Scanner;

import ch01.Student;

public class MainTest {

	public static void main(String[] args) {
		// 우리반 학생 이름들을 배열에 담아주세요
		// 랜덤 클래스를 사용해서
		// 한명을 추출해 주세요
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] student = new String[9];
		student[0] = "한범진";
		student[1] = "손주이";
		student[2] = "김효린";
		student[3] = "김민우";
		student[4] = "정다운";
		student[5] = "강민정";
		student[6] = "김유주";
		student[7] = "김미정";
		student[8] = "편용림";

		boolean flag = true;

		while (flag) {
			System.out.println("s버튼을 눌러 커피 사올 사람을 뽑자!");
			String who = scanner.nextLine();
			int randomNum = random.nextInt(9);

			if (who.equals("s")) {
				System.out.println(student[randomNum]);
			}
			if (!who.equals("s")) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}
		}
	} // end of main
} // end of class
