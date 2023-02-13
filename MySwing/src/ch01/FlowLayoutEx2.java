package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx2 extends JFrame { // Jframe을
	
	private JButton button1;
	private JButton button2;
	
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private FlowLayout flowLayout;

	// 1단계 JBoutton 2개 생성
	// 배치관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Component를 그려 주세요
	public FlowLayoutEx2() {
		initData();
		setInitLayout();

	}

	private void initData() {
		// 화면의 이름과 크기 결정
		setTitle("이름을 정한다.");
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		flowLayout = new FlowLayout(flowLayout.RIGHT,20,20);

	}

	public void setInitLayout() {
		setLayout(flowLayout);// 왼쪽 정렬 수평 10 , 수직 10
		add(button1); // 판에 올리기
		add(button2);

	}

	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
