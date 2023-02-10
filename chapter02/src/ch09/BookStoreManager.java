package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {

		// 책을 저장하는 기능을 만들고
		// 정보를 출력하는 프로그램을 만들어 주세요
		// 스캐너

		// 문자열
		// 값을 비교하는 연산자==
//		String temp = "안녕";
//		if(temp.equals("안녕") ){
//			System.out.println("같은 값 확인");
//		}else {
//			System.out.println("값이 달라요");
//		}
//		
//		System.out.println("--------------------------");
//		
//		if("반가워".equals(temp) ){
//			System.out.println("같은 값 확인");
//		}else {
//			System.out.println("값이 달라요");
//		}

		// while 문을 사용해서
		// CRUD 에 개념
		// 1. 저장 2. 전체조회 3. 선택조회 4. 전체 삭제 0.프로그램 종료

		// 도구 준비

		Scanner scanner = new Scanner(System.in);
		// 먼저 몇칸 사용할 지 정해 주어야 한다.
		Book[] books = new Book[10000];
		String userInput = null;
		int count; // 입력받을 책 개수 저장
		int num = 0; // 인덱스 번호
		String title;
		boolean flag = true;
		int indexCount = 0;
		String bookName;
		String author;

		while (flag == true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.저장 2.전체조회 3선택조회 4.전체삭제 0.종료");
			userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				
				
				System.out.println("저장");
			
					System.out.println("책이름을 입력해주세요");
					bookName = scanner.nextLine();
					
					System.out.println("저자 명을 입력해주세요");
					author = scanner.nextLine();
					
					books[indexCount] = new Book(bookName, author);
					indexCount++;

				
//				System.out.println("책 몇개 저장하시겠습니까");
//				count = scanner.nextInt();
//				scanner.nextLine();
//
//				for (int i = 0; i < count; i++) {
//					System.out.println("책이름을 입력해주세요");
//					bookName = scanner.nextLine();
//
//					System.out.println("저자 명을 입력해주세요");
//					author = scanner.nextLine();
//
//					books[i] = new Book(bookName, author);
//				}

				System.out.println("저장 완료");
			}
			if (userInput.equals("2")) {
				for (int i = 0; i < books.length; i++) {
					// i --> 0, 1, 2, 3, 4,
					if (books[i] != null) { // 방어적 코드 짜기
						books[i].showInfo();
						
					}

				}
				System.out.println("전체조회");
			}
			if (userInput.equals("3")) {

				System.out.println("선택조회");
				// 타이틀 입력 값 받기
				System.out.println("책제목을 입력해주십시오");
				// 전체 데이터를 반복 돌면서 값 타이틀 값이 있는 비교 하기
				title = scanner.nextLine();
				for (int i = 0; i < books.length; i++) { // 배열 전체를 돈다. 배열길이 현재 10000번
					if (books[i] != null) { // 방어적 코드 짜기
						if (title.equals(books[i].getTitle())) {
							System.out.println("책 제목 : " + books[i].getTitle());
							System.out.println("저자 : " + books[i].getAuthor());
						}
						// 인덱스에 아무것도 없을 때
//						if (!books[i].getTitle().isEmpty()) {
//							System.out.println("조회할 정보가 없습니다.");
//						}
					}
				}
			} // end of for
			if (userInput.equals("4")) {
				System.out.println("전체삭제");
				for (int i = 0; i < books.length; i++) {
					books[i] = null;
//					books[i].showInfo();
				}
			}

			if (userInput.equals("0")) {
				// 프로그램 종료
				flag = false;
				System.out.println("시스템 종료");
			}

		} // end of while

	} // end of main

}
