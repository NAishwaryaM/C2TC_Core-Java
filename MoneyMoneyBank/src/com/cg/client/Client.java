package com.cg.client;

import com.cg.frameworkapplication.MMBankFactory;
import com.cg.frameworkapplication.MMCurrentAcc;
import com.cg.frameworkapplication.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {

		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(3000,"SAVING",40000,true);
		CurrentAcc ca=new MMCurrentAcc(3000,"Savings",50000,5000);
		sa.withdraw(sa.getAccBal());
		ca.withdraw(ca.getCreditLimit());

	}

}

