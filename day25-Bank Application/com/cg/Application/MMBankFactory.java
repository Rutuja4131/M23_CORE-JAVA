package com.cg.Application;
import com.cg.Framework.*;

public class MMBankFactory extends Bank_Factory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		return new MMSavingAcc(accNo, accNm, accBal, isSalaried);
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		return new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
	}
	
}
