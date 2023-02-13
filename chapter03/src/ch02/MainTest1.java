package ch02;

public class MainTest1 {
	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		ToyCar toyCar = new ToyCar();

		RemoteController controller1 = televison;
		RemoteController controller2 = refrigerator;
		RemoteController controller3 = toyRobot;
		RemoteController controller4 = toyCar;

		// 다형성 + 배열
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = televison;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = toyRobot;
		remoteControllers[3] = toyCar;

		// 문제 - 1:
		// for 문을 활용 전원을 전부 켜주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			// 0 ---> televison
			// 1 ---> refrigerator
			remoteControllers[i].turnOn(); // 컴파일 시점, (turnOn, turnOff)

		}

		// index 값이 3번째 녀석이면 자신에 타입을 화면에 출력해 주세요
		for (int j = 0; j < remoteControllers.length; j++) {
			if (j == 3) {
				System.out.println("3번째 인덱스 녀석은 toyCar 데이터 타입입니다.");
			}
		}

		// 문제 - 3
		// 만약 데이터 이면 멤버 변수 name 값을 출력해주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers[i] instanceof ToyRobot) {
				// 업캐스팅 된 상태이기 때문에
				// 자식 타입으로 바라보기 위해서는 다운 캐스팅 개념을 알고 있어야 한다.
				System.out.println(((ToyRobot) remoteControllers[i]).name);
			}
		}

		// 문제 - 4
		// 장난감 로봇에 소리 기능을 추가해달라는 요청
		// 냉장고에도 소리나는 기능을 추가해 달라고 요청
		// 소리기능 ---> 인터페이스로 설계
		// 냉장고 --> 띠리리링~~~
		// 장난감 ----> 두두두 뚜두 ~~새삥~
	

	} // end of main

} // end of class
