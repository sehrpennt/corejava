package com.sehrpennt.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	Integer roll;
	String name;
	
	public Student(Integer roll, String name)
	{
		this.roll=roll;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return ""+this.roll+"\t"+this.name+"\t";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return roll>s.roll?-1:((roll == s.roll)?0:1);
	}
}

public class ComparableDemo {
	public static void main(String[] args)
	{
		Student s1 = new Student(1, "BABU");
		Student s2 = new Student(20, "RABA");
		Student s3 = new Student(12, "FABI");
		Student s4 = new Student(4, "SABO");
		
		List<Student> studs = new ArrayList<>();
		Collections.addAll(studs, s1, s2, s3, s4);
		System.out.println(studs);
		
		Collections.sort(studs);
		System.out.println(studs);
		
	}
}
