package main.java;

public class MultiCatchExample {
	
	public static void main(String args[]) {
		try {
			int[] a = {2};
			int[] b = {0};
			
			int division = (a[0]/b[0]);
			//int division = (a[1]/b[0]);
			
			System.out.println(division);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
