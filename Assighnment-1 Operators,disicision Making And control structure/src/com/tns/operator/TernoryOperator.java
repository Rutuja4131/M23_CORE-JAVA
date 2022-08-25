package com.tns.operator;

import java.util.Scanner;

public class TernoryOperator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
//		ternory Operator
		int res=(5%2==0)?a:b;//   -->if condition true it take a value.. and condition fale take b value..
		System.out.println(res);

	}

}
