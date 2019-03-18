package main.java;

import java.io.FileOutputStream;

public class TryWithResourceExample {
	
	public static void main(String args[]) {
		try(FileOutputStream fileOutputStream = new FileOutputStream("test.txt")) {
			
			String msg = "This is a simple text file";      
			byte byteArray[] = msg.getBytes();       
			fileOutputStream.write(byteArray);  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
