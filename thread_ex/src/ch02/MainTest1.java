package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		// 현재 잔액 100_000만원
		BankAccount bankAccount = new BankAccount(); // money 10_0000을 가지고 있는 객체생성

		Father father = new Father(bankAccount); // 위를 father 객체에 넣어 생성
		Mother mother = new Mother(bankAccount);

		// 아버지 입금하기
		father.start(); // 3초 걸림
		// 어머니가 출금
		mother.start();

		// 정상 처리 : 10만원 + 1만원 - 5천원 = 10만 5천원 < --- 정상 동작
	}

}
