package ch06;

/*
 * 함수를 선언 하는 코드 반법
 * 함수를 사용하는  코드 방법
 */

public class Lion {
	
	// 정수를 반환 하는 함수
	// 함수를 설계 하는 코드 작성
	static int addNumber(int n1, int n2) { // 소괄호 앞 까지가 선언부(signature)
		// 함수 구현부(body)
		int result; // 지역 변수
		result = n1 + n2;
		return result; // ---> 데이터 타입과 같은 타입을 반환해야한다.
		// 리턴 키워드를 만나면 실행의 제어권을 반납(데이터), 반환하면 자신을 호출 했던곳으로 돌아간다
	}

	// 아무 값도 반환하지 않는 함수 - void
	static void sayHello(String name) {
		System.out.println( name + " 반갑습니다.~~ ");
	}
	
	// 매개 변수가 없는 함수를 설계
	static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i = 1; i <=100; i++) {
			 sum += i;
		}
		
		return sum;
	}
	
	// calcSum2 , 정수값 3개를 받아서 덧셈 연산후 결과를 반환 하시오 --- > 리턴 타입은 double
	static double calcSum2(int num1, int num2, int num3) {
		double sum = num1 + num2+ num3;
		return sum;
	}
	
	// calcSum3 정수값 1, 실수값 1 , 논리값 1개 받고 식을 만들어서 
	// " 정수값 : " [] , 실수값 [],  논리값 [] <-------문자열로 연산하고 
	// 리턴 타입은 String을 만들어 주세요
	
	static String calcSum3( int num1, double num2, boolean num3) {
		String result = "정수값:" + num1 + "실수값 : "  + num2 + "논리값 : " + num3 ;
		
		return result;
	}
	
	
	
	
	
	
	
	// main 함수 - void은 텅빈, 리턴 값이 없다.
	public static void main(String[] args) {

		// 함수 호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10); // 실행의 제어권 발생
		System.out.println("myNumber:" + myNumber);
		
		// 함수 호출 2 (void 함수)
		// 함수 호출할 때는 모양 맞추기이다.
		sayHello("애쉬"); // 함수 호출 하는 모양
		// int a = myNumber; // 변수 호출하는 모양
		sayHello("티모");
		sayHello("바론");
		
		int calResult = calcSum(); // <-----
		System.out.println(calResult);
		
		System.out.println( calcSum () ); // 바로 위의 경우와 동일
		
		// int result2  = (int)calcSum2(1,2,3); 
		double result2  = calcSum2(1,2,3); // 이게 더 깔끔
		System.out.println(result2);
		
		 String localDataString = calcSum3( 100,  0.5,  true);
		 System.out.println(localDataString); 
	}// end of main
	
	// 함수란/
	// 자바에서 객체와 상관없이 독립적으로 어떠한 기능을  수행하는 일련의 코드 묶음이다.
	// 함수는 static을 붙일 것이다.
	
}// end of class

//int a = 10;  영역밖 선언은 안됨