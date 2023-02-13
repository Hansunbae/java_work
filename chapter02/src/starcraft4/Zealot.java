package starcraft4;

public class Zealot extends Unit implements UnitAttack{

	// 생성자
	public Zealot(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}
	
	@Override
	public void tribeattack() {
		System.out.println("사이오닉 블레이드");
	}

}
