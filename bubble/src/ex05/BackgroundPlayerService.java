package ex05;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인 화면에 그림 그려 주고 있고 ( 키보드 이벤트 리스너를 가지고 있다 ---> 바쁨)
// 백그라운드에서 계속 player에 움직임을 관찰 
public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스 객체에 사용하는 이미지 경로 및 파일명 확인");
		}
	}

	@Override
	public void run() {

		while (true) {
			// 색상확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈 때는 역시나 기준 좌표지점을 보정해야 한다.
			
			// 기준 왼쪽
			Color leftColor = new Color(image.getRGB(player.getX() + 10, player.getY() + 25));
			// 기준 오른쪽
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));

			// 바닥 충돌 감지
			// Color bottomColorLeft = new Color(image.getRGB(player.getX() + 10,
			// player.getY() + 60));
			// -65536 , -16776961 , -1
			int bottomColorLeft = image.getRGB(player.getX() + 20, player.getY() + 55);
			System.out.println(bottomColorLeft);
			// 바닥에 있을 때  빨간색 -65535, 구조물 위에 올라섰을 때  파란색-1677696 , 공중에 있을 때 흰색  -1
			int bottomColorRight = image.getRGB(player.getX() + 45, player.getY() + 55);
			// 하얀색이 아니면 바닥이다.
			if (bottomColorLeft + bottomColorRight != -2) {
				System.out.println("여기는 바닥입니다.");
				player.setDown(false);
			} else {
				// 조금 점프하는 순간 bottomColorLeft -> -1이 된다.
				// 위 화살표를 누르면 현재 65번 반복 돌면서 y값을 마이너스해서
				// 이미지를 위로 올리고 있고 현재 y 좌표에서 +130 좌표 올리고 ---> down() 메서드 호출
				// 올라 가는 동시에 위 + 위 + 위 --> 65*3번 실행
				if (player.isUp() == false && player.isDown() == false) {
					// 다운 메서드가 한 번 호출 되어야한다.
					player.down();
				}
			}

			if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				player.setRight(false);
				player.setRightWallCrash(true);
				
			} else if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				player.setLeft(false);
				player.setLeftWallCrash(true);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of while
	}
}
