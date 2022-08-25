package com.cg.string;

import java.util.Scanner;

public class ExampleLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.next();
		System.out.println(str.length());
		System.out.println(str.charAt(2));
	}

}
