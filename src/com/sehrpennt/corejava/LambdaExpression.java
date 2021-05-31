package com.sehrpennt.corejava;


interface LambdaDemo
{
	int returnSum(int k, int j);
}
public class LambdaExpression 
{
	public static void main(String[] args)
	{
		LambdaDemo obj=(int a, int b) -> 	a+b;//single expression returns auto
		System.out.println(obj.returnSum(5, 5));
		
	}
}
