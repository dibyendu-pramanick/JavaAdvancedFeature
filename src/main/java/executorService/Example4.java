package main.java.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example4 {
	public static void main(String args[]) {
		ExecutorService service	= Executors.newSingleThreadExecutor();
		for(int i = 0; i< 5; i ++) {
			service.execute(new MyThread4());
		}
	}
}

class MyThread4 implements Runnable {
	public void run() {
		try {
			for(int i = 0; i<10; i++) {
				if(i==5) {
					Thread.sleep(3000);
				}
				System.out.println("Thread Name - " + Thread.currentThread().getName() + " i - " +i);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
