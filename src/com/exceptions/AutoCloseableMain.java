package com.exceptions;

class AutoCloseableMain implements AutoCloseable {
	public void close() throws Exception{
		System.out.println("Autocloseablemain is closed");
	}
	public static void main(String [] args) throws Exception {
		try (AutoCloseableMain input = new AutoCloseableMain())
			{
				System.out.println("line is inside try method");
				int x=25/0;
				System.out.println("Should not be executed");
			}
		catch(ArithmeticException e) {
		}
		}
	}
