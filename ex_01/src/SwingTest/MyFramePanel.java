package SwingTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel extends JFrame{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JPanel mypannel1;
	private JPanel mypannel2;
	
	public MyFramePanel() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("색깔 넣어서 만들기");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mypannel1 =new JPanel();
		mypannel1.setBackground(Color.red);
		mypannel2 = new JPanel();
		mypannel2.setBackground(Color.yellow);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		button4 = new JButton("button4");

		
	}

	private void setInitLayout() {
		add(mypannel1, BorderLayout.CENTER);
		add(mypannel2, BorderLayout.SOUTH);
//		mypannel1.setLayout(new FlowLayout(FlowLayout.LEFT,10,10) );
//		mypannel2.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10) );
		mypannel2.add(button1);
		mypannel2.add(button2);
		mypannel2.add(button3);
		mypannel2.add(button4);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyFramePanel();
	}

}
