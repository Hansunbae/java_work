package ch07;

public class Student {
	String name;
	int money;
	
	public Student (String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1_000;
		
	}
	
	public void takeSubway(Subway subway) {
		subway.take(money);
		this.money-= 1_200;
	}


}
