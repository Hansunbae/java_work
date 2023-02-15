package SwingTest;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest  extends JFrame{
	
	String[] direction = {BorderLayout.EAST, BorderLayout.WEST, BorderLayout.SOUTH, BorderLayout.NORTH, BorderLayout.CENTER};
	JButton[] buttons = new JButton[5];
	String [] myword = { "굿", "어썸", "그레잇", "나이스", "에이스"};

	public BorderLayoutTest() {
		initData();
		setinitLayout();
		
	}
	public void initData() {
		setTitle("보더 레이아웃 만들기");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < direction.length; i++) {
			buttons[i] = new JButton(myword[i]);
		}
		
	}
	public void setinitLayout() {
		for (int i = 0; i < direction.length; i++) {
			
			add(buttons[i], direction[i]);
		}

		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutTest();
	} 

}
