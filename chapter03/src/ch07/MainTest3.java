package ch07;

public class MainTest3 {

	public static void main(String[] args) {
		Student student1 = new Student("한범진", "1234");
		Student student2 = new Student("정상수", "4819");
		Student student3 = new Student("한범진", "1234");
		// 자식 객체에 존재하는 각각에 equals 메서드 호출이다.
		student1.equals(student2);

		System.out.println(student1);
		System.out.println(student2);

		System.out.println("------------------");

		boolean result = student1.equals(student2);
		boolean result2 = student1.equals(student3);

		System.out.println(result);
		System.out.println(result2);
		
		Boolean result3= student1 == student2;
		System.out.println("result3 : "+ result3);

	}

}
