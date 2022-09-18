package com.cg.client;
import com.cg.Application.*;
import com.cg.Framework.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Factory b = new MMBankFactory();
		SavingAcc s = b.getNewSavingAcc(101, "Saving", 50000, true);
		CurrentAcc c = b.getNewCurrentAcc(102, "Current", 3000, 500);

		System.out.println(s);//s.toString();
		s.withdraw(5000);
		System.out.println(s);
		
		System.out.println(c);
		c.withdraw(2000);
		System.out.println(c);
		
	}

}
