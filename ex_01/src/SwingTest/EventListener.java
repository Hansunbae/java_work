package SwingTest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.InsetsUIResource;

public class EventListener extends JFrame implements ActionListener {
	JButton Button1;
	JButton Button2;

	public EventListener() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setTitle("이벤트 리스너 연습2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Button1 = new JButton("button1");
		Button2 = new JButton("button2");
	}

	public void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		this.add(Button1);
		this.add(Button2);

	}

	private void addEventListener() {
		Button1.addActionListener(this);
		Button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("이벤트가 발생 되었습니다.");
		JButton targetButton = (JButton) e.getSource();
		if (targetButton.getText().equals(Button1.getText())) {
			System.out.println("1번 버튼이 클릭 되었습니다.");
		} else {
			System.out.println("2번 버튼이 클릭 되었습니다.");
		}

	}

}
