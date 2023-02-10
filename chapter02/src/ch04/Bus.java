package ch04;

// 객체와 객체 상호작용하는 것 할 것
public class Bus {

	int busNumber; // 버스 라인
	int passengerCount; // 승객수
	int money; // 수익금

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 기능
	// 달린다
	public void run() {
		System.out.println("버스가 출발합니다.");
	}

	// 승차 시키다
	public void take(int count) { // 매개변수 활용하는 방법
		// this.passengerCount ++; = this.passengerCount +1;
		// this.passengerCount ++;
		// this.money = this.money + 1_000;
		// this.money +=1_000;
		this.passengerCount += count;
		this.money += (1_000 * count);
	}

	// 하차 시키다.
	public void takeOff(int count) {
		this.passengerCount -= count;
		System.out.println(count + " 명의 승객이 내립니다.");
	}

	public void showInfo() {
		System.out.println("상태창");
		System.out.println("버스 번호 : " + this.busNumber);
		System.out.println("승객수 : " + this.passengerCount);
		System.out.println("수익금 : " + this.money);
	}
}
