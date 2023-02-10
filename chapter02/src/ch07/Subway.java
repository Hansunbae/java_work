package ch07;

public class Subway {
	String subwayNum;
	int passengerCount;
	int money;
	
	public Subway(String subNumber, int passengerCount, int money) {
		this.subwayNum = subNumber;
		this.passengerCount = passengerCount;
		this.money= money;
	}
	public void take(int money) {
		System.out.println("지하철을 타셨습니다.");
		this.money+= 1_200; 
		this.passengerCount++;
	}
	public void showInfo() {
		System.out.println(subwayNum);
		System.out.println(passengerCount);
		System.out.println(money);
	}
	
}
