package com.eclipsefirst;

import java.util.*;
class Outer{
	public static HashMap<Integer,Inner> h= new HashMap<Integer,Inner>();
	class Inner{
		private String timestamp,value;
		
		public Inner(String value,String timestamp){
			this.value=value;
			this.timestamp=timestamp;
		}
		
	private String toString(){
		return "value is "+this.value+"\n time is "+this.timestamp;
	}
}

	public void putData(Inner data){
		h.put(h.size(),data);
	}
	public Inner getData(int key){
		{
			return h.get(key);
		}
	}
	class CacheMain{
		public static void main(String[] args){
			Outer outerObject=new Outer();
			Outer.inner innerObject=outerObject.new Inner("personal ","15-10-20 15:30");
			outerObject.putData(innerObject);
			System.out.println(outerObject.getData(0));
		}
	}
		