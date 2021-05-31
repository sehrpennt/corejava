package com.sehrpennt.corejava;


interface Demo
{
	void show();
}


public class AnonymousClass 
{
	public static void main(String[] args) 
	{
		Demo obj=new Demo(){
				public void show()
				{
				System.out.println("Implemented an interface using AnonymousInnerClass");
				}
			};
			obj.show();
	}
}
