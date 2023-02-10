package starcraft2;

public class Zealot {

	private String name;
	private int power;
	private int hp;
	private int shield;
	private int upgrade;
	private int count;

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
		this.shield = 80;
	}

	// getter 메서드 만들기
	public int getPower() {
		return this.power;
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}
	// 쉴드를 회복합니다.
	public void shield() {
		
		if(this.shield <80) {
			this.shield++;
		}
		

	
	}
	
	// 질럿이 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + "이" + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);

	}

	// 질럿이 마린을 공격합니다.
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		// 질럿 공격력은 현재 5이다.
		marine.beAttacked(this.power);
	}

	// 자기 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		System.out.println(this.name + "이 공격 당합니다.");
		this.hp -= power;
	}

	public void showInfo() {
		System.out.println("=====상태창 =========");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
