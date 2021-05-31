package com.sehrpennt.corejava;


class A
{	int i;
	void show()
	{
		System.out.println("A");
	}
}

class B extends A
{	
	@Override
	void show()
	{
		super.i=8;
		super.show();
		System.out.println("B");
	}
}
public class MethodOverriding 
{
public static void main(String[] args)
{
	B obj=new B();
	obj.show();
	System.out.println(obj.i);
}
}
