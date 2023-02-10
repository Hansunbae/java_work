package ch02;

public class Student2 {

	String name;
	int grade;

	// this는 자기 자신이다
	public Student2(String name, int grade) { // 매개변수는 지역변수와 같이 안에서만 존재, 작동한다.
		this.name = name;
		this.grade = grade;
	}
} // end of class
