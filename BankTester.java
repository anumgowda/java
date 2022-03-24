package com.xwork.bankapp;

public class BankTester {
	public static void main(String[] args) {
		SbiBankImpl bank=new SbiBankImpl();
		bank.swipe();
		
		CanaraBankImpl cbank=new CanaraBankImpl();
		cbank.swipe();
		
		HdfcBankImpl hbank=new HdfcBankImpl();
				hbank.swipe();
	}
	
	
	

}

