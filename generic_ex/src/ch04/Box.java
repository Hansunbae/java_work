package ch04;

public class Box extends Container {

	public Box(String name, int size, int usecount) {
		super(name, size, usecount);

	}

	@Override
	public void open() {
		System.out.println("박스를 엽니다.");

	}

	@Override
	public void close() {
		System.out.println("박스를 담습니다.");
	}

	@Override
	public String toString() {
		return "담는 곳은 박스입니다.";
	}

	@Override
	public void put() {
		System.out.println("박스를 채웁니다.");

	}

}
