package parctice;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Typeing  extends JFrame implements KeyListener{
	
	MyPannel myPannel;
	
	public Typeing() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	public void initData() {
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void setInitLayout() {
		setVisible(true);
	}
	public void addEventListener() {
		
	}
	
	class MyPannel extends JPanel{
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if(keyCode == KeyEvent.VK_RIGHT) {
			
		} else if ( keyCode == KeyEvent.VK_LEFT ) {
			
		} else if (keyCode == KeyEvent.VK_UP) {
			
		}else if (keyCode == KeyEvent.VK_DOWN) {
			
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
}
