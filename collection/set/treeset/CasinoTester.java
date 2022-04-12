package com.xworkz.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.dto.CasinoDTO;

public class CasinoTester {
	public static void main(String[] args) {
		Set casino=new TreeSet();
		casino.add(new CasinoDTO(1,"anu"));
		casino.add(new CasinoDTO(5,"sudha"));
		casino.add(new CasinoDTO(3,"hima"));
		for(Object object:casino) {
			System.out.println(object);
		}
	}

}
