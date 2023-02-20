package ex04;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

		// player 메모리에 올라가있는 상태이다.
		// 약속 run 메서드 안에 동작을 처리한다.
		new Thread(new BackgroundPlayerService(player)).start();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 윈도우 하위에 JPanel은 패널 만들지 않고도 기본으로 사용할 수 있는 루트 페인(패널)이 들어있다.
		setContentPane(backgroundMap); // 패널 따로 만들지 않고 배경을 루트페인에 올림
		setSize(1000, 640);
		player = new Player();
	}

	private void setInitLayout() {
		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치 -- > 배경 이미지 중앙으로
		setVisible(true);
		add(player);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 38 , 40 , 39 등 방향키 값이 들어오면
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러번 누르더라도 한번만 호출되게 방어적 코드 작성
					// false
					// true <-- 변경 !!
					// 한번더 누르면 <- 현재 상태값 true
					if (player.isLeft() == false && player.isLeftWallCrash() == false) {
						player.left();
					}

					break;
				case KeyEvent.VK_RIGHT:
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();
					}
					// 로직 작성
					break; // 세미콜론

				case KeyEvent.VK_UP:
					player.up();
					// 로직 작성
					break;

				case KeyEvent.VK_DOWN:
					player.down();
					break;
				}
			} // end of keyPressed

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을 떼면 player는 멈춰야 해
					player.setLeft(false);
					break;

				case KeyEvent.VK_RIGHT:
					// 오른쪽 버튼을 떼면 player는 멈춰야 해
					player.setRight(false);
					break;

				}
			}

		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main
} // end of class