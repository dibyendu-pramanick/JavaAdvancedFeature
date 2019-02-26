package main.java;

import java.time.LocalDate;

public class TimeApi {
	
	public static void main(String args[]) {
		LocalDate l =LocalDate.now();
		System.out.println(l);
		LocalDate yesterday = l.minusDays(1);  
		System.out.println(yesterday.toString());
	}

}
