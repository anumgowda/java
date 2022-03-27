package com.xworkz.exception;

public class Exception {
	public static void main(String[] args) {
		System.out.println("main method started");
		try {
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=5;
		a[3]=6;
		a[4]=0;
		a[5]=8;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("cannot add more elements");
	}
try 
{
	String st=null;
	String str="null";
	System.out.println(st.equals(str));
}catch(NullPointerException a) {
	
	System.out.println("gubee...u can't access null data");
	a.printStackTrace();            // this method provides the exact name of exception
}

	 
	try {
		
String s[]=new String[8];
s[9]="anu";
System.out.println(s.length);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("can't add ");
		
	}
	System.out.println("main method ended");
}}
