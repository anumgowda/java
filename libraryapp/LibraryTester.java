package com.xworkz.libraryapp;

import java.util.Scanner;


import com.xworkz.libraryapp.dto.BooksDTO;
import com.xworkz.libraryapp.library.Library;
import com.xworkz.libraryapp.library.LibraryImpl;

public class LibraryTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a size");
		int size=sc.nextInt();
		
		Library library=new LibraryImpl(size);
		
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
		String text=null;
		do {
			System.out.println("enter 1 to get a books details");
			System.out.println("enter 2 to update a book details");
			System.out.println("enter 3 to delete a book datails by book name");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch (choice) {
			 
			case 1:
				library.getBooksDetails( );
				//if(books !=null) {
				//	System.out.println("Books details are:" + books);
				//} else {
				//	System.out.println("no books found");
			//	}
				break;
			case 2:System.out.println("enter book Id to update book name...");
				library.updateEditionByAuthor(sc.next(),sc.next());
				break;
			case 3:System.out.println("enter book name to be deleted..");
				library.deleteBookByName(sc.next());
				break;
		   default:
			   System.out.println("enter a correct choice number");
			}
		 System.out.println("do u want to continue yes/no") ;
		  text=sc.next();
		}while(text.equalsIgnoreCase("Yes"));
			
		
			
		}
}
	


