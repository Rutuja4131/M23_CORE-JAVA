package com.cg.abstractkeyword;
//abstract class
abstract class Flower
{
	// abstract  method
	abstract void print();
	//non abstract method
	void accept()
	{
		System.out.println("Demo on abstract keyword");
	}
}
class Lily extends Flower
{
	void print()
	{
		System.out.println("Hey Folks, I like the fragnance of lily");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		/*We cant create object for abstract class
	//	Flower l=new Flower();*/
		Lily l=new Lily();
		l.print();
		l.accept();

	}

}
