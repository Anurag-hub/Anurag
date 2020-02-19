package com.filehandling;
import java.io.*;


public class FileInfo {
	public static void main(String[] args) {
		File file3=new File("D:\\normaldir");
		File[] listoffiles=file3.listFiles();
		
		for(File file : listoffiles) {
			if(file.isFile()) {
				System.out.println("name = "+file.getName()+" executable type = "+file.canExecute()+" path = "+file.getPath()+" Can read = "+file.canRead()+" Can write = "+file.canWrite()+" size = "+file.length()+"kb "+" Last modified = "+file.lastModified());
		
			}
		}
		
		
				
	}

}
