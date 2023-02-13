package starcraft4;

public class MainTest3 {

	public static void main(String[] args) {
		Zealot zealot1 = new Zealot("돌격대장 질럿");
		Marine marine1= new Marine("귀신잡는 해병은 아님");
		
		zealot1.attack(marine1); // 여기서 질럿1은 unit 데이터 타입도 가진다.
		marine1.showInfo();
		
		Unit unit1 = new Zealot("페닉스");
		zealot1.attack(unit1);
		unit1.showInfo();

	}

}
