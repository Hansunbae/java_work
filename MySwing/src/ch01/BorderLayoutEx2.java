package ch01;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx2 extends JFrame {
	// BordeLayout <--- 컴포넌트들을 동 서 남 북 센터

	// 배열과 for문 활용해서 코드 수정
	// String[] direction = new String[5];
	// 변수 선언과 동시에 초기화!!
	String[] direction = { BorderLayout.EAST, BorderLayout.WEST, 
			BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.CENTER};
	
	JButton[] buttons = new JButton[5];


	public BorderLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("borderlayout 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(direction[i]);
		}
	}

	private void setInitLayout() {
		// setLayout(new BorderLayout()); // 기본 레이아웃은 BorderLayout 이다.
		// borderLayout , 매개변수 값 하나를 더 추가 시킬 수 잇다( 방향지정 가능)
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], direction[i]);
		}
		setVisible(true);
	}

	// 코드 테스트
	public static void main(String[] args) {
		new BorderLayoutEx2();
	
		//
	}// end of main
}
