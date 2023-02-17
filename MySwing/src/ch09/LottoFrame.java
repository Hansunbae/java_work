package ch09;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;


// 화면을 담당
// LottoRandomNumber 클래스에 받아서 처리해보자
public class LottoFrame extends JFrame implements ActionListener {
	int[] lotto = new int[6];
	JButton button;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("로또 시작");
	}
	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}
	private void addEventListener() {
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("여기인가????");
		lotto = new LottoRandomNumber().getLottoNumber();
		repaint();
		
	}
	
	
	@Override
	public void paint(Graphics g) {
//		System.out.println("이건 어디서");
		super.paint(g);
		if(lotto[0] == 0){
			g.drawString("로또 번호를 클릭하세요", 350, 200);
			// 게임 초기 상태 
			return;
		}
		int x= 250;
		for(int i = 0; i < lotto.length; i++) {
			g.drawString(lotto[i]+ "", x, 200); 
			x+=50;
		}		
	}
	
}
