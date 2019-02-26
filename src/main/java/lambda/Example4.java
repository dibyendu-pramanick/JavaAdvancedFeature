package main.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
	
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		list.forEach(n -> {
			System.out.println("elements - " + n);
		});
	}

}
