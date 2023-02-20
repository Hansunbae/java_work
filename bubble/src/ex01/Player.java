package ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable { // 구현 클래스

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

	public Player() {
		initData();
		setInitLayout();
	}

	private void initData() {
		// 초기화 --> new로 객체로 만들어 null point 방지 , 메모리에 올림
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
	}

	private void setInitLayout() {
		x = 55;
		y = 535;
		// 좌표기반, 라벨의 크기를 지정해야 한다.
		setSize(50, 50); // JLbel 기능
		setLocation(x, y);
		// JLabel에 아이콘을 셋팅하는 메서드 --> 메모리에 올린 이미지를 선택하여 올림
		setIcon(playerR);
	}

	@Override
	public void left() {
		setIcon(playerL);
		x = x - 10;
		setLocation(x, y);
	}

	@Override
	public void right() {
		setIcon(playerR);
		x = x + 10;
		setLocation(x, y);
	}

	@Override
	public void up() {
		System.out.println("점프 ! ");
	}

	@Override
	public void down() {
		System.out.println("p down");
	}
} // end of player
