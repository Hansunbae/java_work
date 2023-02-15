package SwingTest;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrameDraw extends JFrame {
	drawPanel drawPanel;
	
	
	class drawPanel  extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawArc(20, 118, 90, 90, 200, 350);
			
			g.drawRect(350, 350, 200, 200);
			
		}
		
	}
	public MyFrameDraw() {
		initData();
		setInitLayout();
	}
	public void initData() {
		setTitle("그려본다");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel =new drawPanel();
		
	}
	public void setInitLayout() {
//		add(drawPanel);
		add(drawPanel);
		setVisible(true);
		
	}
	
}
