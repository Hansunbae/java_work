package ch04;

public class HanTest {

	public static void main(String[] args) {
		PackageMan<Carrier> packageMan1 = new PackageMan<>();
		PackageMan<Box> packageMan2 = new PackageMan<>();
		Carrier carrier = new Carrier("항공 캐리어", 140, 200);
		Box box = new Box("편의점 박스", 20, 5);
		
		packageMan1.setContainer(new Carrier("캐리어1",  150, 100));
		packageMan2.setContainer(new Box("박스1", 100, 10));
		
		System.out.println(packageMan1.toString());
		System.out.println(packageMan2.toString());
		System.out.println("-----------------");
		packageMan1.pakaging(carrier);
		System.out.println("-----------------");
		packageMan2.pakaging(box);

	}

}
