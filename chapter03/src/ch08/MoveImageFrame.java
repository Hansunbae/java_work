package ch08;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MoveImageFrame extends JFrame {
	
	private Mypannel imagePanel;
	static class Mypannel extends JPanel{
		
		private Image image1;
		
		public Mypannel() {
			image1 = new ImageIcon("image3.png").getImage();
		}
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image1, 10, 10, 100, 100, null);
		}
	}
	private JLabel image;
	private int X;
	private int Y;
	private LineBorder bb = new LineBorder(Color.black, 1, true);

	public MoveImageFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setTitle("혼자해보는 이미지 이동");
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		X = 100;
		Y = 100;
		imagePanel = new Mypannel();
		image = new JLabel(new ImageIcon("image6.png"));
		

	}

	public void setInitLayout() {
//		setLayout(null);
		add(image);
		add(imagePanel);
		image.setSize(300, 505);
		image.setBorder(bb);
		image.setLocation(X, Y);
		imagePanel.setLocation(X, Y);
		imagePanel.setBorder(bb);
		
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (X < 700) {
						int x = X += 50;
						int y = Y;
						image.setLocation(x, y);
						imagePanel.setLocation(x, y);
					}
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (X > 0) {
						int x = X -= 30;
						int y = Y;
						image.setLocation(x, y);
						imagePanel.setLocation(x, y);
					}

				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					if (Y < 450) {
						int x = X ;
						int y = Y+= 50;
						image.setLocation(x, y);
						imagePanel.setLocation(x, y);
					}

				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (Y > 0 ) {
						int x = X ;
						int y = Y-= 50;
						image.setLocation(x, y);
						imagePanel.setLocation(x, y);
					}
				}

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	public static void main(String[] args) {
		new MoveImageFrame();
	
	}
}
