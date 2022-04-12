package com.xworkz.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.dto.DvdDTO;

public class DvdTester {
public static void main(String[] args) {
	Set dvd=new TreeSet();
	dvd.add(new DvdDTO(1,"MNO"));
	dvd.add(new DvdDTO(1,"xyz"));
	dvd.add(new DvdDTO(1,"ABC"));
	for(Object obj:dvd) {
		System.out.println(obj);
	}
	
}
}
