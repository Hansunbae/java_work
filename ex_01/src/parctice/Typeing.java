package parctice;

public class Typeing {
	String Write;
	int number;
	
	public Typeing(String write, int number) {
		this.Write= write;
		this.number = number;
	}
	
	public static void main(String[] args) {
		Document document1 =new Document("책 1", 100);
		Typeing typeing1 = new Document("책2", 100);
		Typeing typeing2 = new Typeing("책3", 100);
		
		System.out.println(document1);
		System.out.println(typeing1);
		System.out.println(typeing2);
		System.out.println(document1.Write);
		System.out.println(typeing1.Write);
		System.out.println(typeing2.Write);
		
	}
	
}

class Document extends Typeing{
	public Document(String write, int number) {
		super(write, number);
	}
}

class Search{
	public Search() {
		
	}
}


