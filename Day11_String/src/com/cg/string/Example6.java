package com.cg.string;
import java.util.StringTokenizer; 

public class Example6 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Lets try this");  
	    System.out.println(st.nextToken());  
	    System.out.println(st.nextToken()); // it taking 2 words only

	}

}
