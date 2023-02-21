package ch07;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		// 문제
		// d object에 있는 value 값을 화면에 출력 해주세요

		System.out.println(a.b.c.d.value);

		System.out.println("---------------------");
		String string = a.b.c.d.arrayList.toString();
		System.out.println(string);

		System.out.println("---------------------");
		for (int i = 0; i < a.b.c.d.arrayList.size(); i++) {
			System.out.println(a.b.c.d.arrayList.get(i));
		}
	}
}
