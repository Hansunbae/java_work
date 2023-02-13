package starcraft4;

/**
 * @author 한범진
 */

public class Marine extends Unit implements UnitAttack {

	public Marine(String name) {
		this.name = name;
		this.power = 4;
		this.hp = 70;
	}

	@Override
	public void tribeattack() {
		System.out.println("가우스 소총");
	}
}
