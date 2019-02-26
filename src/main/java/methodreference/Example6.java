package main.java.methodreference;

public class Example6 {
	
	Example6() {
		System.out.println("Welcome");
	}
	
	Example6(String message) {
		System.out.println(message);
	}
	
	public static void main(String args[]) {
		Print p = Example6::new;
		//p.print("Hello");
		p.print();
	}
}

interface Print {
	//Example6 print(String message);
	void print();
}
