package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.dto.BooksDTO;

public interface Library {
	

public boolean createBookDetails(BooksDTO dto);

public void getBooksDetails();

public boolean updateEditionByAuthor(String authorName,String bookEdition);
public boolean deleteBookByName(String Bname) ;


}
