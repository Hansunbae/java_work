package ch07;

public class Student {
	private String name;
	private String studentNumber;
	private int id;

	public Student(String name, String studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;

	}

	// 학번과 이름을 정의
	// 생성자

	// 1
	// toString --> 학번, 이름이 화면에 출력할 수 있도록 설계

	// 2
	// equals 메서드를 재정의 해주세요!
	// 이름이 같다면 동명이인 입니다. 라고 출력해 주세요

	@Override
	public String toString() {
		return "[" + this.name + this.studentNumber + "]";
	}

	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student targetStudent = (Student) obj;
			if (this.name == targetStudent.name && this.studentNumber == targetStudent.studentNumber) {
				System.out.println("같은 학번 같은 이름입니다.");
				return true;
			}
		}
		return false;
	}

}
