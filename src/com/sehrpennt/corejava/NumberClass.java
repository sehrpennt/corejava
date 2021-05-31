package com.sehrpennt.corejava;


class Printer
{
	void show(Number num)
	{
		System.out.println(num);
	}
}



public class NumberClass 
{
	public static void main(String[] args)
	{
		Printer p1 = new Printer();
		p1.show(5);
		p1.show(7.57);
	}
}
