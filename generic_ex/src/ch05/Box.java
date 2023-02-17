package ch05;

public class Box<T extends Items> {

	private T contents;

	public T getContents() {
		return contents;
	}

	public void setContents(T contents) {
		this.contents = contents;
	}

	public Box() {
		this.contents = null;
	}

	// 넣다
	public void put(T item) {
		this.contents = item;
	}

	// 꺼내다
	public T take() {
		T item = this.contents;
		System.out.println(item + " 을 꺼냈습니다.");
		this.contents = null;
		return item;
	}

	public boolean isEmpty() {
		return this.contents == null;
	}

}
