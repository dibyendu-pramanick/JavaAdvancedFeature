package main.java.methodreference;

public class Example2 {
	
	public static String doCalculation(int n1, int n2, String operation) {
		if(operation.equalsIgnoreCase("add")) {
			return "Operation - " + operation + " Result - " + (n1+n2);
		}
		return "Invalid Operation";
	}
	
	public static void main(String args[]) {
		Calculator c = Example2::doCalculation;
		System.out.println(c.calculate(5, 10, "add"));
	}
}

interface Calculator {
	String calculate(int n1, int n2, String operation);
}
