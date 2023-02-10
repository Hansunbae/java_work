package ch01;

public class Bus {
	int busNumber;
	int price;
	String company;
	String station;
	
	
	public void go() {
		System.out.println(" 버스가  출발합니다.");
	}
	public void stop() {
		System.out.println(" 버스가 멈춥니다.");
	}

	public static void main(String[] args) {
		
		Bus bus1 = new Bus();
		
		
	} // end of main
} // end of class
