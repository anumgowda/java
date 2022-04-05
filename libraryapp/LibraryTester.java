package com.xworkz.libraryapp;

import java.util.Scanner;

import com.xworkz.libraryapp.dto.BooksDTO;
import com.xworkz.libraryapp.library.Library;

public class LibraryTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a size");
		int size=sc.nextInt();
		
		Library library=new Library(size);
		
		for(int i=0;i<size;i++) {
			
			BooksDTO dto=new BooksDTO();
			
			System.out.println("enter book Id");
			dto.setBookId(sc.nextInt());
			
			System.out.println("enter book name");
			dto.setBookName(sc.next());
			
			System.out.println("enter author name");
			dto.setAutherName(sc.next());
			
			System.out.println("enter book prize");
			dto.setPrize(sc.nextFloat());
			
			System.out.println("enter edition");
			dto.setEdition(sc.next());
			
			library.createBookDetails(dto);
		}
			library.getBooksDetails();
			library.updateBookNameById(sc.next(), sc.nextInt());
			library.deleteBookByName(sc.next());
			
		}
}
	


