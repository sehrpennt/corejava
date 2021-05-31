package com.sehrpennt.corejava;


class Apple
{
	void show()
	{
		System.out.println("A");
	}
}

class Bee extends Apple
{
	void show()
	{
		System.out.println("B");
	}
}

class Cee extends Apple
{
	void show()
{
	System.out.println("C");
}
}

public class DynamicMethodDispatch {
	public static void main(String[] args)
	{
		Apple obj;
		obj=new Bee();
		obj.show();
		
		obj=new Cee();
		obj.show();
	}
}
