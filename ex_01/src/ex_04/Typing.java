package ex_04;

public class Typing {
	private String name;
	private int power;
	private int hp;
	
	public Typing(String name) {
		this.name = name;
		this.power = 5;
		this.hp= 80;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPower() {
		return this.power;
	}
	public int getHp() {
		return this.hp;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void study () {
		this.hp-=5;
	}

	public static void main(String[] args) {
		Typing typing1 = new Typing("도서괴물");
		
		Typing [] typings = new Typing[100]; // 도서괴물 묶음

	}

}
