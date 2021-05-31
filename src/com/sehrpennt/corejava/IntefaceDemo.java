package com.sehrpennt.corejava;


interface Writer
{
	void write();
}
interface Writer2
{
	void write();
	
}

class Pen implements Writer, Writer2
{
	public void write()
	{
		System.out.println("Pen");
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("Pencil");
	}
}

public class IntefaceDemo {
	public static void main(String[] args)
	{
		Writer obj;
		obj=new Pen();
		obj.write();
	}

}
