package ch09;

public class BookMainTest {

	public static void main(String[] args) {

		// 연관된 하나의 데이터를 통으로 관리하고 싶다면 - 배열 (자료구조)
		Book[] books = new Book[10]; // 배열 선언 ( 메모리 공간 만들어 두기 ) // heap에 객체만들고 객체 배열에 주소값이 할당 됨
		books[0] = new Book("플러터 ui 실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로 코엘료");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스 ", "유발하라리");

		books[9] = new Book("홍길동전", "허균");

		// books[5]= new Book(" 홍길동전 ", "허균");Exception in thread "main"
		// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		// at chapter02/ch09.BookMainTest.main(BookMainTest.java:15)
		// 6 <---
		// books.length --> 배열에 길이(10)
		for (int i = 0; i < books.length; i++) {
			// i --> 0, 1, 2, 3, 4,
			if (books[i] != null) { // 방어적 코드 짜기
				System.out.println(books[i].getTitle());
			}
		}

		// 문제 1
		// double 배열 4선언 임의 값 넣고 출력해주세요
		// 3번째 인덱스는 값을 할당하지 마시오
		// 출력은 for문 - > 방어적 코드 작성

		double[] arr = new double[4]; // 배열에 선언 (double 값)
		arr[0] = 0.11;
		arr[1] = 0.27;
		arr[2] = 0.35;

		for (int a = 0; a < arr.length; a++) { // double은 기본값이 null이 아닌 0.0이기 때문에 방어적 코드를 사용하지 않아도 오류가 뜨지 않는다.
			if (arr[a] != 0.0) {
				System.out.println(arr[a]);
			}
		}

		// 예제 books를 사용하세요
		// 문제2
		// 0번째 인덱스에 있는 녀것과 인덱스 2번째 녀석에 값을 스왑해주세요

		Book temp = books[0];
		books[0] = books[2];
		books[2] = temp;

//		Book b;
//		b = books[0];
//		books[0] = books[2];
//		books[2] = b;

		System.out.println(books[0].getTitle());
		System.out.println(books[2].getTitle());

		// 문제 3
		// 인덱스 3번에 값을 삭제해주세요
		books[3] = null;
		for (int i = 0; i < books.length; i++) {
			// i 값 활용 !!
//			System.out.println(books[i].showInfo());
			if (books[i] != null) { // 3번 인덱스가 null이 되어 방어적 코드를 짬
				books[i].showInfo();
			}
		}

		// 주의 1
		// 인덱스 크기는 n-1 개다
		// 배열의 길이와 인데스에 길이는 다르다
		// 배열 길이5
		// 인덱스 길이 (n-1) 4
		// 500 -> 499
		// 12 -> 인덱스 크기 11
		// 689 -> 인덱스 크기 688

		// 주의2
		// 배열의 길이와 실제 들어가 있는 값에 갯수는 다를 수 있다.

	}

}
