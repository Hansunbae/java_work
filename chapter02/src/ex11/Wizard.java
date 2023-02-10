package ex11;

public class Wizard extends Hero {
	public Wizard(String name, int hp) {
		super(name, hp);
		System.out.println("Wizard 생성자 마지막 줄 코드");
	}

	void freezing() {
		System.out.println(this.name + "가 얼음 공격을 공격합니다,");
	}
}
