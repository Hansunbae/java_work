package ch07;

public class HanTest1 {

	public static void main(String[] args) {
		Student Student1 = new Student("james", 5000);
		Student Student2 = new Student("Tomas", 5000);
		Bus bus1 = new Bus("169", 0, 0);
		Bus bus2 = new Bus("169", 0, 0);
		Subway subway1 = new Subway("1호선", 0, 0);
		Subway subway2 = new Subway("2호선", 0, 0);
		
		Student1.takeBus(bus1);
		System.out.println(bus1.busNumber);
		System.out.println(bus1.money);
		System.out.println(bus1.passengerCount);
		
		System.out.println("-------------------");
		
		Student1.takeSubway(subway1);
		System.out.println(subway1.subwayNum);
		System.out.println(subway1.money);
		System.out.println(subway1.passengerCount);

	}

}
