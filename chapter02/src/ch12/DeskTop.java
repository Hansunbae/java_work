package ch12;

public class DeskTop extends Computer {
	@Override
	public void display() {
		System.out.println("화면을 켭니다.");
	}

	@Override
	public void typing() {
		System.out.println("자판을 칩니다.");
	}

}
