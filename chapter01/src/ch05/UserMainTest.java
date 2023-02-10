package ch05;

// 클래스를 사용하는 쪽 코드 작성
public class UserMainTest {

	// 메인 함수
	public static void main(String[] args) {

		User person1 = new User();

		person1.id = "멍멍이";
		person1.pw = "1234";
		person1.name = "김민수";
		person1.address = "부산 해운대";
		person1.phonenumber = "010 -2342 - 3324";
		person1.age = 16;

		System.out.println(person1.id);
		System.out.println(person1.pw);
		System.out.println(person1.name);
		System.out.println(person1.address);
		System.out.println(person1.phonenumber);
		System.out.println(person1.age);

		System.out.println("===============================");

		User person2 = new User();

		person2.id = "고양이";
		person2.pw = "5678";
		person2.name = "한지민";
		person2.address = "부산 사상구";
		person2.phonenumber = "010 -6757 - 9453";
		person2.age = 19;

		System.out.println(person2.id);
		System.out.println(person2.pw);
		System.out.println(person2.name);
		System.out.println(person2.address);
		System.out.println(person2.phonenumber);
		System.out.println(person2.age);
		// 메모리 올리고
		// 값을 할당
		// 화면에 값을 출력
	} // end of main

} // end of class
