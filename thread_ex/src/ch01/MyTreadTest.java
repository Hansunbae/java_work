package ch01;

import java.util.Iterator;

public class MyTreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		NamePrinter namePrinter1 = new NamePrinter("원피스");
		System.out.println(namePrinter1.CartoonTitle); 
		namePrinter1.start();
		agePrinter agePrinter1 = new agePrinter("나이 머신");
		agePrinter1.start();
	}
}

// 작업자 1
class NamePrinter extends Thread {

	String CartoonTitle;
	String[] id = new String[5];

	public NamePrinter(String name) {
		this.CartoonTitle = name;
	}

	@Override
	public void run() {
		id[0] = "루피";
		id[1] = "나미";
		id[2] = "조로";
		id[3] = "우솝";
		id[4] = "브룩";
		for (int i = 0; i < id.length; i++) {
			System.out.println(id[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end of run
} // end of class

// 작업자 2
class agePrinter extends Thread {
	int[] arr = new int[5];
	String name;

	public agePrinter(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}