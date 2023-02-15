package SwingTest;

import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutTest extends JFrame{
	JButton[] buttons =new JButton[5];
	
	private JButton button1;
	
	public NoLayoutTest() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("좌표기반 레이아웃");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼"+ i);
			buttons[i].setSize(100,100);
		}

		
	}
	
	public void setInitLayout() {
		setLayout(null);
		for (int i = 0; i < buttons.length; i++) {
			if(buttons[i] !=null) {
				
				add(buttons[i]);
			}
		}
		
		buttons[0].setLocation(100,10);
		buttons[1].setLocation(200,20);
		buttons[2].setLocation(300,30);
		buttons[3].setLocation(400,40);
		buttons[4].setLocation(500,50);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NoLayoutTest();
	}
}
