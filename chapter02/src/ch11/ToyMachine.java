package ch11;

import java.util.Random;
import java.util.Scanner;

import ch08.Company;

public class ToyMachine {

	static int randomNumber() {
		Random random = new Random();
		int resultNumber = random.nextInt(3) + 1;
		return resultNumber;
	}

	// main 코드의 시작점
	public static void main(String[] args) {

		// 기능 만들기
		// 랜덤 번호 1~3 중 하나 추출

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.println("1,  2,  3");
		int userInput = scanner.nextInt();
		Item item1 = new Doll();
		Item item2 = new Car();
		Item item3 = new Money();
		int random1 = randomNumber();
		int random2 = randomNumber();
		int random3 = randomNumber();

		Item[] arr = new Item[3];
		arr[0] = item1;
		arr[1] = item2;
		arr[2] = item3;

		String message1 = ((Money) item3).message;
		if (userInput < 4) {
			if (userInput == random1) {
				System.out.println(item1.name + "을 뽑으셨습니다.");
			} else if (userInput == random2) {
				System.out.println(item2.name + "을 뽑으셨습니다.");
			} else if (userInput == random3) {
				System.out.println(message1 + item3.name + "을 뽑으셨습니다.");
			} else {
				System.out.println("꽝 다시 돈을 넣고 뽑기 버튼을 눌러주세요");
			}

		} else {
			System.out.println("처음부터 다시");
		}

	} // end

}

class Item {
	String name;
	int price;
}

class Doll extends Item {
	public Doll() {
		name = "우디 ";
		price = 10000;
	}

	public static Doll doll;

	public static Doll getInstance() { // 싱글톤 패턴의 이름짓는 법 . getInstance
		// 4. 코드 구현하기
		if (doll == null) {
			doll = new Doll(); // ()는 생성자
		}
		return doll; // return 한다 새로 생성된 company 객체를
	}
}

class Car extends Item {
	public Car() {
		name = " 람보르기니 피규어 ";
		price = 30000;
	}
}

class Money extends Item {
	String message;

	public Money() {
		name = " 현금 ";
		price = 100_000;
		message = "축하합니다 1등상 입니다.";
	}
}
