package com.sehrpennt.corejava;

class GenericOne<T>
{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}

class GenericTwo<T extends Number>
{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public <E> void show(E ar) {
		
		
		System.out.println(ar);
	}
	
}

public class GenericsDemo 
{
	public static void main(String[] args) {
	GenericOne<String> g1=new GenericOne<>();
	GenericTwo<Integer> g2=new GenericTwo<>();
	
	g1.setValue("HEY");
	g2.setValue(2);
	g2.show(1.22423);
	System.out.println(g1.getValue()+g2.getValue());
	}
}
