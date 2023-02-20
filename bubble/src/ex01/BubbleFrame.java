package ex01;

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
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 루트 페인
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
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
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
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main
} // end of class
