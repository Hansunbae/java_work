package ch01;

public class Car {

	private Engine engine;

	// 메모리에 띄우려면 엔진 클래스 필요
	public Car(Engine engine) {
		// 자동차 클래스는 엔진 클래스에 의존한다 -> 엔진 클래스가 있어야 생성이 된다.
		this.engine = engine;
	}

	public void start() {
		engine.start(); // NullPoint
		System.out.println("Car started");
	}

}
