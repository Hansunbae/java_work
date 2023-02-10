package ch05;

public class Train {
	String name;
	int trainNumber;
	int passengerCount;
	int money;

	
	public Train(String name, int trainNumber, int passengerCount, int money ) {
		this.name = name;
		this.trainNumber = trainNumber ;
		this.money= money;
		this.passengerCount=passengerCount;
		
		
	} // end of class 
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
		
		
	}
	
	
	

	
	
	
	
} // end of class
