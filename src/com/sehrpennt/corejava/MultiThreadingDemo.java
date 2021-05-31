package com.sehrpennt.corejava;

class First extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++) {
		System.out.println("Thread 1 says Hello!"+this.getPriority());
		try{Thread.sleep(500);}catch(Exception e) {}
		}
		}
}

class Second implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++) {
		System.out.println("Thread 2 says Hi!");
		try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

public class MultiThreadingDemo 
{
	public static void main(String[] args) throws Exception
	{
		Thread thread1 = new First();//using Thread Class only
		Thread thread2 = new Thread(new Second());//using runnable
		
		thread1.start();
		thread2.start();
		
		
		thread1.join();//pauses all other threads(main thread) until thread1 is dead
		thread2.join();//pauses all other threads(main thread) until thread2	 is dead
		
		System.out.println(thread1.isAlive());
		
		System.out.println("BYE");
		
	}
}
