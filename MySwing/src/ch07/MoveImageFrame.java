package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveImageFrame extends JFrame implements Moveable {

	private JLabel player;
	private int X;
	private int Y;

	public MoveImageFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setSize(800, 800);
		setResizable(false);
		X = 300;
		Y = 350;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		player = new JLabel(new ImageIcon("images/image3.png"));
		player.setSize(100, 100);
	}

	public void setInitLayout() {
		setLayout(null);
		player.setLocation(X, Y);
		add(player);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
	}

	@Override
	public void right() {
		if ((X + 50) < 700) {
			int x = X += 50;
			int y = Y;
			player.setLocation(x, y);
		}

	}

	@Override
	public void left() {
		if (X > 0) {
			int x = X -= 50;
			int y = Y;
			player.setLocation(x, y);
		}

	}

	@Override
	public void up() {
		if (Y > 0) {
			int x = X;
			int y = Y -= 50;
			player.setLocation(x, y);
		}
	}

	@Override
	public void down() {
		if (Y < 650) {
			int x = X;
			int y = Y += 50;
			player.setLocation(x, y);
		}

	}
}
