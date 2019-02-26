package main.java.methodreference;

public class Example3 {
	
	public static void customRun() {
		System.out.println("Current Thread - " + Thread.currentThread().getName());
	}
	
	public static void main(String args[]) {
		System.out.println("Current Thread - " + Thread.currentThread().getName());
		Runnable r = Example3::customRun;
		new Thread(r).start();
	}
}
