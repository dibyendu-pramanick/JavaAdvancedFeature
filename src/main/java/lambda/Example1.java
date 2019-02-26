package main.java.lambda;

public class Example1{
	
	public static void main(String args[]) {
		Drawable drawable = ()-> {
			System.out.println("Drawing");
		};
		drawable.draw();
	}

}

@FunctionalInterface
interface Drawable {
	public void draw();
}
