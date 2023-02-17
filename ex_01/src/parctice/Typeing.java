package parctice;

import javax.swing.JFrame;

public class Typeing extends JFrame {
	String Write;
	int number;
	
	private void frameWork() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	private void setInitLayout() {
		setVisible(true);
	}
	
	private void addEventListener() {
		
	}
	public static void main(String[] args) {
		

	}

}
