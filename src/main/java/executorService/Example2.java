package main.java.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example2 {
	
	public static void main(String args[]) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		for(int i=0; i<24;i++) {
			service.execute(new MyThread2());
		}
	}
}

//This can be done by implementing Runnable interface as well
class MyThread2 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Name - " + Thread.currentThread().getName());
		
	}
	
}
