package ch06;
// 코린이들이 많이 하는 실수 !!

public class Hero2 {

	// 식을 바로 사용할 수 없다.
	// 메서드 선언을 중첩으로 할 수 없다.
	// 생성자에는 리턴타입 없다.(선언부)
	// 클래스 스코프 안에 사용할 수 있는 문법
	// 변수 사용
	// 생성자 사용 가능
	// 메서드 사용 가능
	// 함수 사용 가능
	// 내부 클래스 --> 추후 배울 예정

	// private String name= 1 * 2 + 10; // < --- 사용 불가--> 메소드 안이나 생성자 안에서 연산 가능
	private int hp;
	private int power;
	private double defense;
	private boolean die; // boolean -- get, set -- > is라 쓰는게 일반적이다.

	public String getName() {
		// 메서드 안에 메서드를 선언 할 수 없다. ----> 중괄호 범위를 잘 확인해야 한다.
		// public void printArticle() {
		//
		// }
		// return this.name;
		return null;
	}

	// 함수이다. -- > 클래스 스코프 범위 밖에는 문법을 작성할 수 없다.
	public static int addNumber(int n1, int n2) {
		return n1 + n2;
	}

	// getter 메서드 직접 만들어 보세요 .5개
	// public String getName() {
	// return this.name;
	// }

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public boolean getDie() {
		return this.die;
	}

	// setter 메서드 직접 만들어 보세요 . 5

	public void setName(String name) {
		if (name == null) {
			System.out.println(" 이름을 입력하지 않았습니다.");
			return; // 함수 종료문
		}
		// this.name = name;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			System.out.println(" 잘못된 hp를 입력하셨습니다.");
			return;
		}
		this.hp = hp;
	}

	public void setPower(int power) {
		if (power < 0) {
			System.out.println(" 잘못된 power를 입력하셨습니다.");
			return;
		}
		this.power = power;
	}

	public void setDefense(double defense) {
		if (defense < 0) {
			System.out.println(" 잘못된 defense를 입력하셨습니다.");
			return;
		}
		this.defense = defense;
	}

	public void setdie(boolean die) {
		this.die = die;
	}
	// 방어적 코드도 추가해 보세요

}
