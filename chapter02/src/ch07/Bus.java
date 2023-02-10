package ch07;

public class Bus {
	String busNumber;
	int passengerCount;
	int money;
	
	public Bus(String busNumber, int passengerCount, int money) {
		this.busNumber = busNumber;
		this.passengerCount = passengerCount;
		this.money= money;
		
	}
	public void take(int money) {
		System.out.println("버스를 타셨습니다.");
		this.money+= 1_000; 
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println(busNumber);
		System.out.println(passengerCount);
		System.out.println(money);
	}
	
}
