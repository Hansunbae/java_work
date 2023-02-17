package ch08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {
	int[] lotto = new int[6];
	JButton button;
	

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Lotto");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("lotto start");

	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);

	}

	private void addEventListener() {
		button.addActionListener(this); // 버튼 눌렀을 때

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("게임 시작~");
		lotto= getLottoNumber();
		// 그림을 다시 그리다.
		repaint(); // 새로고침

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// g.setColor(Color.black);
		Font f = new Font("궁서체", Font.BOLD, 20);
		g.setFont(f);
		if(lotto[0] == 0){
			g.drawString("로또 번호를 클릭하세요", 180, 200);
			// 게임 초기 상태 
			return;
		}
		// 코드가 여기 내려오면 버튼을 눌렀다와 같은 의미이다.
		// 그럼 메서드와 멤버 변수를 활용해서 그림을 그릴 수 있다.
		
		// 추천하지 않는 코드
		for(int i = 0, x = 50; i < lotto.length; i++, x+=50) {
			g.drawString(lotto[i]+ "", x, 200); 
		}		
	}

	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			// 중복 값 확인을 위해 반복문을 생성
			for (int e = 0; e < i; e++) {
				// 조건
				if (lotto[i] == lotto[e]) {
					i = i - 1;
					break;
				}
			}
		} // end of for
		
		// 오름 차순 정렬
		Arrays.sort(lotto); // 배열을 정렬 해주는 기능
		return lotto;
	}

	// 테스트 코드
	public static void main(String[] args) {
		LottoFrame a = new LottoFrame();

	} // end of main
}// end of class
