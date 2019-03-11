package main.java;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String args[]) {
		 Integer value1 = null;
	     Integer value2 = new Integer(10);
	     
	     Optional<Integer> val1 = Optional.ofNullable(value1);
	     Optional<Integer> val2 = Optional.of(value2);
	     System.out.println(sum(val1,val2));
	}
	
	public static Integer sum(Optional<Integer> value1,Optional<Integer> value2) {
		
		System.out.println("First parameter is present: " + value1.isPresent());
	    System.out.println("Second parameter is present: " + value2.isPresent());
	    
	    Integer val1 = value1.orElse(new Integer(0));
	    Integer val2 = value2.get();
		return (val1+val2);
	}
}


