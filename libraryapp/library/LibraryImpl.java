package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.dto.BooksDTO;

public class LibraryImpl implements Library{
	BooksDTO books[];
	int index;
	
	public LibraryImpl(int size) {
		books=new BooksDTO[size];
	}
	@Override
	public boolean createBookDetails(BooksDTO dto) {
		System.out.println("invoking createBokkDetails() method..");
		boolean bookAdded=false;
	try {
		if(dto !=null) {
	
			books[index++]=dto;
			bookAdded=true;
			
			
		}
		else {
			System.out.println("no book found");
		}} catch(Exception e) {}
		System.out.println("end of createBookDetails() method..");
		return bookAdded;
	}
	
	@Override
	public void getBooksDetails() {
		try{
			for(int i=0;i<books.length;i++) {
		
			System.out.println(books[i]);
		}}catch(Exception e) {
			
		}
		
	}
	@Override
	public boolean updateEditionByAuthor(String authorName,String bookEdition) {

	boolean isBookEditionUpdated=false;
	try{
		for(int i=0;i<books.length;i++) {
	
		if(books[i].getAutherName().equals(authorName)) {
			books[i].setEdition(bookEdition);
			isBookEditionUpdated=true;
			System.out.println(books[i]);
		}
		else {
			System.out.println("book edition is not updated..");
		}}
	}catch(Exception e) {}
		return isBookEditionUpdated;
	}
@Override
	public boolean deleteBookByName(String bookName)
	{
		boolean delete=false;
		try {
			for(int i=0;i<books.length;i++) {
				if(books[i].getBookName().equals(bookName)) {
					books[i]=null;
					System.out.println("books details are deleted");
					delete=true;
					
				}else
				{
					System.out.println("book details are not deleted");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return delete;
	}
	
}
