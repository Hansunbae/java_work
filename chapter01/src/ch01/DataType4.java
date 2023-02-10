package ch01;
//패키지는 주언어 파일들을 모아 놓은 폴더
public class DataType4 {

	//코드의 시작점(main함수)
	public static void main(String[] args) {
		
		//논리형 (사실을 관찰하고 결과값이 참, 거짓인지 판별할 때 사용)
        boolean isMarried = false; //  변수에 선언과 동시에 초기화
		System.out.println(isMarried);
		isMarried = true;
		System.out.println(isMarried);
		// 논리형에 데이터 크기는 ??? 1byte// 최소연산 단위가 1byte로 고정되있기 때문에 bit한칸에서 0,1 로도 boolean 판별 가능하지만 이를 사용
		
		
	}// end of main

}// end of class
