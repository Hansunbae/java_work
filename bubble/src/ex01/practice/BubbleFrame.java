package ex01.practice;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	
	JLabel background;
	
	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	public void initData() {
		background = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(background);
		setSize(1000,640);
		
	}
	public void setInitLayout() {
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void addEventListener() {
		
	}



	public static void main(String[] args) {
		
		new BubbleFrame();
		
	} // end of main
	
} // end of class
