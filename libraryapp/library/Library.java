package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.dto.BooksDTO;

public class Library {
	public BooksDTO books[];
	int index;
	
	
	
public Library(int size) {
	books=new BooksDTO[size];
		// TODO Auto-generated constructor stub
	}

public boolean createBookDetails(BooksDTO dto) {
	System.out.println("invoking craeteBookDetails() method");
	boolean BooksAdded=false;
	if(dto !=null) {
		books[index++]=dto;
		BooksAdded=true;
	}
	else {
		System.out.println("no books found");
	}
	System.out.println("end of createBookDetails() method");
	return BooksAdded;
}


public void getBooksDetails() {
	System.out.println("inside getBooksDEtails().....fetching the data");
	for(int i=0;i<books.length;i++) {
		System.out.println(books[i]);
	}
	System.out.println("end of getBooksDetails() method");
}


public boolean updateBookNameById(String Bname,int Id) {
	System.out.println(" updateBookNameById() methos is invoking");
	System.out.println("1st args:BookName"+ Bname);
	System.out.println("2nd args:BookId" + Id);
	boolean isBookNameUpadated=false;
	for(int i=0;i<books.length;i++) {
		if(books[i].getBookId() == Id) {
			isBookNameUpadated=true;
			System.out.println(books[i]);
			
		}
		else {
			System.out.println("Bookname is not updated ,give correct id ....");
		}
		return isBookNameUpadated;
	}
	return false;
}


public boolean deleteBookByName(String Bname) {
	System.out.println("deleteBookByName() method is invoking");
	boolean isDeleted=false;
	for(int i=0;i<books.length;i++) {
		if(books[i].getBookName().equals(Bname)) {
			System.out.println("book name is deleted successfully");
			return true;
		}
		else {
			System.out.println("book name is not deleted, give a correct book name...");
		
		}
		return isDeleted ;
	}
	return false;
}
}
