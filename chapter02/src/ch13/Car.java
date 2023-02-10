package ch13;

/*
 * 
 * 템플릿 메서드 패턴을  구현
 * 핵심 run() 메서드이다.
 */
public abstract class Car {

	protected abstract void dirve();

	protected abstract void stop();

	private void startCar() {
		System.out.println("시동을 켭니다.");
	}

	private void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	public abstract void wiper();

	// 후크 메서드
	public void washCar() {
		// 아무것도 구현 하지 않음 필요에 의해 사용---> 일반 메서드이다.
	}

	// 실행의 흐름을 만들어 둔다.
	// 재정의 할 수 없게 설계 한다. ---> final (메서드 앞)
	// 하위 클래스에서 재정의 할 수 없음 --> 하위에서 메서드 마음대로 재정의 하지 못하게 만든 사람의 의도 대로 사용하게 함
	final public void run() {
		startCar();
		dirve();
		wiper();
		stop();
		turnOff();
		washCar();
	}

}
