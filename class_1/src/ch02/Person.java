package ch02;

public class Person {
	private String name;
	private int age;
	private Address address;

	public Person(String name, int age, Address address) { // person class -> Address class에 의존
		// address = new Address("연수로 249번길 ", " 서울", "자이203호"," 123-456"); // 1002
		this.address = address;
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

}
