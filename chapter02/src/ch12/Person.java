package ch12;

public class Person extends Human {

	@Override
	public void hunt() {
		// 1000줄 부모 메서드와 똑같아야함!!!
		super.hunt(); // super. <--- 부모인 휴먼의 메서들를 호출하라는 의미
		System.out.println("야는 사람이야 !!!"); 
		
		//
	}

}
