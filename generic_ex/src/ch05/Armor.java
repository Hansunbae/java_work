package ch05;

public class Armor extends Items{
	private String name;
	private int weight;
	private int price;
	
	
	public Armor(String name, int weight , int price) {
		
	}

	public void showInfo() {
		System.out.println(name);
		System.out.println(weight);
		System.out.println(price);
	}
	
	@Override
	public void size() {
		System.out.println("좀 많이 큽니다.");
		
	}
	@Override
	public String toString() {
		return "갑옷";
	}
	
	

}
