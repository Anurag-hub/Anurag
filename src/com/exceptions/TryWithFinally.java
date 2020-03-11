package com.exceptions;

public class TryWithFinally {
	public static void main(String[] args) {
	 int x=23;
	 int y=0;
	
	try {
		
		System.out.println(x/y);
	}
	finally {
		System.out.println("Line executed without handling exception");
	}

}
}
