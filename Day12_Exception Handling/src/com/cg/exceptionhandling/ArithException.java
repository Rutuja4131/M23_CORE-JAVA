package com.cg.exceptionhandling;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int div=0;
		//try block contains exception and non-exception code
		//handling the exception using catch block
		try
		{
			int a=15;
			System.out.println("enter the value of b:");
			int b=sc.nextInt();
			div=a/b;
			System.out.println(div);
		}
		catch(Exception e)
		{
			System.out.println("Exception handeled"+e);
		}
		sc.close();

	}

}
