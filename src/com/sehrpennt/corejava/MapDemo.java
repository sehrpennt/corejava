package com.sehrpennt.corejava;

import java.util.HashMap;
import java.util.Map;

public class MapDemo 
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		map.put("NAME", "sehrpennt");
		map.put("PLACE", "UP");
		map.put("AGE", "29");
		
		for(String i : map.keySet()) {
			System.out.println(i+"\t"+map.get(i));
		}
		
	}
}		
		