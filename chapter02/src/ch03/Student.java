package ch03;

// 객체지향 프로그래밍이란
// 객체와 객체간에 관계를 형성하고 상호 작용하게 코드를 설계해 나간 것 
public class Student {
	int studentId;
	int grade;

	// 참조 입니다
	String name;
	// 참조 타입
	Subject korea;
	Subject math;

	// 생성자
	public Student(int studentId, int grade, String name) {
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;
		this.korea = new Subject(); // 참조데이터 타입 사용? 객체를 생성 한 것?
		this.math = new Subject();
	}

	// 메서드
	public void showInfo() {
		System.out.println("**상태창**");
		System.out.println(this.name + " : 입니다.");
		System.out.println(this.grade + " : 학년 입니다.");
		System.out.println(this.studentId + " : 번 입니다.");
		System.out.println(this.korea.subjectName + "에 점수는" + this.korea.Score);
		System.out.println(this.math.subjectName + "에 점수는" + this.math.Score);

	}
}
