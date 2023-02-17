package SwingTest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageGame extends JFrame{
	
	JLabel character;
	int X = 350;
	int Y = 350;
	
	public ImageGame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	public void initData() {
		setSize(800,800);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		character =new  JLabel(new ImageIcon("image5c.png"));
	}
	public void setInitLayout() {
		setLayout(null);
		add(character);
		character.setLocation(X, Y);
		setVisible(true);
	}
	private void addEventListener() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
					if(X<700) {
						int x = X+=50;
						int y = Y;
						character.setLocation(x, y);
					}
				}
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
	}
	public static void main(String[] args) {
		new ImageGame();
	}
}
