package com.filehandling;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import com.exceptions.Account;

class Accounts{
	
	private int account_no;
	private double balance;
	private String name;
	
	public Accounts(int account_no,double balance,String name) {
		this.account_no=account_no;
		this.balance=balance;
		this.name=name;
		
	}
	public int getAccount_no(){
		return this.account_no;
	}
	public double getBalance(){
		return this.balance;
	}
	public String getName(){
		return this.name;
	}
}
	public class AccountsWriteMain{
		public static void main(String[] args) throws Exception {
			int i=0;
			Accounts first[]=new Accounts[3];
			first[0]=new Accounts(1234,111.11,"Anurag");
			first[1]=new Accounts(1235,123.23,"Kumar");
			first[2]=new Accounts(1236,145.45,"Pandey");
			
			FileOutputStream f1=new FileOutputStream("D:\\normaldir\\file.txt");
			DataOutputStream f2=new DataOutputStream(f1);

			
			for(Accounts a:first) {
					f2.writeInt(first[0].getAccount_no());
					f2.writeDouble(first[1].getBalance());
					f2.writeUTF(first[2].getName());
			}
					f2.flush();
					f1.flush();
					f2.close();
					f1.close();
				
			}
			
			
		}
	
		
		
	

