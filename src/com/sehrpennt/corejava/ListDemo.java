package com.sehrpennt.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListDemo 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> values=new ArrayList<>();
		String num="";
		while(true) 
		{
			System.out.println("Enter someshit! (q to quit): ");
			num=in.readLine();
			if(num.equals("q"))
			{
				break;
			}
			try 
			{
			values.add(Integer.parseInt(num));
			}
			catch(NumberFormatException e)
			{
				System.out.println("\nPlease enter a valid number!\n");
				continue;
			}
		}
		
		Collections.sort(values);
		
		System.out.println("\nPrinting the list..");
		for(Object i : values) {
			System.out.println(i);
		}

		
	}
}
