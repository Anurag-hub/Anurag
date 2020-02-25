package com.threads;



public class MyThreadDaemon {
	
	public MyThreadDaemon(Runnable r,boolean daemon) {
		// TODO Auto-generated constructor stub
		Thread t=new Thread(r);
		t.setDaemon(daemon);
		t.start();
	}
	public static void main(String args[])
	{
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
					for(int i=0;i<20;i++)
					{
						System.out.println("ping");
						try
						{
							Thread.sleep(200);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
				
			
		};
Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
					
					for(int i=0;i<20;i++)
					{	
						System.out.println("\tpong");
						try
						{
							Thread.sleep(300);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			
		};
Runnable r2=new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
			
			while(true)
			{	
				System.out.println("\t \t tong");
				try
				{
					Thread.sleep(300);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	
};
		new MyThreadDaemon(r,false);
		new MyThreadDaemon(r1,false);
		new MyThreadDaemon(r2,true);
		
	}

}