package parctice;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class Typeing implements Runnable{
	private BufferedImage image;
	
	
	 @Override
	public void run() {
		while(true) {
			Color leftColor = new Color(image.getRGB(0, 0));
		}
		
	}
}
