package ch04;

public class GameTest {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.id = "호드";
		w1.name = "오크 전사";
		w1.hp = 100;
		w1.mana = 100;
		w1.power = 100;
		w1.magicalPower = 10;
		w1.kill = 0;

		w1.attack();
		w1.skill(20);
		w1.damaged(101);
		w1.attackMiss();
		w1.defenceMiss(2);
		w1.kill(40);

		System.out.println("====================");

		Wizard wiza1 = new Wizard();
		wiza1.id = "얼라이언스";
		wiza1.name = "엘프";
		wiza1.hp = 100;
		wiza1.mana = 200;
		// wiza1.power = 10;
		// wiza1.magicalPower = 100;
		wiza1.kill = 0;

		wiza1.attack();
		wiza1.skill(20);
		wiza1.attackMiss();
		wiza1.defenceMiss(23);
		wiza1.kill(165);

	}

}
