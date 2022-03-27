package com.xworkz.exception;

public class ArrayExceptions {
	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'd', 'f', 'e' };
		// char [] ch=new char[6];
		
		System.out.println("method started");
		int count=0;
		for(int i:ch){
			count++;
		}
		System.out.println(count);		
		try {
			ch[0] = 'a';
			ch[1] = 'd';
			ch[2] = 'g';
			ch[3] = 't';
			ch[4] = 'r';
			ch[5] = 'w';
			int i;
			for (i = 0; i <= ch.length; i++) {
				System.out.println(ch[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("can't add more elements in this array");
			

		}
		
			
		}
		
		
		
	}


