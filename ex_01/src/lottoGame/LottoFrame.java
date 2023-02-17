package lottoGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame{
	JButton button; 
	
	
	public LottoFrame() {
		InitData();
		setInitLayout();
		addEventListener();
	}
	private void InitData() {
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button =new JButton("게임을 시작합시다.");
		
	}
	private void setInitLayout() {
		add(button);
		setVisible(true);
	}
	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
}
