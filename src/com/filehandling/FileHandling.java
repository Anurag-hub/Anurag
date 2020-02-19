package com.filehandling;

import java.io.*;


public class FileHandling{
	public static void main(String[] args) throws Exception {
		File file=new File("D:\\normaldir\\abc.txt");
		File file1=new File("D:\\normaldir\\def.txt");
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fis1=new FileOutputStream(file1);
		StringBuilder s1= new StringBuilder("");
		int i=0;
		do {
			i=fis.read();
			if(i!=-1) {
				s1.append((char)i);
				
			}
		}
		while(i!=-1); 
			fis1.write(String.valueOf(s1).getBytes());
			fis1.flush();
			fis.close();
			fis1.close();
		}
		
		
		
		
	}


