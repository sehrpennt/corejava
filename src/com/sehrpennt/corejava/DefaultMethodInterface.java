package com.sehrpennt.corejava;


interface Demo1
{
	void show();
	default void display()
	{
		System.out.println("Inside Demo1 Interface");
	}
}

interface Demo2
{
	default void display()
	{
		System.out.println("Inside Demo2 Interface");
	}
}

class DemoImp implements Demo1, Demo2
{
	public void display()
	{
		Demo2.super.display();
	}
	
	public void show()
	{
		System.out.println("SHOW inside DemoImp");
	}
}

public class DefaultMethodInterface {
	public static void main(String[] args)
	{
		Demo1 obj=() -> System.out.println("Lambda show method");
		obj.show();
		
		DemoImp obj2=new DemoImp();
		obj2.display();
		
		
	}

}
