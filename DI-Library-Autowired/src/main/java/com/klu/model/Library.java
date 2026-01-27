package com.klu.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Library {
	 private int libraryId;
	    private String libraryName;
	    private Book book;	
	     private Library() {
	    	 this.libraryId=1;
	    	 this.libraryName="Book Bound";
	     }
	     @Autowired
	     public void setBook(Book book) {
	    	 this.book=book;
	     }
	     public void displayDetails() {
	    	 System.out.println("LibraryId: " +libraryId );
	    	 System.out.println("Library Name: " + libraryName);
	    	 System.out.println(book);
	     }
}
