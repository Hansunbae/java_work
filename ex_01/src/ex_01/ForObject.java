package ex_01;

import java.util.Scanner;

public class ForObject {
	String name;
	String address;
	int age;
	int height;
	
	// 생성자 함수
	public ForObject (String name, String address, int age, int height) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(height);
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ForObject good = new ForObject("사랑이" ,"해운대구", 27, 163);
	good.showInfo();
	
	}
}
