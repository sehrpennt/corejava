package com.sehrpennt.corejava;

public class TryCatch 
{
	public static void main(String[] args)
	{
		int i=9;
		int j=2;
		int k=0;
		int[] l= new int[5];
		try
		{
			k=i/j;
			l[5]=3;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+" is the exception");
		}
		
		
		finally
		{
			System.out.println("S I C K");
		}
	}
	

}
