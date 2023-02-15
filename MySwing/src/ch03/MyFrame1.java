package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 학습 목표
 * 내부 클래스 , 외부 클래스
 */
// 외부 클래스 outer class
public class MyFrame1 extends JFrame {

	MyDrawPanel drawPanel; // 멤버 변수 선언

	// 내부 클래스 선언 - inner class
	// 내부 클래스에는 - 정적 클래스, 인스턴스 클래스
	// 정적 : static < ---(new 접근 가능!!) 클래스 접근 가능
	// 인스 : new를해주어야 한다 . 외부 클래스가 new, 내부 클래스 new 되어야한다.
	class MyDrawPanel extends JPanel {
		// paints --> x
		// print--> x
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(100, 100, 100, 200); // 사각형 만들어주는 기능
			g.drawRect(100, 50, 50, 50);
			g.drawString("반가워", 300, 300);
			g.drawLine(250,300,500,550);
			g.drawOval(300, 300, 50, 50);
		}
	}

	public MyFrame1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("내부 클래스란");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}

} // end of class
