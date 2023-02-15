package SwingTest;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageFrame extends JFrame {
	imagePanel imagePanel;

	static class imagePanel extends JPanel {
		Image image;

		public imagePanel() { // 단순히 변수에 넣은것
			image = new ImageIcon("image6.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 100, 100, 500, 400, null);
		}

	}

	public ImageFrame() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("이것은 반복 반복만이 살길");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new imagePanel();
	}

	public void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}

}
