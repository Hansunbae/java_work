package ch12;

public  class MyNoteBook extends NoteBook {
	@Override
	public void typing() {
		super.typing();
	}

	@Override
	public void display() {
		System.out.println("전원을 킵니다.");
	}
}
