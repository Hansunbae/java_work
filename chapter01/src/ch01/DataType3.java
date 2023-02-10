package ch01;
// 패키지는 주언어들을 모아 놓은 폴더
public class DataType3 {
	//코드의 시작점
	public static void main(String[] args) {
		
		//실수형 2가지 
		//1.float - 4byte, 
		//2. double - 8byte
		
		// 실수형 단위를 다룰때 R value 기본연산 단위는 double이다. 
		float a = 0.5F; // 실수형을 다룰 때는 소수점을 많이 나타낼 수 있을 수록 더 정확하게 나타낼 수 있어 더 큰 단위인 double이 기본형
		float b = 12.9F; // 정밀도가 큰숫자르 작은 float에 넣으면 숫자가 잘릴 수 있어 에러메세지를 출력
		
		double c = 0.12345;
		double d = 0.55; // 8바이트

		
	}//end of main
	
}//end of class
