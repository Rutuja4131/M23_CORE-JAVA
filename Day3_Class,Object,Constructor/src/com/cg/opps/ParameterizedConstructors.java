package com.cg.opps;


class Pulser
{
	//class var
	public int Speed;
	public String Color;
	//Parameterized Constructor
	
	Pulser(int sp,String col)
	{
		Speed=sp;
		Color=col;
	}
	void accept()
	{
		System.out.println("\tSpeed is :"+Speed+"km/hr" +"\n\tAnd \n\tColor is :"+Color);
	}
}
public class ParameterizedConstructors {

	public static void main(String[] args) {
		Pulser p=new Pulser(50,"Black");
		p.accept();

	}

}
