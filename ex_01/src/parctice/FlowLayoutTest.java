package parctice;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {
	private JButton[] button = new JButton[5];
	private FlowLayout flowLayout;
	
	public FlowLayoutTest() {
		initData();
		setInitLayout();
	}
	
	public void initData() {
		setTitle("연습");
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		flowLayout = new FlowLayout(flowLayout.RIGHT,10, 10);
		for (int i = 0; i < button.length; i++) {
			button[i]= new JButton("button" + i);
		}
	}
	public void setInitLayout() {
		setLayout(flowLayout);
		for (int j = 1; j < button.length; j++) {
			
			add(button[j]);
		}
	}

}
