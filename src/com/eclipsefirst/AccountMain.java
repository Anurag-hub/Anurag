package com.eclipsefirst;
import java.lang.annotation.*;
class Account{
	private int id;
	private String name;
	private int balance;

	public Account(int id,String name,int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public int getBalance(){
		return this.balance;
	}
	public String toString(){
		return this.id+"/t"+this.name+"/t"+this.balance;
	}
}
	class Savings extends Account{
		private int deposits;
		public Savings(int id,String name,int balance,int deposits){
			super(id,name,balance);
			this.deposits=deposits;
		}
		public int getBalance(){
			return super.getBalance()+this.deposits;
		}
		public String toString(){
			return super.toString()+this.deposits;
		}
	}
	class Current extends Account{
		private int credit;
		public Current(int id,String name,int balance,int credit){
			super(id,name,balance);
			this.credit=credit;
		}
		public int getBalance(){
			return super.getBalance()+this.credit;
		}
		public String toString(){
			return super.toString()+this.credit;
		}
	}
	public class AccountMain{
		public int calculateBalance(Account emp[]){
			int totalBalance=0;
			
			for (int i=0;i<emp.length;i++){
				totalBalance+=emp[i].getBalance();
			}
			return totalBalance;
		}
		public static void main(String[] args){
			Account e[]=new Account[4];
			e[0]=new Savings(1234,"Anurag",8000,1000);
			e[1]=new Savings(1235,"Anurag",8000,1000);
			e[2]=new Current(12376,"Anurag",4000,1000);
			e[3]=new Current(1237,"Anurag",4000,1000);
			AccountMain em=new AccountMain();
			int result=em.calculateBalance(e);
			System.out.println(result);
		}
	}
