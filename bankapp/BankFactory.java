package com.xwork.bankapp;

public class BankFactory {
public static Atm getBank(String type) {
	if(type.equalsIgnoreCase("Sbibank")){
		return new SbiBankImpl();
	}
	else if(type.equalsIgnoreCase("CanaraBank")) {
		return new CanaraBankImpl();
		
	}
	else if(type.equalsIgnoreCase("hdfcbank")) {
		return new HdfcBankImpl();
		
	}
	else {
		System.out.println("invaliud atn card");
	}
	return null;
}
}
