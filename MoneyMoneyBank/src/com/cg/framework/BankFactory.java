package com.cg.framework;

public abstract class BankFactory {

	public abstract SavingAcc 
	getNewSavingAccount(int accNo, String accNm,float accBal,boolean isSalaried);
	public abstract CurrentAcc 
	getNewCurrentAccount(int accNo,String accNm,float accBal,boolean creditlimit);
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		
		return null;
	}
}

