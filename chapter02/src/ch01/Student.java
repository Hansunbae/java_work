package ch01;

public class Student {

	// 상태(속성) (멤버변수)
	int studentId;
	String studentName;
	String address;
	double height; // 0.0 < --- 변수에 값(초기화)을 주지 않았을 때 기본값
	boolean isMarred; // false; < --- 변수에 값(초기화)을 주지 않았을 때 기본값

	// 기능

	// 공부한다.
	public void study() {
		System.out.println(studentName + " 학생이 공부를 합니다.");
	}

	// 휴식한다.
	public void breakTime() {
		System.out.println(studentName + " 학생이 휴식을 합니다.");
	}

	// n1 = 100; 지역변수로 선언된 것은 스코프 밖에서는 사용할 수 없다.
	public void showInfo() {
		// 지역변수
		// int n1;
		System.out.println("============상태창===========");
		System.out.println("학생의 ID값은 :" + studentId);
		System.out.println("학생의 이름은 :" + studentName);
		System.out.println("학생의 주소는 :" + address);
		System.out.println("============================");

	}

	public void eat() {
		System.out.println(studentName + " 학생이 밥을 먹습니다.");
	}

	public void clean() {
		System.out.println(studentName + " 학생이 청소를 합니다.");
	}

	public void example() {
		System.out.println(studentName + " 학생이 시험을 칩니다.");
	}

	public void gugudan() {

	}

	// 함수와 메서드의 차이점
	// 메서드란
	// 자바에서 메서드란 객체의 기능을 구현하기 위해서 클래스 내부에 구현되는 메서드
	// 멤버함수(member function)
	// 결론 : 메서드는 자신의 변수를 활용해서 객체의 기능을 구현하는 것 ( 좀 더 구체적인 객체의 기능과 관련된 함수)
	// 단순 함수를 정의 할 때는 함수라 함

	// 학생의 기능(메서드) 3가지 구현해보기

} // end of class
