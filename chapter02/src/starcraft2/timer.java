package starcraft2;

import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class timer {  // timer class

	public static void main(String[] args) {
	      final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	        final Runnable runnable = new Runnable() { // runnable 객체 생성
	            int countStart = 0;

	            public void run() {
	            	System.out.println(countStart);

	                countStart++;

	                if (countStart < 0) {
	                    System.out.println("Timer Over!");
	                    scheduler.shutdown();
	                }
	            } // run 메소드
	        }; // runnable 객체 생성
	        
	        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);

	} // end of main

} // end of class
