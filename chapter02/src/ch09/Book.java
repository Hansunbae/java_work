package ch09;

// ctrl + shift + o 만들어 줄거 만들어 주고 없애줄거 없애줌
public class Book {

	private int totalPage;
	private String title;
	private String author;
	

	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(int totalpage, String title, String author) {
		this(title, author);
		this.totalPage =totalpage;
	}
	
	
	public int getTotalPage() {
		return this.totalPage;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void showInfo() {
		int count=1;
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("------------------------------- ");
//		System.out.println(">>> 책정보 <<<");
	}
	
}
