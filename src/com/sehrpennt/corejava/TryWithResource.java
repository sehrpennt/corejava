package com.sehrpennt.corejava;
import java.io.*;

public class TryWithResource {
	public static void main(String[] args) throws IOException
	{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			int n=Integer.parseInt(br.readLine());
			System.out.println(n);
		}
	}
}