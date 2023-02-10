package starcraft3;

import java.util.Iterator;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("천하무적 질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("귀신잡는 해병1");
		Marine marine2 = new Marine("마린2");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("디바우링 원");
		Unit unit1 = new Zealot("상속받은 질럿");
		Unit unit2 = new Zergling("상속받은 저글링");
		Unit unit3 = new Marine("상속받은 마린");

		// 질럿이 마린을 공격 = 대상1, 2
		
		zealot1.attack(marine2);
		marine1.attack(zergling2);

		System.out.println(marine1.getHp());

		zealot1.showInfo();
		marine1.showInfo();
		marine2.showInfo();
	}

}
