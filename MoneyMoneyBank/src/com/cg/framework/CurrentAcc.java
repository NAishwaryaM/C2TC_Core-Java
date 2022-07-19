package com.cg.framework;

public abstract class CurrentAcc extends BankAcc
    {
	private final float creditLimit=1000;	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal);
	}
	
	public void withdraw(float creditLimit)
	{
    System.out.println("creditLimit:"+creditLimit);
    }
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	public float getCreditLimit()
	{
		return creditLimit;
     }
	}