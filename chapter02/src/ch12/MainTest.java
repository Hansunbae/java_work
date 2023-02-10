package ch12;

public class MainTest {

	public static void main(String[] args) {
		// 기본적으로 추상클래스는 new 할 수 없다.
		// abstract --> 개발자한테 직접 new를 막아버림 ->객체 생성하지 못함
		 // 라면이나 동물을 객체로 할 수 없다와 동일 ---> 형체가 애초에 없음
		// Animal animal = new Animal();  <-- 추상클래스
		Animal animalHuman = new Human();
		animalHuman.hunt();
		
		System.out.println("-----------------------");
		Animal animalPerson = new Person();
		animalPerson.hunt(); // 런타임시점에 person의 메서드를 호출한다.
	

	}

}
