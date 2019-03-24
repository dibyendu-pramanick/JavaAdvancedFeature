package main.java.executorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example3 {
	
	public static void main(String args[]) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
		
		//task to run after 10 seconds
		service.schedule(new MyThread3(), 10, TimeUnit.SECONDS);
		
		// scheduled task runs every 3 seconds after an initial delay of 10 seconds
		service.scheduleAtFixedRate(new MyThread3(), 10, 3, TimeUnit.SECONDS);
		
		// scheduled task runs after every 2 seconds once previous tasks completes 
		service.scheduleWithFixedDelay(new MyThread3(), 10, 2, TimeUnit.SECONDS);
	}

}

class MyThread3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Name - " + Thread.currentThread().getName());
	}
	
}
