package ch04;

public abstract class Container {
	String name;
	int Size;
	int UseCount;
	
	public Container(String name, int size, int usecount) {
		this.name= name;
		this.Size = size;
		this.UseCount = usecount;
	}
	
	public abstract void open();
	public abstract void close();
	public abstract void put();

	
}
