package ch10;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame extends JFrame implements KeyListener {
	// BufferedImage
	// 배경 이미지
	BufferedImage backgroundMap;
	// 캐릭터 어몽어스 이미지1
	BufferedImage pinkImage1;

	BufferedImage grayRight;
	BufferedImage grayLeft;
	BufferedImage container;

	// 캐릭터 어몽어스 (적군) 이미지 1
	BufferedImage grayImage1;
	// jPanel 상속 --> inner class
	CustomPanel customPanel;

	int pinkX = 200;
	int pinkY = 200;
	int grayX = -20;
	int grayY = 400;
	boolean isRight1 = true;

	public AmongUsFrame() {
		initData();
		setInitLayout();
		addEventListener();
//		Thread thread = new Thread(customPanel);
//		thread.start();
		new Thread(customPanel).start();

	}

	private void initData() {
		setTitle("미니 어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이미지 3개 있음, CustomPanel
		try {
			backgroundMap = ImageIO.read(new File("images/Mybackground.jpg"));
			pinkImage1 = ImageIO.read(new File("images/pink_image1.png"));
			grayRight = ImageIO.read(new File("images/gray_right_image.png"));
			grayLeft = ImageIO.read(new File("images/gray_left_image.png"));
			grayImage1 = ImageIO.read(new File("images/grey_image1.png"));

		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		}
		// CustomPanel 메모리에 올라가는 순간 paintComponernt()메서드 호출
		customPanel = new CustomPanel();
	}

	private void setInitLayout() {
		// 레이아웃은 기본 레이아웃 기반으로 설정함
		// add 호출시 paintComponent 메서드 실행됨
		add(customPanel);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(this); // 이벤트 리스너 등록 처리
	}

	// jPanel 상속 --> inner class
	class CustomPanel extends JPanel implements Runnable {

		// boolean isRight = true;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			// g.drawImage(pinkImage1, pinkX, pinkY, 100, 100, null);
			if (isRight1 == false) {
				g.drawImage(grayRight, pinkX, pinkY, 100, 100, null);
				return;
			}
			g.drawImage(grayLeft, pinkX, pinkY, 100, 100, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean isRight = true;
			while (true) {
				if (isRight) {
					grayX += 10;
				} else {
					grayX -= 10;
				}
				// 방향 체크
				if (grayX == 500) {
					isRight = false;
				}
				if (grayX == -20) {
					isRight = true;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (pinkX == grayX && pinkY == grayY) {
					// pinkImage1 = null;
					grayRight = null;
					grayLeft = null;
				}

				repaint();
			}
		}
	} // end of inner class

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int keyCode = e.getKeyCode();
		// System.out.println("keyCode : " + keyCode);
		if (keyCode == KeyEvent.VK_LEFT) {
			container = grayLeft;
			if (isRight1 == true) {
				grayLeft = grayRight;
				isRight1 = false;
			}
			if (isRight1 == false) {
				grayRight = container;
				isRight1 = true;
			}
			// 왼쪽
			pinkX = (pinkX < 0) ? -20 : pinkX - 10;
			// pinkX -= 10;

		} else if (keyCode == KeyEvent.VK_RIGHT) {
			// 삼항 연산자 복습 !

			container = grayLeft;
			if (isRight1 == true) {
				grayLeft = grayRight;
				isRight1 = false;
			}
			if (isRight1 == false) {
				grayRight = container;
				isRight1 = true;
			}
			pinkX = (pinkX > 500) ? 505 : pinkX + 10;

			// pinkX += 10;

		} else if (keyCode == KeyEvent.VK_UP) {
			container = grayLeft;
			if (isRight1 == true) {
				grayLeft = grayRight;
				isRight1 = false;
			}
			if (isRight1 == false) {
				grayRight = container;
				isRight1 = true;
			}
			pinkY = (pinkY < 0) ? -10 : pinkY - 10;
			// pinkY -= 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			container = grayLeft;
			if (isRight1 == true) {
				grayLeft = grayRight;
				isRight1 = false;
			}
			if (isRight1 == false) {
				grayRight = container;
				isRight1 = true;
			}
			pinkY = (pinkY > 465) ? 475 : pinkY + 10;
			// pinkY += 10;
		}

		// 그림을 다시 그려 주다 실행 paint 메서드가 다시 실행된다.
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
} // end of outer class
