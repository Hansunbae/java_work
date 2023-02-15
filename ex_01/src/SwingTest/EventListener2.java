package SwingTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventListener2 extends JFrame {
	JButton button1;
	public EventListener2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	public void initData() {
		setTitle("이벤트 리스너 연습3");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		
	}
	protected void addEventListener() {
		button1.addActionListener(new MyButtonListener());
	}
	private class MyButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton tagetBtn = (JButton) e.getSource();
			System.out.println(tagetBtn.getText());
			
		}
		
	}
	
	
	
}
