package com.cg.abstractkeywordDemo;

//abstract class
public abstract class Sweet extends Rasmalai
{
	public Sweet()
	{
		System.out.println("I like Rasmalai");
	}
	// non abstract method
	public String taste()
	{
		return "Sweet";
	}
	//implementation for abstract method
	
	void print()
	{
		System.out.println("Sweet is Rasmalai");
	}
}
