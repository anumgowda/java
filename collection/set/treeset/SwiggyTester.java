package com.xworkz.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.dto.SwiggyDTO;

public class SwiggyTester {
	public static void main(String[] args) {
		Set swiggy=new TreeSet();
		swiggy.add(new SwiggyDTO(1,"Biryani"));
		swiggy.add(new SwiggyDTO(9,"kabab"));
		swiggy.add(new SwiggyDTO(6,"Chiken fry "));
		for(Object obj:swiggy) {
			System.out.println(obj);
		}
	}

}
