package ex11;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		// 부모 클래스에 사용자 정의 생성자가 있다면
		// 부모 생성자를 반드시 호출 하여야 한다.
		// System.out.println("11111111111111"); // <--- 오류 발생 , 부모 정의 생성자가 있으면 먼저 호출 해
		// 주어야 한다.
		super(name, hp); // super 키워드는 부모 생성자를 호출하는 녀석이다.
		System.out.println("Warrior 생성자 마지막 줄 코드");
	}

	// 콤보어택
	void comboAttack() {
		System.out.println(this.name + "가 2단 공격을 합니다.");
		// System.out.println(super.name +"가 2단 공격을 합니다."); // 모두 같음
		// System.out.println(name +"가 2단 공격을 합니다.");
	}
	
	//	void comboAttack(String name) {            <-------------메소드 오버로딩
	//		System.out.println(this.name + "가 2단 공격을 합니다.");
	//	
	//	}

	public static void main(String[] args) {
		Warrior warrior = new Warrior("야스오", 100);
		warrior.comboAttack();
	}

	// 메서드 오버로딩
	// System.out.println 이다.
	// System.out.println // 어떤 데이터 타입을 담을지 미리 설계 되어있다.
}
