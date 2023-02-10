package ch04;

// 전사 클래스 설계하기
public class Warrior {

	// 상태
	String id;
	String name;
	int level = 1 ;
	int hp;
	int mana;
	int power = 100;
	int magicalPower = 10;
	int kill;
	int exp;

	// 기능
	public void attack() {
		System.out.println("아이언 너클. ");
	}

	public void skill(int useMana) {
		this.mana -= useMana;
		if (this.mana < 0) {
			System.out.println("마나가 부족합니다. ");
		}
		System.out.println("건곤대나이." + " 남은 마나는" + this.mana + " 입니다.");
	}

	public void damaged(int damage) {
		this.hp -= damage;
		if (this.hp < 0) {
			System.out.println("캐릭터가 사망했습니다.");
			this.hp = 100;
		}
	}

	public void attackMiss() {
		System.out.println("miss! 공격이 빗나갔습니다");
	}

	public void defenceMiss(int defenceMiss) {
		this.hp -= defenceMiss;
		System.out.println("miss! 방어에 실패했습니다.");
		System.out.println("체력이 " + defenceMiss + " 만큼 깎였습니다." + "남은 체력은" + this.hp + "입니다.");
	}

	public void kill(int kill) {
		this.kill += kill;
		System.out.println("지금까지 " + this.kill + "마리 잡으셨습니다.");
		System.out.println("레벨업까지 " + (this.kill % 100) + " 마리 남으셨습니다.");
		if (this.kill > 100) {
			this.level += this.kill / 100;
			this.kill = 0;
		}
	}

} // end of class
