package ch01;

public class DataType2 {
	
	//코드의 시작점 -main 함수
	public static void main(String[] args) {
		char name;// 변수에 선언 2바이트 공간(16bit)에 문자를 담을 수  있다.
		char a;
		char initial;
		//값을 초기화 하는 방법
		name ='A'; // 홑 따옴표를 사용해야 한다.
		name ='B';
		//name ='AB'; 하나의 문자만 담을 수 있다.
		System.out.println(name); // ctrl + F11번 실행하는 단축키
		
		System.out.println('p');
		System.out.println('C');
		System.out.println("테스트");
	}// end of main
    
}//end of class
