package com.sehrpennt.corejava;

public class MyOwnExceptionCheck 
{
	public static void main(String[] args)
	{
		try
		{
			throw new MyOwnException("My own effin exception");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
