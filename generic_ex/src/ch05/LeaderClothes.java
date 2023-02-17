package ch05;

public class LeaderClothes extends Items{
	private String name;
	private int weight;
	private int price;

	public LeaderClothes(String name, int weight , int price) {
		
	}

	@Override
	public void size() {

		
	}
	@Override
	public String toString() {
		return "천옷";
	}
	
	public void clothesDamaged() {
		System.out.println("옷이 구겨집니다.");
	}

}
