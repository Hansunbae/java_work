package ch01;

public class Variable {

	//중괄호(블록)에 범위는 절대적이다.(중괄호 안 영역이 스코프)
	// main이란: 프로그램에 시작 점
	public static void main(String[] args) {
		//<--주석(컴파일러가 무시) 
		//변수를 사용하는 방법
		int age;//변수를 선언 (여기서 변수는 age) int는 자료형
		int count;// ram에 영역에 상자(공간)을 만들고 이름을 붙이는 것이 변수선언이다.
		
		age = 1;// 초기화 한다(값을 넣다ㅡ초기값 설정)
		count = 100;//구문에 끝은 세미콜론으로 한다.
		
		//화면에 age라는 변수에 담겨있는 값을 출력해줘!!!!!
		System.out.println(age);
		System.out.println("============");
		System.out.println(count);
		
		//변할 수 있는 수를 의미한다.
		
		age = 500;
		count = 300;
		System.out.println(age);
		System.out.println("============");
		System.out.println(count);
		
		//변수에 선언과 동시에 초기화하기 myAge;
		int myAge = 800; //변수의 선언과 초기화 //메모리에 이름 붙여 상자하나 만들면서 값을 넣은 것
		System.out.println(myAge);//sysout<- 코드 힌트 사용해보기
		System.out.println(9000);//ctrl+alt +화살표 아래 (라인복사)
		
		
		//Tip
		//변수 사용시 데이터 타입은 크게 2가지만 기억
		//1. 기본 데이터 타입과
		//2. 참조 타입
		
	}// end of main

}//end of class
