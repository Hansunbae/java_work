package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch04.MyImageFrame.imagePanel;

public class MyImageFrame2 extends JFrame {

	private ImagePanel imagePanel; // 내부 클래스 멤버 변수로 선언

	public MyImageFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 연습");
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		add(imagePanel);
		setVisible(true);
	}

	// 정적 - 내부 클래스
	static class ImagePanel extends JPanel {
		private Image image;
		private Image image2;
		private Image image3;
		private Image image4;
		private Image image5;
		
		public ImagePanel() {

			image = new ImageIcon("image3.png").getImage();
			image2 = new ImageIcon("image4.png").getImage();
			image3 = new ImageIcon("image5.png").getImage();
			image4 = new ImageIcon("image6.png").getImage();
			image5 = new ImageIcon("background.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image5, 0, 0, 1000, 800, null);
			g.drawImage(image, 100, 485, 100, 100, null);
			g.drawImage(image2, 300, 300, 100, 100, null);
			g.drawImage(image3, 150, 280, 100, 100, null);
			g.drawImage(image4, 600, 280, 400, 300, null);
		}
	
	} // end of inner class

} // end of outer class
