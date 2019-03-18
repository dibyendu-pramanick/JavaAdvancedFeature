package main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
	
	static void drawShape(List<? extends Shape> list) {
		for(Shape s:list) {
			s.draw();
		}
	}
	
	public static void main(String args[]) {
		
		List<Rectangle> recList = new ArrayList<Rectangle>();
		Rectangle r = new Rectangle();
		recList.add(r);
		drawShape(recList);
		
		List<Circle> cirList = new ArrayList<Circle>();
		Circle c = new Circle();
		cirList.add(c);
		drawShape(cirList);
	}

}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}
	
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
	
}
