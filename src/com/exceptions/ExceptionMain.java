package com.exceptions;

public class ExceptionMain {
	
	
	
	public static void main(String[] args) {
		 int x=23;
		 int y=0;
		 int arr[]=new int[5];
		try {
			
			System.out.println(x/y);
			int z=arr[6];
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("line executed after exception");
		
	
		
	}

}
