package com.cg.string;

import java.util.Scanner;

public class ex5_ToUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.next();
		//System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

}
