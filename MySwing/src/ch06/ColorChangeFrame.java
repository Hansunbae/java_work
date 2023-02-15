package ch06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorChangeFrame extends JFrame implements ActionListener {
	// 이벤트 리스너에 대한 개념을 알자

	private JButton button1;
	private JButton button2;

	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("click 1");
		button2 = new JButton("click 2");
	}

	public void setInitLayout() {
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		setVisible(true);
	}

	private void addEventListener() {

		// ColorChangeFrame 다형성이 적용이 되어서
		// ActionListener 타입으로도 바라 볼 수 있다.
		// 이벤트 리스너 등록
		// ---> 버튼을 눌렀을 때 나에게 알려달라고 운영체제에 등록, 인터페이스가 액션리스너로 약속 (2개의 약속)
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	// 코드 테스트
	public static void main(String[] args) {
		new ColorChangeFrame();
	} // end of main

	// actionPerformed 호출 되어짐 !
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 메소드 호출 됨");
		System.out.println(e.toString());
	}
} // end of class
