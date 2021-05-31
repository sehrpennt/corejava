package com.sehrpennt.corejava;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionDemo 
{
	public static void main(String[] args)
	{
		String ch="";
		Scanner in= new Scanner(System.in);
		Collection<String> values=new ArrayList<>();
		while(true) 
		{
			System.out.println("Enter element (q to quit)");
			ch=in.next();
			if(ch.equals("q")) {
				break;
			}
			values.add(ch);
		}
		
		Iterator<String> obj = values.iterator();
		
		System.out.println("\nPrinting the values..\n");
		while (obj.hasNext()) 
		{
			System.out.println(obj.next());
		}
	}
}
