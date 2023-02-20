package ex01.practice;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable { // 구현 클래스
	int x;
	int y;
	ImageIcon playerR;
	ImageIcon playerL;
	
	private boolean left; // 초기화 안했을 때 false
	private boolean right;
	private boolean up;
	private boolean down;
	
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	public Player() {
		initData();
		setInitLayout();
	}

	private void initData() {
		playerL = new ImageIcon("images/playerL.png");
		playerR = new ImageIcon("images/playerR.png");
	}

	private void setInitLayout() {
		x = 55;
		y = 535;
		setSize(50, 50);
		setLocation(x, y);
		setIcon(playerR);
	}

	@Override
	public void left() {
		left = true;
	
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				while(left) {
					setIcon(playerL);
					x += SPEED;
					setLocation(x,y);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void right() {
		setIcon(playerR);
		x = x +10;
		setLocation(x, y);
	}

	@Override
	public void up() {
		System.out.println("점프");
	}

	@Override
	public void down() {
		System.out.println("p down");
	}

} // end of player
