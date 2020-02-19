package com.exceptions;
public class Account{
	public static void main(String [] args)throws Exception {
	NewAccount n=new NewAccount(1000);
	n.Withdraw(2000);	
}
}
class NewAccount {
	
	private int balance;
	
	public int getBalance() {
		return this.balance;
		
	}
	public NewAccount(int balance) {
		this.balance=balance;
		
	}
	public void Withdraw(int amount) throws ValException {
		try{
			if(amount <= balance) {
		
			balance -=amount;
			System.out.println("remaining balance = "+balance);
			
		}
		else {
			throw new ValException("insufficient amount")	;		
		}
		}
		catch(ValException e){
			e.printStackTrace();
		}
	}
	
}
	
	    class ValException extends Exception{
		private String message;
		public ValException() {
			this.message=" ";
		}
		public ValException(String message) {
			this.message=message;
		}
		public String toString(){
			return "withdrawal amount should be less than balance :"+this.message;
		}
	}
		
			
			
		
		
		
		
	
		
		
		
		
		
		

					
					