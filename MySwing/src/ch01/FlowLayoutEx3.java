package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame { // Jframe을
	// 멤버 변수를 선언할 수 있는가
	// 배열을 활용할 수 있는가
	// 생성자 + 메서드를 호출
	// 반복이 보인다면 for문 활용할 수 있는가?
	// GUI 프로그램 익숙해지기!

	// 배열
	private JButton[] buttons = new JButton[9];
	private FlowLayout flowLayout;

	// 1단계 JBoutton 2개 생성
	// 배치관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Component를 그려 주세요
	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		// 화면의 이름과 크기 결정
		setTitle("배열으로 만들어 배열으로 집어넣어라.");
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// for
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + i);
		}

		flowLayout = new FlowLayout(flowLayout.RIGHT, 20, 20);
	}

	public void setInitLayout() {
		setLayout(flowLayout);// 오른쪽 정렬 수평 20 , 수직 20
		// for
		for (int i = 1; i < buttons.length; i++) {
			add(buttons[i]);
		}
	}

	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}
