package com.sehrpennt.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.List;



public class ComparatorDemo 
{
	public static void main(String[] args)
	{	
		List<Integer> values = new ArrayList<>();
		Collections.addAll(values, 1, 20, 231, 12313, 23234, 2423, 56757, 2432);
		
		Collections.sort(values);
		System.out.println(values);
		
		Collections.sort(values, (i,j)-> i%10>j%10?1:((i%10 == j%10)?0:-1));
		System.out.println(values);
	}

}
