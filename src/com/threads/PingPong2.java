package com.threads;

public class PingPong2 extends Thread {
	
	public PingPong2 (String threadName){
		super.setName(threadName);
		super.start();
	}
	public static void main(String[] args){
		
		new PingPong2("ping");
		new PingPong2("pong");
		
	}
		
@Override
public void run() {
	Thread currentThread=Thread.currentThread();
	if(currentThread.getName().equals("ping")){
		for(int i=0;i<25;i++) {
			System.out.println("ping");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	else if(currentThread.getName().equals("pong")){
		for(int i=0;i<25;i++) {
			System.out.println("\t pong ");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
}
		
