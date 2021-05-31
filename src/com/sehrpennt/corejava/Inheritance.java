package com.sehrpennt.corejava;


class Calculator
{

	public Calculator()
	{
		System.out.println("In Calculator");
	}
	public Calculator(int a)
	{
		System.out.println("In 2nd const calc");
	}
}

class CalculatorExt extends Calculator
{
	
	public CalculatorExt()
	{
		super(5);
		System.out.println("In calcext");
	}
}




class Inheritance
{
	public static void main(String[] args)
	{
	CalculatorExt obj=new CalculatorExt();
	}
}