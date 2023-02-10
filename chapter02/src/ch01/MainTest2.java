package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		Student studentHan = new Student();
		studentHan.studentName = "한범진";
		studentHan.address = "부산시 사상구";
		studentHan.studentId = 12;

		studentHan.eat();
		studentHan.clean();
		studentHan.example();
	}

}
