package main.java.generics;

public class Example1 {

	public static void main(String[] args) {
		Integer[] intArray = {10,20,30};
		print(intArray);

	}
	
	public static <E> void print(E[] elements) {
		for(E element: elements) {
			System.out.println(element);
		}
	}

}
