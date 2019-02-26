package main.java;

public class FunctionalInterface implements Drawable{
	
	public void display(String message) {
		System.out.println(message);
	}
	
	public static void main(String args[]) {
		FunctionalInterface f = new FunctionalInterface();
		f.display("display it");
		f.doIt1();
		f.doIt2();
		Print.doIt3();
	}
}

interface Print {
	
	default void doIt1() {
		System.out.println("Do it1!");
	}
	
	default void doIt2() {
		System.out.println("Do it2!");
	}
	
	static void doIt3() {
		System.out.println("Do it3!");
	}
}

interface Drawable extends Print {
	void display(String message);
}