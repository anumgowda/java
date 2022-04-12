package com.xworkz.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.dto.PaintDTO;

public class PaintTester {
	public static void main(String[] args) {
		Set paint=new TreeSet();
		paint.add(new PaintDTO(8,"Black"));
		paint.add(new PaintDTO(3,"pink"));
		paint.add(new PaintDTO(6,"white"));
		paint.add(new PaintDTO(9,"purple"));
		paint.add(new PaintDTO(4,"Blue"));
		for(Object obj:paint) {
			System.out.println(obj);
		}
		

	}

}
