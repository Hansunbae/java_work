package ch03;

import java.util.Scanner;

public class CoffeShop {

	private static Coffee[] coffees = { 
			new Coffee("아메리카노", 3000), 
			new Coffee("카페라떼", 4000),
			new Coffee("카푸치노", 4500) 
			};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객 이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("고객잔액을 입력하세요");
		int balance = scanner.nextInt();
		Customer customer = new Customer(name, balance);
		System.out.println(">>> 커피 메뉴 <<<");
		
		for(int i =0; i < coffees.length; i++) {
			System.out.println((i+1)+ "." +coffees[i].getName() + "(" + coffees[i].getPrice()+ ") 원");
		}
		System.out.println("커피를 선택하세요");
		int orderNumber = scanner.nextInt();
		
		// 어떤 커피를 선택하였는지 알 수 있는 코드를 작성을 해보면
		// 고객이 입력하는 실제 번호 1 2 3  <---  index 번호 0 1 2
		Coffee coffee = coffees[orderNumber-1];
		// 고객이 커피를 사다.
		
		customer.buyCoffe(coffee);
		System.out.println("잔액 확인");
		System.out.println(customer.getBalance());
		scanner.close(); // 메모리 해제
		
	} // end of main

}
