package com.sehrpennt.corejava;


class Sample
{
 private int a,b;
	public int getA()
	{
		return a;
	}
	
	public void setA(int a)
	{
		this.a=a;
	}
	
}




public class Encapsulation 
{
	public static void main(String[] args) 
	{
		Sample obj=new Sample();
		obj.setA(5);
		System.out.println(obj.getA());
	}
}
