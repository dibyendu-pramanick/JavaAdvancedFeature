package main.java.lambda;

public class Example2 {
	public static void main(String args[]) {
		
		/*Message message = (String m)-> m;
		System.out.println(message.message("Hello from message interface"));*/
		
		Message message = (String m)-> {
			return m;
		};
		System.out.println(message.message("Hello from message interface"));
	}
}

interface Message {
	String message(String message);
}
