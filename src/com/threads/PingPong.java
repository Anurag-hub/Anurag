package com.threads;

public class PingPong implements Runnable {
	Thread t1,t2;
	public PingPong(){
		t1=new Thread(this);
		t2=new Thread(this);
		t1.setName("ding");
		t2.setName("dong");
		t1.start();
		t2.start();
	}
	public static void main(String[] args){
		
		new PingPong();
	}
		
@Override
public void run() {
	Thread currentThread=Thread.currentThread();
	if(currentThread.getName().equals("ding")){
		for(int i=0;i<25;i++) {
			System.out.println("ding");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	else if(currentThread.getName().equals("dong")){
		for(int i=0;i<25;i++) {
			System.out.println("\tdong ");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
}
		
