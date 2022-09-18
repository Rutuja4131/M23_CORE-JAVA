package com.cg.Framework;

public abstract class Bank_Factory {

		public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);
		public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);
}
