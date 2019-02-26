package main.java.lambda;

public class Example3 {

	public static void main(String[] args) {
		
		Calculator c = (int n1, int n2, String operation) -> {
			if(operation.equalsIgnoreCase("add")) {
				return "Operation - " + operation + " Result - " + (n1+n2);
			}
			return "Invalid Operation";
		};
		System.out.println(c.calculate(5, 10, "add"));
		System.out.println(c.calculate(4, 4, "division"));
	}

}

interface Calculator {
	String calculate(int n1, int n2, String operation);
}
