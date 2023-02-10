package ex11;

public class Hero {
	// protected -> 자식 클래스에서 접근 가능한 레벨링이다.  (상속 받은 녀석 사용 가능)
	// 같은 패키지 안에서 접근 가능하다.
	protected String name;
	protected int hp;

	public Hero(String name, int hp) {
		System.out.println("Hero 클래스를 생성 합니다.");
		this.name = name;
		this.hp = hp;
	}

	protected void attack() {
		System.out.println("기본 공격합니다.");
	}
}
