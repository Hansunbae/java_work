package ch06;

public class Bank {

	// 변수 앞에 아무것도 지정하지 않으면 default (접근 제어 지시자 이다.)
	// int balance; // 돈 액수
	// private -> class Bank {여기 안에서만 접근 가능 }
	private int balance; // 이 페이지안에서만 접근 가능
	public String name;

	// 입금하다.
	public void deposit(int money) {
		balance += money;
		showInfo();
	}

	// 출금하다.
	public void withdraw(int money) {
		balance -= money;
		showInfo();
	}

	public void showInfo() { // 한 번 만들어 여러번 사용하기 위해 만듬
		System.out.println("현재 계좌 잔액은 : " + balance + "입니다.");
	}

	// get 메서드 만들기
	// get -> read only 성질을 가진다 --> 데이터를 주입 받지 못하고 리턴만 시킨다.
	public int getBalance() {
		return this.balance;
	}

	// set 메서드 만들기 -- > 외부에서 값을 주입 받을 수 있도록설계
	// private 변수에 접근해서 값을 입력하기 위해 사용
	public void setBalance(int money) {
		// 방어적 코드 작성
		if (money <= 0) {
			System.out.println("잘못된 입력값 입니다.");
			return; // < -- 함수 , 메서드의 실행을 종료한다. else 문 쓰지않고
		}
		this.balance = money;
	}

}
