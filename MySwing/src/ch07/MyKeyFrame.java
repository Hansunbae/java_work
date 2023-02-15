package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyFrame extends JFrame {
	private JTextArea area;
	// 1. 구현처리
	// 2. 익명 클래스
	public MyKeyFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		area = new JTextArea();

	}

	public void setInitLayout() {
		setVisible(true);
		add(area);
	}

	private void addEventListener() {
		KeyListener keyListener;
		area.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("key Typed : " + e.toString());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("key Released : " + e.toString());
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_UP) {
					area.append("방향키 위\n");
				}else if(e.getKeyCode()== KeyEvent.VK_DOWN) {
					area.append("방향키 아래\n");
				}else if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
					area.append("방향키 오른쪽\n");
				}else if(e.getKeyCode()== KeyEvent.VK_LEFT) {
					area.append("방향키 왼쪽\n");
				}
				
			}
		});
	}

}
