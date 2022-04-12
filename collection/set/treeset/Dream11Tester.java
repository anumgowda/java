package com.xworkz.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.dto.Dream11DTO;

public class Dream11Tester {
	public static void main(String[] args) {
		Set dream=new TreeSet();
		dream.add(new Dream11DTO(1,"A"));
		dream.add(new Dream11DTO(5,"B"));
		dream.add(new Dream11DTO(9,"C"));
		for(Object obj:dream)
		{
			System.out.println(obj);
		}

	}

}
