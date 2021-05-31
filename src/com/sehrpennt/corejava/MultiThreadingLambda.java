package com.sehrpennt.corejava;

public class MultiThreadingLambda 
{
	public static void main(String[] args) throws InterruptedException
	{
			//using lambda
		Thread t1 = new Thread(() ->
		{
			for(int i=1; i<=5; i++)
				System.out.println("Thread 1 reporting!"+Thread.currentThread().getPriority());
		}, "FIRST THREAD");
		
		
		//without lambda
		Runnable r2 = new Runnable() 
		{
			public void run() 
			{
				for(int i=1; i<=5; i++)
					System.out.println("Thread 2 reporting!");
			}
		};
		Thread t2 = new Thread(r2, "SECOND THREAD");
		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
}
