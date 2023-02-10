package ch06;

public class Hero {
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die; // boolean -- get, set -- > is라 쓰는게 일반적이다.

	// getter 메서드 직접 만들어 보세요 .5개
	public String getName() {
		return this.name;
	}

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
		this.name = name;
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
