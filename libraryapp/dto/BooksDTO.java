package com.xworkz.libraryapp.dto;

public class BooksDTO {
	 private int bookId;
	private String bookName;
	private String autherName;
	 private float prize;
	 private String edition;
	 
	 public BooksDTO() {
	 }
	 public int getBookId() {	
			return bookId;
		}
		
	 public String getBookName() {
		return bookName;
	}
	 public String getAutherName() {
		return autherName;
	}
	 public float getPrize() {
		return prize;
	}
	 public String getEdition() {
		return edition;
	}
	 public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	 public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	 public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	  public void setPrize(float prize) {
		this.prize = prize;
	}
	  public void setEdition(String edition) {
		this.edition = edition;
	}
	@Override
	public String toString() {
		return "BooksDTO [bookId=" + bookId + ", bookName=" + bookName + ", autherName=" + autherName + ", prize="
				+ prize + ", edition=" + edition + "]";
	}
	
	  
	

}
