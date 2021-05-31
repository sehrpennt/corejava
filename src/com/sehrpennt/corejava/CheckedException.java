package com.sehrpennt.corejava;
import java.io.*;

class ExceptionThrow
{
	int testException() throws IOException
	{
		return 5;
	}
}
public class CheckedException
{
	public static void main(String[] args) throws IOException 
	{
		ExceptionThrow obj= new ExceptionThrow();
		obj.testException();
	}
}
