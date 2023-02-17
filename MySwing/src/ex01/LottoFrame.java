package ex01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

// 화면을 담당
// LottoRandomNumber 클래스에 받아서 처리해보자
public class LottoFrame extends JFrame {

	JButton button;
	LottoRandomNumber lottoRandomNumber;
	boolean isStart = false;
	JLabel lottoImage;

	private LineBorder bb = new LineBorder(Color.BLACK, 1, true);

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("game start");
		lottoImage = new JLabel(new ImageIcon("lottoicon.png"));
		lottoRandomNumber = new LottoRandomNumber();
	}

	private void setInitLayout() {
		setLayout(null);
		add(lottoImage);
		lottoImage.setSize(210, 260);
		lottoImage.setLocation(170, 130);
		add(button);
		button.setSize(100, 40);
		button.setLocation(480, 318);
		setVisible(true);
	}

	// 그려라
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font f = new Font("CookieRun", Font.BOLD, 30);
		// 그림을 그릴 때 두가지 구분, 처음, 버튼 눌렀을 때
		g.setFont(f);
		if (isStart == false) {
			g.drawString("게임을 실행해 주세요", 150, 200);
			return;
		}
		// 6 정렬된 난수 값을 받음!
		// 실행에 흐름을 사용하는 변수를 쓰면 값 초기화를 잘 확인하자.
		int[] getNumbers = lottoRandomNumber.createNumber();
		int x = 100;
		for (int i = 0; i < getNumbers.length; i++) {
			g.drawString(getNumbers[i] + "", x, 150);
			x += 100;
		}
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 그림을 다시 그려라
				isStart = true;
				repaint();
			}
		});
	}
}
