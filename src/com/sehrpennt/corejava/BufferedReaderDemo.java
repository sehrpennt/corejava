package com.sehrpennt.corejava;
import java.io.*;
public class BufferedReaderDemo 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your fucking name: ");
		System.out.println(r.readLine());
		
	}
}
