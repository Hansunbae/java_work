package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange extends JFrame implements ActionListener {

	private JPanel panel;
	private JPanel panel2;
	private JPanel panel3;
	private FlowLayout flowLayout;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;

	public ColorChange() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		button1 = new JButton("click1");
		button2 = new JButton("click2");
		button3 = new JButton("click3");
		button4 = new JButton("click4");
		button5 = new JButton("click5");
		button6 = new JButton("click6");
		button7 = new JButton("click7");
	}

	private void setInitLayout() {

		// Frame -> 기본이 borderLayout, 센터
		add(panel);
		add(panel2,BorderLayout.SOUTH);
		add(panel3,BorderLayout.WEST);
		panel.setBackground(Color.yellow);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		
		setVisible(true);
	}

	private void addEventListener() {
		// this -> ColorChange -> ActionListener 타입으로 바라 볼 수 있다.
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
	}

	// 테스트 코드 
	public static void main(String[] args) {
		
		new ColorChange();
	} // end of main 
	
	// 약속 되어진 메서드 
	// 이벤트가 일어나면 운영체제가 actionPerformed 메서드를 호출 시켜준다. 
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() --> Object 
		// 다운 캐스팅 버튼으로 코드 작성 
		JButton targetButton = (JButton)e.getSource(); // getSource는 주소값
		// targetButton.setText("눌러짐 버튼입니다.");
		//System.out.println(targetButton.getText());
		
//		System.out.println(e.getSource());
//		if(e.getSource() == this.button1) {
//			panel.setBackground(Color.gray);
//		}  else {
//			panel.setBackground(Color.yellow);
//		}
		
		// 문제 1 
		// 문자열을 비교해서 색상 변경 시키는 코드를 작성해 주세요 
		if(targetButton.getText().equals(this.button1.getText())) {
			panel.setBackground(Color.red);
		} else if(targetButton.getText().equals(this.button2.getText())) {
			panel.setBackground(Color.orange);
		} else if(targetButton.getText().equals(this.button3.getText())) {
			panel.setBackground(Color.yellow);
		} else if(targetButton.getText().equals(this.button4.getText())) {
			panel.setBackground(Color.green);
		} else if(targetButton.getText().equals(this.button5.getText())) {
			panel.setBackground(Color.blue);
		} else if(targetButton.getText().equals(this.button6.getText())) {
			panel.setBackground(Color.CYAN);
		} else if(targetButton.getText().equals(this.button7.getText())) {
			panel.setBackground(Color.MAGENTA);
		}
		
		
	}

} // end of class
