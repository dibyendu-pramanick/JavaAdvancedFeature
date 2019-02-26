package main.java.methodreference;

public class Example5 {
	
	public void customDraw() {
		System.out.println("I am drawing");
	}
	
	public static void main(String args[]) {
		Drawable d = new Example5()::customDraw;
		d.draw();
	}
}

interface Drawable {
	void draw();
}
