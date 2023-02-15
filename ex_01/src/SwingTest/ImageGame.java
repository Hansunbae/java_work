package SwingTest;

import javax.swing.JFrame;

public class ImageGame extends JFrame{
  public ImageGame() {
	initData();
	setInitLayout();
}

  private void initData() {
	 setTitle("이미지 게임");
	 setSize(600,600);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
  }
private void setInitLayout() {
	setVisible(true);
}

  
}
