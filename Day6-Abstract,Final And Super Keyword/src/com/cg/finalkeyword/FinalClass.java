package com.cg.finalkeyword;
//if any class is declared as final we can't inherit it
//final class Fruit
class Fruit
{
	//we cant make any constructor as final
	//final Fruit()
	Fruit()
	{
		System.out.println("Constructor");
	}
	//if you make any method as final you can't override it
	//final public void accept()
	public void accept()
	{
		System.out.println("Parent Class");
	}
}
class Apple extends Fruit
{
	public void accept()
	{
		System.out.println("Parent Class");
	}
}

public class FinalClass {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.accept();

	}

}
