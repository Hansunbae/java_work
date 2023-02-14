package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	
	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("한 번 해보는 실습");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("button1");
		button1.setSize(150, 150);
		button2 = new JButton("button2");
		button2.setSize(50, 50);
		button3 = new JButton("button3");
		button3.setSize(50, 50);
		button4 = new JButton("button4");
		button4.setSize(150, 150);
		
	}

	private void setInitLayout() {
		setLayout(null);
		add(button1);
		button1.setLocation(400,400);
		add(button2);
		button2.setLocation(350,500);
		add(button3);
		button3.setLocation(550,500);
		setVisible(true);
		button4.setLocation(600,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
