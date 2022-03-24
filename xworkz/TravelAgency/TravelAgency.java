package com.xworkz.TravelAgency;

import com.xworkz.RedBusContract;

public class TravelAgency  {
	RedBusContract redBusContract;
	static String name="sri shrishial travel agency";
	public TravelAgency(RedBusContract redBusContract) {
		super();
		this.redBusContract=redBusContract;
	}
public boolean booking(int noOfBooking) {
	boolean booking=false;
	System.out.println("inside booking()");
	boolean warrenty= redBusContract.warrenty();
	if(warrenty) {
		System.out.println("checked warrenty...please proceed  for booking");
if(noOfBooking <=redBusContract.minBooking()) {
	System.out.println("booking succesful");
	booking=true;
}
else {
	System.out.println("cannot proceed booking ....no of booking exceeded");
}
System.out.println("outside booking()");
	}
	return booking;
}
}
