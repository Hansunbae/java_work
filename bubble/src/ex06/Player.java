package ex06;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable { // 구현 클래스

	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	
	// 플레이어에 방향 상태(enum 타입 사용 : 데이터의 범주화)
	private playerWay pWay;
	

	// 플레이어의 현재 움직임 상태를 기록
	private boolean left; // 불리언 초기화 안했을 때 기본값 false
	private boolean right;
	private boolean up;
	private boolean down;

	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;

	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	public Player() {
		initData();
		setInitLayout();
	}

	public playerWay getpWay() {
		return pWay;
	}

	public void setpWay(playerWay pWay) {
		this.pWay = pWay;
	}

	// getter 메서드 추가 left,right , isLeftWallCrash 추가 isRightwallCrash 추가
	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isLeft() {
		return left;
	}

	public boolean isRight() {
		return right;
	}

	private void initData() {
		// 초기화 --> new로 객체로 만들어 null point 방지 , 메모리에 올림
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;
		pWay = playerWay.RIGHT;
	}

	private void setInitLayout() {
		x = 500;
		y = 535;
		// 좌표기반, 라벨의 크기를 지정해야 한다.
		setSize(50, 50); // JLbel 기능
		setLocation(x, y);
		// JLabel에 아이콘을 셋팅하는 메서드 --> 메모리에 올린 이미지를 선택하여 올림
		setIcon(playerR);
	}

	@Override
	public void left() {
		pWay = playerWay.LEFT;
		left = true;
		// 한 번 키보드 왼쪽 방향키를 누르면 쓰레드 생성이 된다.
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x = x - SPEED; // 4만큼 왼쪽 이동
					setLocation(x, y);
					try {
						Thread.sleep(10); // 반복문이 너무 빠르게 도는 것을 방지
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void right() {
		pWay = playerWay.RIGHT;
		right = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x = x + SPEED; // 4만큼 오른쪽 이동
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void up() {
		System.out.println("점프 ! ");
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				up = false;
				down();
			}
		}).start();
	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (down) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					down = false;
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			
				// 상태값 다룰 때는 상황이 변하면 초기화 처리를 잘 해야한다.
			}
		}).start();
	}
} // end of player
