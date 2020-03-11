package com.filehandling;
import java.util.*;
import java.io.*;
public class AccountRafMain {

	public static void main(String[] args) throws IOException {
		Account1 a[]=new Account1[3];
		HashSet<Integer>m=new HashSet<>();
		a[0]=new Account1("Anurag",1,0.0,new Date(21));
		a[1]=new Account1("Kumar",2,5.0,new Date(22));
		a[2]=new Account1("Pandey",3,50000.0,new Date(23));
		File file = new File("D:\\normaldir\\mnotxt");
		RandomAccessFile rd=new RandomAccessFile(file,"rw");
		createAndUpdateAccount(a, rd, file);
		System.out.println(readAccount(rd,file));
		rd.close();
		
	}
	public static void createAndUpdateAccount(Account1 a[],RandomAccessFile rd,File f) throws IOException
	{	rd.seek(f.length());
		for(Account1 ac:a)
		{	
			rd.writeUTF(ac.getName());
			rd.writeInt(ac.getAccountNumber()); 
			rd.writeDouble(ac.getBalance());
		}
		
	}
	public static StringBuilder readAccount(RandomAccessFile rd,File f) throws IOException
	{	
		StringBuilder sb=new StringBuilder();
		rd.seek(0);
		long c=f.length()-1;
		while(rd.getFilePointer()<c-2)
		{	
			
			sb=sb.append(String.valueOf(rd.readUTF())+" ");
			sb=sb.append(String.valueOf(rd.readInt())+" ");
			sb=sb.append(String.valueOf(rd.readDouble())+" ");
		}
		return sb;
	}
}
