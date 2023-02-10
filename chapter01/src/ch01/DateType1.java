package ch01;
//패키지는 주언어들을 모아 놓은 폴더
public class DateType1 {
	
	
	//코드 시작점 main함수
	 public static void main(String[] args) {
		 
		 //데이터 타입에 종류(크게 2가지)
		 //1. 기본 데이터 타입(primitive data type)
		 //2. 참조 타입(Reference Type
		 
		 // 정수형(1, 10, 30) 데이터 타입
		 // 크기가 다를 수 있다.
		 byte b; // 1바이트 크기(8bit)
		 short s;//2바이트 크기(16bit)
		 int i;//4바이트 크기(32bit)
		 long l;//8바이트 크기 (64bit)
		 
		 b = 127; // 10진수 기준으로 127까지만 들어감
		 b = -128;
		 //데이터 타입 byte는 127부터 -128까지 담을 수 있다.
		 //b=-129;
		 
		 s = 128;
		 //s = 2000000000;
		 
		 //int는 약 +- 21억 까지의 정수를 담을 수 있다.
		 i = 2100000000;
		 //i = 2200000000;
		 
		  //L value = R value
		 // 컴퓨터 정수값에 기본 단위는 int 이다.
		 l= 2200000000l; // <-기본단위인 int 값에서 long 데이터 타입으로 사용하기 위해 접미사(L or l)를 붙여 주어야 한다(대소문자 가능). 
		 
		 
		 //출력해주세요
		 //문제 : short 데이터 타입에 범위는?? –32,768 ~ 32,767
	
		 
	}//end of main
	 
	
}//end of class
