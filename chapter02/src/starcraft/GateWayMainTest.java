package starcraft;

public class GateWayMainTest {

	public static void main(String[] args) {
		GateWay gateWay1 = new GateWay();
		Zealot[] zealots = gateWay1.createZealot(30); // 메소드는 객체가 할 수 있는 행동
		Zealot [] zealot1 =gateWay1.createZealot(321);
		System.out.println(zealots[0]);
		// System.out.println(zealots[0].getName()); 이름 확인
		System.out.println(zealots[1]);
		System.out.println(zealots[2]);
		System.out.println(zealots[3]);
		System.out.println(zealots[4]);
		System.out.println(zealots[5]);
		System.out.println(zealots[6]);
		System.out.println(zealots[7]);
		
		//arr[1] = "나는스트링" 연관 된 데이터 타입이 아니어서 들어가지 못함


	}

}
