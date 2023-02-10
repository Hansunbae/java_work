package ch12;

public class MainTest2 {
	public static void main(String[] args) {
		Computer computer1 = new MyNoteBook();
		Computer computer2 = new NoteBook() {
			// NoteBook noteBook = new NoteBook(); // NoteBook이 abstract 라서 객체 생성안됨

			public void display() {

			}
		};

		computer1.display(); // MyNoteBook에 있는 메서드 실행
		computer2.typing(); // NoteBook에 있는 typing 메서드 실행
		System.out.println("-------------");

	}
}
