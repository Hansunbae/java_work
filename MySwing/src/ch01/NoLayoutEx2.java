package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame {
	private JButton[] buttons = new JButton[8];

	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("한 번 해보는 실습");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));
		}

		if (buttons != null) {

			buttons[0].setSize(150, 150);
			buttons[1].setSize(50, 50);
			buttons[2].setSize(50, 50);
			buttons[3].setSize(250, 150); // 몸통
			buttons[4].setSize(50, 150);
			buttons[5].setSize(50, 150);
			buttons[6].setSize(60, 30);
			buttons[7].setSize(60, 30);
		}

	}

	private void setInitLayout() {
		setLayout(null);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i]);
		}

		buttons[0].setLocation(400, 400);
		buttons[1].setLocation(350, 500);
		buttons[2].setLocation(550, 500);
		buttons[3].setLocation(350, 550);
		buttons[4].setLocation(400, 700);
		buttons[5].setLocation(500, 700);
		buttons[6].setLocation(395, 850);
		buttons[7].setLocation(495, 850);

		setVisible(true);
	}

	public static void main(String[] args) {
		new NoLayoutEx2();
	}
}
