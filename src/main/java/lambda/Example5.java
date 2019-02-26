package main.java.lambda;

public class Example5 {
	public static void main(String args[]) {
		
		System.out.println("Executing " + Thread.currentThread().getName());
		
		Runnable r = () -> {
			System.out.println("Executing " + Thread.currentThread().getName());
		};
		
		new Thread(r).start();
	}

}
