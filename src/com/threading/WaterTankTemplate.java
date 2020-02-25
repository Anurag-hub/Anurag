package com.threading;


import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTankTemplate extends Frame {
	private int y=400;
	private int height=0;
	private int percent = 70;
	public WaterTankTemplate() {
		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		//g.fillRect(150, 200, 200, 200);
		g.fillRect(150, y, 200, height);
		g.drawString(percent + "%", 380, 200);
	}

	public static void main(String[] args) {
		WaterTankTemplate waterTank = new WaterTankTemplate();
		waterTank.setSize(500, 500);
		waterTank.setVisible(true);
		waterTank.new WaterManagement();
	}
	class WaterManagement implements Runnable {
		Thread t1,t2,t3;
		
		public WaterManagement() {
			t1=new Thread(this,"INLET");
			t1.start();
			t2=new Thread(this,"OUTLET");
			t2.start();
			t3=new Thread(this,"CONTROLLER");
			t3.start();
		}
		public void run() {
			while(true) {
			if(Thread.currentThread().getName().equals("INLET")) {
				for(int i=0;i<10;i++) {
					y = y - 7;
					height = height + 7;
					
					repaint();
				
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			else if(Thread.currentThread().getName().equals("OUTLET")) {
				for(int i=0;i<10;i++) {
					y = y + 5;
					height = height -5;
					repaint();
				

					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				
			}
			else if(Thread.currentThread().getName().equals("CONTROLLER")) {
				System.out.println(height);
				if(height==288) {
				t1.suspend();
				if(height==223&&height<288) {
					t1.resume();
				}}
				
				
				
				
			}
		}}
	}}
