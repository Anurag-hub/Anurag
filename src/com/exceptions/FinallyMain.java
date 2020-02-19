package com.exceptions;

public class FinallyMain {

	public static void main(String[] args) {
		 int x=23;
		 int y=7;
		
		try {
			
			System.out.println(x/y);
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		finally {
		System.out.println("line executed after exception");
		
	
		
	}

}


}
