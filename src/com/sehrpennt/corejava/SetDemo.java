package com.sehrpennt.corejava;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo 
{
	public static void main(String[] args)
	{
		Set<Integer> values= new HashSet<>();
		values.add(5);
		values.add(68);
		values.add(76);
		values.add(43);
		values.add(457);
		values.add(29);
		System.out.println(values.add(5)); //returns true/false if it gets added/not
		System.out.println(values);
		
		Set<Integer> values2 = new TreeSet<>();
		values2.add(5);
		values2.add(68);
		values2.add(76);
		values2.add(43);
		values2.add(457);
		values2.add(29);
		System.out.println(values2);
		
	}
}
