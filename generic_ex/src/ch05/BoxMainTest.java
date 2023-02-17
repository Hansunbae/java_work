package ch05;

public class BoxMainTest {

	public static void main(String[] args) {
//		Box<> box = new Box<>();
//		box.put("안녕 반가워");
//		System.out.println(box.isEmpty());
//		System.out.println("------------------");
//		
//		
//		String msg = box.take();
//		System.out.println("msg : " + msg);
//		System.out.println(box.isEmpty());

		Armor armor1 = new Armor("무거운 기사의 갑옷 상의", 40, 25000);
		LeaderClothes leaderClothes = new LeaderClothes("농부의 작업복", 1, 2500);
		Box<Items> box1 = new Box<>();
		Box<Items> box2 = new Box<>();

		box1.put(armor1);
		System.out.println();
		box2.put(leaderClothes);
		box1.take();
		box2.take();

//		System.out.println(box1.getContents());
//		System.out.println(box1.isEmpty());

	}
}
