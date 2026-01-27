package com.klu.model;
import org.springframework.stereotype.Component;
@Component
public class Book {
	 private String isbn;
	    private String title;
	    private String author;
	    private double price;
	    public Book() {
	    	this.isbn="isbin-16";
	    	this.title="RRR";
	    	this.author="RajaMouli";
	    	this.price=600;
	    }
	    public String getisbn() {
	    	return isbn;
	    }
	    public String getauthor() {
	    	return author;
	    }
	    public String gettitle() {
	    	return title;
	    }
	    public double getprice() {
	    	return price;
	    }
	      @Override
	    public String toString() {
	        return "Book Details:\n"
	             + "ISBN   : " + isbn + "\n"
	             + "Title  : " + title + "\n"
	             + "Author : " + author + "\n"
	             + "Price  : " + price;
	    }



	    
}
