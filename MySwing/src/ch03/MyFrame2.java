package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {

	DrawPanel drawPanel;

	class DrawPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			int[] xpoint = { 10, 30, 50, 40, 20 };
			int[] ypoint = { 107, 90, 107, 130, 130 };

			g.drawRect(150, 200, 300, 200); // 집 몸체
			g.drawRect(170, 220, 70, 55); // 창문 만들기
			g.drawLine(170, 250, 240, 250); // 창문 틀 가로
			g.drawLine(205, 220, 205, 275); // 창문 틀 세로
			g.drawRect(250, 300, 80, 100); // 문 만들기
			g.drawOval(315, 350, 8, 8); // 문 손잡이
			g.drawOval(270, 130, 50, 50); // 지붕 원형장식
			g.drawRect(20, 480, 65, 65); // 선물 만들기
			g.drawLine(20, 480, 52, 460); // 선물 위 좌측
			g.drawLine(85, 480, 117, 460); // 선물 위 우측
			g.drawLine(52, 460, 117, 460); // 선물 위
			g.drawLine(85, 545, 117, 460); // 선물 위 우측

			g.drawLine(300, 80, 90, 200); // 지붕 왼쪽
			g.drawLine(300, 80, 510, 200); // 지붕 오른쪽
			g.drawLine(98, 195, 500, 195); // 지붕 아랫쪽
			g.drawLine(88, 200, 510, 200); // 지붕 아랫쪽
			g.drawLine(0, 350, 150, 350); // 지평선 왼쪽
			g.drawLine(450, 350, 600, 350); // 지평선 오른쪽

			g.drawString("★", 50, 50); // 별
			g.drawString("★", 100, 100);
			g.drawString("★", 150, 50);
			g.drawString("★", 200, 100);
			g.drawString("★", 250, 50);
			g.drawString("★", 350, 50);
			g.drawString("★", 400, 100);
			g.drawString("★", 450, 50);
			g.drawString("★", 500, 100);
			g.drawString("★", 550, 50);
			g.drawPolygon(xpoint, ypoint, xpoint.length); // 다각형
		}
	}

	// 내부 클래스를 활용해서
	// Jpanel 을 상속 받고 paint 메서드로
	// 집 그림을 그려주세요
	public MyFrame2() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("집그림 그리기");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new DrawPanel();
	}

	public void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}

} // end of class
