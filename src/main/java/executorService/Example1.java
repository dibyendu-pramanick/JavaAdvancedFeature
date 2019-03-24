package main.java.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {
	
	public static void main(String args[]) {
		
		int availableCores = Runtime.getRuntime().availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(availableCores);
		
		for(int i = 0;i<24; i++) {
			service.execute(new MyThread());
		}
	}

}

//This can be done by implementing Runnable interface as well
class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Name - " + Thread.currentThread().getName());
		
	}
	
}
