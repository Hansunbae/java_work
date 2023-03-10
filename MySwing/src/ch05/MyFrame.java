package ch05;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	// 그림위에다가 그림 올리기
	// JLabel 이용하여 이미지 겹치기 활용
	private JLabel backgroundMap;
	private JLabel player;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 겹치기연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("images/background2.png");
		backgroundMap = new JLabel(icon); // 패널에 배경이미지 추가
		backgroundMap.setSize(500, 500);
		// null -> 좌표 --> 컴포넌트에 사이즈, 위치
		player = new JLabel(new ImageIcon("images/image3.png")); // 패널에 개별 이미지 추가
		player.setSize(100, 100);

	}

	private void setInitLayout() {
		backgroundMap.setLocation(0, 0);
		player.setLocation(200, 200);
		add(player);
		add(backgroundMap);
		setLayout(null);
		setVisible(true);
	}

}