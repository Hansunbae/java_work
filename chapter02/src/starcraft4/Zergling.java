package starcraft4;

public class Zergling extends Unit implements UnitAttack{

	public Zergling(String name) {
		this.name = name;
		this.power = 3;
		this.hp = 50;

	}

	@Override
	public void tribeattack() {
		System.out.println("갈고리 발톱");
	}

}
