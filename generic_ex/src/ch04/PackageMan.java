package ch04;

public class PackageMan<T extends Container> {
	private T container;

	public T getContainer() {
		return container;
	}

	public void setContainer(T container) {
		this.container = container;
	}

	@Override
	public String toString() {
		
		return container.toString();
	}
	public void work(T container) {
		this.container = container;
	}
	
	final public void pakaging(T container) {
		//Box box = new Box();
		Container con = container;
		con.open();
		con.put();
		con.close();
		
		
		
	}
}
