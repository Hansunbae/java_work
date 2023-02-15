package SwingTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {

	JButton button1;

	public MyFrame2() {
		iniData();
		setInitLayout();
		addEventListener();
	}

	private void iniData() {
		setTitle("이벤트 리스너 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
	}

	protected void addEventListener() {
		button1.addActionListener(new MyButtonListener());
	}
	
	private class MyButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton targetBtn = (JButton)e.getSource();
			System.out.println(targetBtn.getText());
		}
	}// end of inner class 
	

}


