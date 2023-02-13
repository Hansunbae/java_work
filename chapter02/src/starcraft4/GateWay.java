package starcraft4;

public class GateWay {
	private String name;
	
	public GateWay() {
		this.name = "게이트 웨이"; 
	}
	
	// 배열 -> 자료 구조
	//질럿 생산 하기 
	public Zealot[] createZealot(int count) { // class이름을 데이터 타입으로 사용가능
		// 배열 선언 
		Zealot[] arr = new Zealot[count]; // count, Zealot array 연산자로 
		System.out.println("질럿을 생산 합니다.");
		// index 값
		// 모든 프로그래밍에서 인덱스 시작은 0번 부터 시작한다.
		for(int i =0; i<count; i++) {
			// i = 0
			// i = 1 
			// i = 2
			arr[i] = new Zealot("질럿 1");
		}
		//new Zealot(""); // 파라미터로 String을 받는 Zealot 생성자 사용 변수에 넣지 않아도 이렇게 사용가능 
		return arr;
	}
	
	//드라군 생성하기
	

}
