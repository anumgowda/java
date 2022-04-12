package com.xworkz.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collection.dto.YouTubeDTO;

public class YouTubeTester {
public static void main(String[] args) {
	Set youtube=new TreeSet();
	youtube.add(new YouTubeDTO(1,"java"));
	youtube.add(new YouTubeDTO(1,"SQL"));
	youtube.add(new YouTubeDTO(1,"HTML"));
	for(Object obj:youtube) {
		System.out.println(obj);
	}

	
}
}
