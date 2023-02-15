package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeHan extends JFrame implements ActionListener {

	
	private JPanel panel;
	private JPanel panel1;

	private JButton[] buttons = new JButton[7];

	public ColorChangeHan() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("배열로 버튼 넣음");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel1 =new JPanel();
	
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("click" + i);
		}
	}

	private void setInitLayout() {
//		setLayout(new FlowLayout( FlowLayout.LEFT, 10 , 200));
		// Frame -> 기본이 borderLayout, 센터
		add(panel);
		add(panel1);
		
		panel.setBackground(Color.yellow);
		for (int i = 0; i < buttons.length; i++) {
//			panel.add(buttons[i]);
			panel1.add(buttons[i]);
		}
		

		setVisible(true);
	}

	private void addEventListener() {
		// this -> ColorChange -> ActionListener 타입으로 바라 볼 수 있다.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}
	}

	// 테스트 코드
	public static void main(String[] args) {
		new ColorChangeHan();
	} // end of main

	// 약속 되어진 메서드
	// 이벤트가 일어나면 운영체제가 actionPerformed 메서드를 호출 시켜준다.
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() --> Object
		// 다운 캐스팅 버튼으로 코드 작성
		JButton targetButton = (JButton) e.getSource(); // getSource는 주소값
		// targetButton.setText("눌러짐 버튼입니다.");
//		 System.out.println(targetButton.getText());


//		System.out.println(e.getSource());
//		if(e.getSource() == this.buttons[0]) {
//			panel.setBackground(Color.gray);
//		}  else {
//			panel.setBackground(Color.yellow);
//		}

		// 문제 1
		// 문자열을 비교해서 색상 변경 시키는 코드를 작성해 주세요
		if (targetButton.getText().equals(this.buttons[0].getText())) {
			panel1.setBackground(Color.red);
		} else if (targetButton.getText().equals(this.buttons[1].getText())) {
			panel1.setBackground(Color.orange);
		} else if (targetButton.getText().equals(this.buttons[2].getText())) {
			panel1.setBackground(Color.yellow);
		} else if (targetButton.getText().equals(this.buttons[3].getText())) {
			panel1.setBackground(Color.green);
		} else if (targetButton.getText().equals(this.buttons[4].getText())) {
			panel1.setBackground(Color.blue);
		} else if (targetButton.getText().equals(this.buttons[5].getText())) {
			panel1.setBackground(Color.CYAN);
		} else if (targetButton.getText().equals(this.buttons[6].getText())) {
			panel1.setBackground(Color.MAGENTA);
		}

	}

} // end of class
