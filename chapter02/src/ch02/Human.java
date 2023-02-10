package ch02;

public class Human {

	String name;
	int height;
	int weight;
	boolean isMan;

	// 생성자는 객체가 메모리에 올라 갈 때 가장 먼저 수행되는 코드이다.
	public Human() {
		// 식을 추가해줄 수 있다.
		// if (this.name == null ) {
		// this.name = "아무개";
		// }

		// 필요하면 초기화 값 식을 사용 또는 메서드 호출도 가능하다.
		// showInfo(); // 필요하다면 메서드 호출도 가능하다.
	}

	public void showInfo() {
		System.out.println("========= 상태창=========");
		System.out.println("이름 :" + name);
		System.out.println("키 :" + height);
		System.out.println("몸무게 :" + weight);
		if (isMan == true) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		// System.out.println("성별 :" + isMan);

	}

}
