package com.cg.package4;

//importing package to access method accept
import com.cg.package3.DemoPack;
//import com.cg.package3.*;      ---> * for access all the classes

public class DemoTest {

	public static void main(String[] args) {
		 DemoPack obj=new  DemoPack();
		 obj.accept();

	}

}
