package ch09;

import java.util.Scanner;

/*
 *  한범진
 *  북 객체를 관리하는 프로그램
 *  C R U D -> 구글링해서 정의 확인
 */
public class MyBookStore {

	// 메인 함수
	public static void main(String[] args) {

		// 준비물
		Scanner scanner = new Scanner(System.in);
		// 배열은 먼저 배열에 길이를 지정해 주어야 한다.
		Book[] books = new Book[100];
		boolean flag = true; // 실행의 흐름 제어
		int lastindexNumber = 5;

		// 변하지 않는 수 상수로 if 조건 비교
		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		// todo 추후 삭제 예정
		// 임시 데이터
		books[0] = new Book("플러터 ui 실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로 코엘료");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");

		// 실행에 흐름 만들어 보기
		while (flag) {
			System.out.println("** 메뉴선택 **");
			System.out.println("1. 저장 2.전체조회 3. 선택조회 4.전체삭제 0.종료");
			String selectedNumber = scanner.nextLine();
			if (selectedNumber.equals(SAVE)) {
				// 5
				lastindexNumber = save(scanner, books, lastindexNumber);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				readAll(books); // 배열북스를 주입
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				readByTitle(scanner, books);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				deleteAll(books);
			} else if (selectedNumber.equals(END)) {
				flag = false;
			} else {
				System.out.println("잘못된 입력값입니다.\n 다시 선택 바람"); // \n 글자 한칸 떨구어줌
			}
		}
	} // end of main

	// 전체 조회 하기 기능
	public static void readAll(Book[] books) {
		System.out.println(">>전체 조회 하기<<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null)
				System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
		}
		System.out.println();
	}
	// 선택 조회하기
	public static void readByTitle(Scanner scanner, Book[] books) {
		System.out.println(">>선택 조회 하기<<");
		System.out.println(">> 책 제목을 입력해주세요<<");
		String bookTitle = scanner.nextLine();
		boolean isFind = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null)
				if (books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
					isFind = true; // 0번째 인덱스 부터 99번째 인덱스까지 순서대로 살피다
					break;
				}
		}
		if (isFind == false) {
			System.out.println("아쉽지만 없는 책입니다.");
		}
	}
	// 전체 삭제하기
	public static void deleteAll(Book[] books) {
		System.out.println(">>전체 삭제하기<<");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i] = null;
			}
		}
	}
	// 저장하기
	public static int save(Scanner scanner, Book[] books, int lastindexNumber) {
		System.out.println(">>저장하기<<");
		System.out.println("책 제목을 입력하세요\n");
		String bookTitle = scanner.nextLine();
		System.out.println("저자 이름을 입력하세요\n");
		String bookAuthor = scanner.nextLine();
		Book book = new Book(bookTitle, bookAuthor);
		books[lastindexNumber] = book;
		lastindexNumber++;
		System.out.println(bookTitle + "책을 저장했어요");
		return lastindexNumber;
	}

} // end of class
