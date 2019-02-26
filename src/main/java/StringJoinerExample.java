package main.java;

import java.util.StringJoiner;

public class StringJoinerExample {
	
	public static void main(String args[]) {
		StringJoiner s = new StringJoiner(",");
		s.add("dibyendu");
		s.add("pramanick");
		
		System.out.println(s);
	}

}
