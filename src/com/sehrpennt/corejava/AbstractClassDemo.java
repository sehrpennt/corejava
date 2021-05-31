package com.sehrpennt.corejava;

class BankCompare
{
	int printAmount(Bank bank, int installment)
	{
		return installment*bank.rateOfInterest();
	}
}

// Implementation details of the subclasses are hidden from the new BankCompare class above.

abstract class Bank
{
	abstract int rateOfInterest();
}

class Sbi extends Bank
{
	int rateOfInterest()
	{
		return 581;
	}
}

class Hdfc extends Bank
{
	int rateOfInterest()
	{
		return 666;
	}
}


public class AbstractClassDemo 
{
	public static void main(String[] args)
	{
		Bank sbi, hdfc;
		sbi=new Sbi();
		hdfc=new Hdfc();
		
		
		
		
	}
}
