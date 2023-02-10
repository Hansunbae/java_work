package ch10;

public class Hero {
	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void attack() {
		System.out.println("공격");
	}

	// 메인 함수
	public static void main(String[] args) {
		Hero hero1 = new Hero("기본", 0);
		Warrior warrior1 = new Warrior("올라프", 100);
		Archer archer = new Archer("애쉬", 100);
		Wizard wizard = new Wizard("간달프", 100);
		
		
		warrior1.comboAttack();
		archer.fireArrow();
		wizard.freezing();
		
		System.out.println("----------------------");
		
		System.out.println(warrior1.name);
		System.out.println(archer.name);
		System.out.println(wizard.name);

		
	}

}

// 전사 클래스
class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboAttack() {
		System.out.println("쌍도끼 공격");
	}
}

// 아쳐 클래스
class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {
		System.out.println("불화살 공격");
	}
}

// 위자드 클래스
class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);

	}

	public void freezing() {
		System.out.println("콜드빔");
	}

}
