package ex11;

public class Archer extends Hero {
	public Archer(String name, int hp) {
		super(name, hp);
		System.out.println("Archer 생성자 마지막 줄 코드");
	}

	void fireArrow() {
		System.out.println(this.name + "가 불화살 공격합니다,");
	}

}
