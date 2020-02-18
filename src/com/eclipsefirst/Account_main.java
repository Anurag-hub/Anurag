package com.eclipsefirst;

class Account{
	private int balance;
	private String name;
	private int account_id;
	
	public Account(int balance,String name,int account_id){
	this.balance=balance;
	this.name=name;
	this.account_id=account_id;
	}
	private void setName(String name){
		this.name=name;
	}
	private void setBalance(int balance){
		this.balance=balance;
	}
	public String getName(){
		return this.name;
	}
	public int getBalance(){
		return this.balance;
	}
	public int getAccount_id(){
		return this.account_id;
	}
	public int withdraw(int withdraw_amt){
		this.balance=this.balance-withdraw_amt;
		return this.balance;
	}
	public int deposit(int deposit_amt){
		this.balance=this.balance+deposit_amt;
		return this.balance;
	}
}
public class Account_main{
	public static void main(String [] args){		
		Account a=new Account(1000000,"ANURAG",1010);
		int bal=a.withdraw(500);
		System.out.println("Remaining balance ="+bal);
		bal=a.deposit(8000);
		System.out.println("New balance ="+bal);
}
}

	
	
	
	