package main.java.methodreference;

public class Example1 {
	
	public static void displayMessage() {
		System.out.println("This is displayMessage method, passed to showMessage");
	}
	
	public static void main(String args[]) {
		Message m = Example1::displayMessage;
		m.showMessage();
	}
}

interface Message {
	void showMessage();
}
