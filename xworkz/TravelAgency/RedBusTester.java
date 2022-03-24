package com.xworkz.TravelAgency;

import com.xworkz.RedBusContract;

public class RedBusTester {
	public static void main(String[] args) {
		RedBusContract busContract=new SrsImplementation();
		TravelAgency agency=new TravelAgency(busContract);
		agency.booking(23);
		
	}

}
