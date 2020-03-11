package com.exceptions;

public class NestedTryCatch {

	public static void main(String[] args) {
		 int x=23;
		 int y=0;
		try {
			System.out.println("Entered in parent try");
			
			
			try {
				int arr[]=new int[4];
				System.out.println("Entered in nested try");
				int arr1=arr[6];
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				
			}
		}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
			}
				
			}
		
