package ch06;

public class MainTest1 {
	
	//1. 리턴값이 int, 매개변수 n1, n2 ,n3 이름은 intAdd
	//2. 리턴값이 double 매개변수 n1, n2 이름은 doubleAdd
	// 3. 리턴값이 void, 매개변수는 String article , 함수 이름은 printArticle 출력
	
	static int intAdd(int n1,int  n2,int n3) {
		// 지역 변수
//		int result = n1 + n2+ n3;
//		return result;
		return n1 + n2 + n3; // 매개 변수를 활용 연산후 바로 리턴
	}
	
	static double doubleAdd(double n1, double n2) {
		
//		double result = n1 + n2;
//		return result;
		return n1 +n2;
		
	}

	static void printArticle(String article) {
		
		String result = article; 
		System.out.println( article);
	}
	

		
	//테스트 - 실행코드 main
	public static void main(String[] args) {
		
//		int result1 = intAdd( 10, 15, 20);
//		double result2 = doubleAdd( 1.1, 1.2);
//		System.out.println(printArticle()); 
		System.out.println(intAdd(1, 2, 3)); 
		System.out.println(doubleAdd(10, 10));  // 정수 int가  더 큰 더블 안에 들어가면서 자동 형변환 진행됨 20.0
		
		//오류발생
//		System.out.println(printArticle("반가워"));
		printArticle("반가워");
		
	}
}
