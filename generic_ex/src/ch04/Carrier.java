package ch04;

public class Carrier extends Container {

	public Carrier(String name, int size, int usecount) {
		super(name, size, usecount);

	}

	@Override
	public void open() {
		System.out.println("캐리어를 엽니다.");

	}

	@Override
	public void close() {
		System.out.println("캐리어를 담습니다.");
	}

	@Override
	public String toString() {
		return "담는 곳은 캐리어입니다.";
	}

	@Override
	public void put() {
		System.out.println(this.name + "를 채웁니다.");

	}

}
