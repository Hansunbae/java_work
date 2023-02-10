package ch05;

import java.util.Scanner;

// 클래스를 사용하는 쪽 코드 작성
public class UserMainTest2 {

	// 메인 함수
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// nextInt() 개행문자("\n") 제거 하지 않았기 때문에
		// 바로 아래 코드가 동작하고 완료 되어진다.
		// int userInput1 = scanner.nextInt();
		// 100 + 엔터 "\n"
		// scanner.nextLine(); // <--- 이 녀석이 엔터키를 받아준다. nextLine() 문자를 받는 것
		// 입력 장치 (키보드값을 받아주는 객체)
		// 정수 값을 입력 받을 때
		// int a =scanner.nextInt();
		// 100+ 엔터(개행문자 \n)

		// System.out.println("이름을 입력해주세요");
		// String name = scanner.nextLine();
		// System.out.println("name :" + name);

		// 스캐너를 활용해서 값을 입력 받고 화면에 뿌려주세요
		// 여러분들이 정의한 클래스를 가지고 값 할당 코드 작성
		User person3 = new User();
		System.out.println("============입력창==========");

		System.out.println("아이디를 입력해주세요");
		person3.id = scanner.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		person3.pw = scanner.nextLine();
		System.out.println("이름을 입력해주세요");
		person3.name = scanner.nextLine();
		System.out.println("주소를 입력해주세요");
		person3.address = scanner.nextLine();
		System.out.println("전화번호를 입력해주세요");
		person3.phonenumber = scanner.nextLine();
		System.out.println("나이를 입력해주세요");
		person3.age = scanner.nextInt();

		// 정보를 출력해주세요
		System.out.println("============상태창==========");

		System.out.println(" id : " + person3.id);
		System.out.println(" pw : " + person3.pw);
		System.out.println(" name : " + person3.name);
		System.out.println(" address : " + person3.address);
		System.out.println(" phonenumber : " + person3.phonenumber);
		System.out.println(" age : " + person3.age);

		// 메모리 올리고
		// 값을 할당
		// 화면에 값을 출력
	} // end of main

} // end of class
